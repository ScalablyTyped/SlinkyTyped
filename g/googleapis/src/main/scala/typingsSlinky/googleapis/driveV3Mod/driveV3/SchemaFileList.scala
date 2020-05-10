package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of files.
  */
@js.native
trait SchemaFileList extends js.Object {
  /**
    * The list of files. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.native
  /**
    * Whether the search process was incomplete. If true, then some search
    * results may be missing, since all documents were not searched. This may
    * occur when searching multiple Team Drives with the
    * &quot;user,allTeamDrives&quot; corpora, but all corpora could not be
    * searched. When this happens, it is suggested that clients narrow their
    * query by choosing a different corpus such as &quot;user&quot; or
    * &quot;teamDrive&quot;.
    */
  var incompleteSearch: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#fileList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of files. This will be absent if the end
    * of the files list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from
    * the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaFileList {
  @scala.inline
  def apply(): SchemaFileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileList]
  }
  @scala.inline
  implicit class SchemaFileListOps[Self <: SchemaFileList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[SchemaFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompleteSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompleteSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

