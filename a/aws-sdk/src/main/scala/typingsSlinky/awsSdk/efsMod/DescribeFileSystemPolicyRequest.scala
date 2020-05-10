package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFileSystemPolicyRequest extends js.Object {
  /**
    * Specifies which EFS file system to retrieve the FileSystemPolicy for.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
}

object DescribeFileSystemPolicyRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFileSystemPolicyRequest]
  }
  @scala.inline
  implicit class DescribeFileSystemPolicyRequestOps[Self <: DescribeFileSystemPolicyRequest] (val x: Self) extends AnyVal {
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

