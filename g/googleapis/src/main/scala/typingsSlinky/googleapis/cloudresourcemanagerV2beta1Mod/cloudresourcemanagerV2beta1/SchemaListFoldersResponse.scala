package typingsSlinky.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListFolders response message.
  */
@js.native
trait SchemaListFoldersResponse extends js.Object {
  /**
    * A possibly paginated list of Folders that are direct descendants of the
    * specified parent resource.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
  /**
    * A pagination token returned from a previous call to `ListFolders` that
    * indicates from where listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFoldersResponse {
  @scala.inline
  def apply(): SchemaListFoldersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFoldersResponse]
  }
  @scala.inline
  implicit class SchemaListFoldersResponseOps[Self <: SchemaListFoldersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolders(value: js.Array[SchemaFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(js.undefined)
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

