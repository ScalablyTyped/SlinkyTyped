package typingsSlinky.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDefinitionReference extends js.Object {
  /**
    * Required if a parameter is used in policy rule.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The ID of the policy definition or policy set definition.
    */
  var policyDefinitionId: js.UndefOr[String] = js.native
}

object PolicyDefinitionReference {
  @scala.inline
  def apply(): PolicyDefinitionReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDefinitionReference]
  }
  @scala.inline
  implicit class PolicyDefinitionReferenceOps[Self <: PolicyDefinitionReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDefinitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDefinitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDefinitionId")(js.undefined)
        ret
    }
  }
  
}

