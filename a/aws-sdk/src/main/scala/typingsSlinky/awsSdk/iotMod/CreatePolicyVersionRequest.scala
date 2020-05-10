package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionRequest extends js.Object {
  /**
    * The JSON document that describes the policy. Minimum length of 1. Maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument = js.native
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * Specifies whether the policy version is set as the default. When this parameter is true, the new policy version becomes the operative version (that is, the version that is in effect for the certificates to which the policy is attached).
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.native
}

object CreatePolicyVersionRequest {
  @scala.inline
  def apply(policyDocument: PolicyDocument, policyName: PolicyName): CreatePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyVersionRequest]
  }
  @scala.inline
  implicit class CreatePolicyVersionRequestOps[Self <: CreatePolicyVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDocument(value: PolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAsDefault(value: SetAsDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(js.undefined)
        ret
    }
  }
  
}

