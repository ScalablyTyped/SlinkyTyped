package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Folders Response.
  */
@js.native
trait SchemaListFoldersResponse extends js.Object {
  /**
    * All GTM Folders of a GTM Container.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.native
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
  }
  
}

