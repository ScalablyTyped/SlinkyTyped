package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.RulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleMapping extends js.Object {
  /**
    * <p>If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.</p> <p>Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches for the <code>Token</code> type.</p>
    */
  var AmbiguousRoleResolution: js.UndefOr[AuthenticatedRole | Deny | String] = js.native
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.native
  /**
    * <p>The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.</p>
    */
  var Type: Token | Rules | String = js.native
}

object RoleMapping {
  @scala.inline
  def apply(Type: Token | Rules | String): RoleMapping = {
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
    def withType(value: Token | Rules | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmbiguousRoleResolution(value: AuthenticatedRole | Deny | String): Self = {
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

