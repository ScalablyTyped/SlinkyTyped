package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemPolicyDescription extends js.Object {
  /**
    * Specifies the EFS file system to which the FileSystemPolicy applies.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * The JSON formatted FileSystemPolicy for the EFS file system.
    */
  var Policy: js.UndefOr[typingsSlinky.awsSdk.efsMod.Policy] = js.native
}

object FileSystemPolicyDescription {
  @scala.inline
  def apply(): FileSystemPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemPolicyDescription]
  }
  @scala.inline
  implicit class FileSystemPolicyDescriptionOps[Self <: FileSystemPolicyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
  }
  
}

