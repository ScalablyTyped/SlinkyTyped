package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyVersionResponse extends js.Object {
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object CreatePolicyVersionResponse {
  @scala.inline
  def apply(): CreatePolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyVersionResponse]
  }
  @scala.inline
  implicit class CreatePolicyVersionResponseOps[Self <: CreatePolicyVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefaultVersion(value: IsDefaultVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyArn(value: PolicyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDocument(value: PolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyVersionId(value: PolicyVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyVersionId")(js.undefined)
        ret
    }
  }
  
}

