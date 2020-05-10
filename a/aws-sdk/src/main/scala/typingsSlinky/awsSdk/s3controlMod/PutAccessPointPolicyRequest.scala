package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccessPointPolicyRequest extends js.Object {
  /**
    * The AWS account ID for owner of the bucket associated with the specified access point.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the access point that you want to associate with the specified policy.
    */
  var Name: AccessPointName = js.native
  /**
    * The policy that you want to apply to the specified access point. For more information about access point policies, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Policy: typingsSlinky.awsSdk.s3controlMod.Policy = js.native
}

object PutAccessPointPolicyRequest {
  @scala.inline
  def apply(AccountId: AccountId, Name: AccessPointName, Policy: Policy): PutAccessPointPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessPointPolicyRequest]
  }
  @scala.inline
  implicit class PutAccessPointPolicyRequestOps[Self <: PutAccessPointPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AccessPointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: Policy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

