package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileSystemPolicyRequest extends js.Object {
  /**
    * (Optional) A flag to indicate whether to bypass the FileSystemPolicy lockout safety check. The policy lockout safety check determines whether the policy in the request will prevent the principal making the request will be locked out from making future PutFileSystemPolicy requests on the file system. Set BypassPolicyLockoutSafetyCheck to True only when you intend to prevent the principal that is making the request from making a subsequent PutFileSystemPolicy request on the file system. The default value is False. 
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[typingsSlinky.awsSdk.efsMod.BypassPolicyLockoutSafetyCheck] = js.native
  /**
    * The ID of the EFS file system that you want to create or update the FileSystemPolicy for.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * The FileSystemPolicy that you're creating. Accepts a JSON formatted policy definition. To find out more about the elements that make up a file system policy, see EFS Resource-based Policies. 
    */
  var Policy: typingsSlinky.awsSdk.efsMod.Policy = js.native
}

object PutFileSystemPolicyRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Policy: Policy): PutFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileSystemPolicyRequest]
  }
  @scala.inline
  implicit class PutFileSystemPolicyRequestOps[Self <: PutFileSystemPolicyRequest] (val x: Self) extends AnyVal {
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
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBypassPolicyLockoutSafetyCheck(value: BypassPolicyLockoutSafetyCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BypassPolicyLockoutSafetyCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassPolicyLockoutSafetyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BypassPolicyLockoutSafetyCheck")(js.undefined)
        ret
    }
  }
  
}

