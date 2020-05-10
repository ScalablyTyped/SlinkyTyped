package typingsSlinky.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of changes for a user.
  */
@js.native
trait SchemaChangeList extends js.Object {
  /**
    * The list of changes. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var changes: js.UndefOr[js.Array[SchemaChange]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#changeList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The starting page token for future changes. This will be present only if
    * the end of the current changes list has been reached.
    */
  var newStartPageToken: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of changes. This will be absent if the
    * end of the changes list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaChangeList {
  @scala.inline
  def apply(): SchemaChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeList]
  }
  @scala.inline
  implicit class SchemaChangeListOps[Self <: SchemaChangeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[SchemaChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.undefined)
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
    def withNewStartPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStartPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewStartPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStartPageToken")(js.undefined)
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

