package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevertFolderResponse extends js.Object {
  /**
    * Folder as it appears in the latest container version since the last workspace synchronization operation. If no folder is present, that means the folder
    * was deleted in the latest container version.
    */
  var folder: js.UndefOr[Folder] = js.native
}

object RevertFolderResponse {
  @scala.inline
  def apply(): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertFolderResponse]
  }
  @scala.inline
  implicit class RevertFolderResponseOps[Self <: RevertFolderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
  }
  
}

