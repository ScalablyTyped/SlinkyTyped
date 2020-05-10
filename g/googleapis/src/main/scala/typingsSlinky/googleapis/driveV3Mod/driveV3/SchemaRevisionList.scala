package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of revisions of a file.
  */
@js.native
trait SchemaRevisionList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revisionList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of revisions. This will be absent if the
    * end of the revisions list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var revisions: js.UndefOr[js.Array[SchemaRevision]] = js.native
}

object SchemaRevisionList {
  @scala.inline
  def apply(): SchemaRevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionList]
  }
  @scala.inline
  implicit class SchemaRevisionListOps[Self <: SchemaRevisionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRevisions(value: js.Array[SchemaRevision]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisions")(js.undefined)
        ret
    }
  }
  
}

