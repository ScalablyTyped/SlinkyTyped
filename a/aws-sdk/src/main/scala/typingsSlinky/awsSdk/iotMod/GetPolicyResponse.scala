package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResponse extends js.Object {
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The default policy version ID.
    */
  var defaultVersionId: js.UndefOr[PolicyVersionId] = js.native
  /**
    * The generation ID of the policy.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * The date the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}

object GetPolicyResponse {
  @scala.inline
  def apply(): GetPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyResponse]
  }
  @scala.inline
  implicit class GetPolicyResponseOps[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVersionId(value: PolicyVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerationId(value: GenerationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
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
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
  }
  
}

