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
}

