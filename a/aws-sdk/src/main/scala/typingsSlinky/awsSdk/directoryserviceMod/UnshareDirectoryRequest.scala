package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareDirectoryRequest extends js.Object {
  /**
    * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * Identifier for the directory consumer account with whom the directory has to be unshared.
    */
  var UnshareTarget: typingsSlinky.awsSdk.directoryserviceMod.UnshareTarget = js.native
}

object UnshareDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, UnshareTarget: UnshareTarget): UnshareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UnshareTarget = UnshareTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareDirectoryRequest]
  }
  @scala.inline
  implicit class UnshareDirectoryRequestOps[Self <: UnshareDirectoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnshareTarget(value: UnshareTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnshareTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

