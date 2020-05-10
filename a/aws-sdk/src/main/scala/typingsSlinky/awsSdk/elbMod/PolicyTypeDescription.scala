package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTypeDescription extends js.Object {
  /**
    * A description of the policy type.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elbMod.Description] = js.native
  /**
    * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
    */
  var PolicyAttributeTypeDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyAttributeTypeDescriptions] = js.native
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeName] = js.native
}

object PolicyTypeDescription {
  @scala.inline
  def apply(): PolicyTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeDescription]
  }
  @scala.inline
  implicit class PolicyTypeDescriptionOps[Self <: PolicyTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyAttributeTypeDescriptions(value: PolicyAttributeTypeDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributeTypeDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyAttributeTypeDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyAttributeTypeDescriptions")(js.undefined)
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

