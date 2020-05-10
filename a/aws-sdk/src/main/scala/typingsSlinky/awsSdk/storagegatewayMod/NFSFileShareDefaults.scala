package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NFSFileShareDefaults extends js.Object {
  /**
    * The Unix directory mode in the form "nnnn". For example, "0666" represents the default access mode for all directories inside the file share. The default value is 0777.
    */
  var DirectoryMode: js.UndefOr[PermissionMode] = js.native
  /**
    * The Unix file mode in the form "nnnn". For example, "0666" represents the default file mode inside the file share. The default value is 0666. 
    */
  var FileMode: js.UndefOr[PermissionMode] = js.native
  /**
    * The default group ID for the file share (unless the files have another group ID specified). The default value is nfsnobody. 
    */
  var GroupId: js.UndefOr[PermissionId] = js.native
  /**
    * The default owner ID for files in the file share (unless the files have another owner ID specified). The default value is nfsnobody. 
    */
  var OwnerId: js.UndefOr[PermissionId] = js.native
}

object NFSFileShareDefaults {
  @scala.inline
  def apply(): NFSFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareDefaults]
  }
  @scala.inline
  implicit class NFSFileShareDefaultsOps[Self <: NFSFileShareDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryMode(value: PermissionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFileMode(value: PermissionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: PermissionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: PermissionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
  }
  
}

