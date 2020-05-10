package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultPolicyVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
  /**
    * The version of the policy to set as the default (operative) version. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var VersionId: policyVersionIdType = js.native
}

object SetDefaultPolicyVersionRequest {
  @scala.inline
  def apply(PolicyArn: arnType, VersionId: policyVersionIdType): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
  @scala.inline
  implicit class SetDefaultPolicyVersionRequestOps[Self <: SetDefaultPolicyVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionId(value: policyVersionIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

