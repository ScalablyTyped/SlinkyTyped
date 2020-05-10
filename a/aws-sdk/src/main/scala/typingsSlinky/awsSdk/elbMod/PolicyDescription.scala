package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDescription extends js.Object {
  /**
    * The policy attributes.
    */
  var PolicyAttributeDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyAttributeDescriptions] = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyName] = js.native
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeName] = js.native
}

object PolicyDescription {
  @scala.inline
  def apply(): PolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescription]
  }
  @scala.inline
  implicit class PolicyDescriptionOps[Self <: PolicyDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyAttributeDescriptions(value: PolicyAttributeDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributeDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyAttributeDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributeDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: PolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyTypeName(value: PolicyTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyTypeName")(js.undefined)
        ret
    }
  }
  
}

