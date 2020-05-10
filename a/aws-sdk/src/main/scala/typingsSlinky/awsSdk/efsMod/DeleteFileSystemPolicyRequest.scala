package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileSystemPolicyRequest extends js.Object {
  /**
    * Specifies the EFS file system for which to delete the FileSystemPolicy.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
}

object DeleteFileSystemPolicyRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DeleteFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemPolicyRequest]
  }
  @scala.inline
  implicit class DeleteFileSystemPolicyRequestOps[Self <: DeleteFileSystemPolicyRequest] (val x: Self) extends AnyVal {
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
  }
  
}

