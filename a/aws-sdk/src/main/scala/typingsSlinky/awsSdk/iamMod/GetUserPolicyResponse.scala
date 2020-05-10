package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPolicyResponse extends js.Object {
  /**
    * The policy document. IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM.
    */
  var PolicyDocument: policyDocumentType = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: policyNameType = js.native
  /**
    * The user the policy is associated with.
    */
  var UserName: existingUserNameType = js.native
}

object GetUserPolicyResponse {
  @scala.inline
  def apply(PolicyDocument: policyDocumentType, PolicyName: policyNameType, UserName: existingUserNameType): GetUserPolicyResponse = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPolicyResponse]
  }
  @scala.inline
  implicit class GetUserPolicyResponseOps[Self <: GetUserPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDocument(value: policyDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: policyNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: existingUserNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

