package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleMapping extends js.Object {
  /**
    * If you specify Token or Rules as the Type, AmbiguousRoleResolution is required. Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type.
    */
  var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.native
  /**
    * The rules to be used for mapping users to roles. If you specify Rules as the role mapping type, RulesConfiguration is required.
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.native
  /**
    * The role mapping type. Token will use cognito:roles and cognito:preferred_role claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.
    */
  var Type: RoleMappingType = js.native
}

object RoleMapping {
  @scala.inline
  def apply(Type: RoleMappingType): RoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleMapping]
  }
  @scala.inline
  implicit class RoleMappingOps[Self <: RoleMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: RoleMappingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmbiguousRoleResolution(value: AmbiguousRoleResolutionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmbiguousRoleResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbiguousRoleResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmbiguousRoleResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesConfiguration(value: RulesConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RulesConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulesConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RulesConfiguration")(js.undefined)
        ret
    }
  }
  
}

