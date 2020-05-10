package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.UnmarshalledRulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRoleMapping extends RoleMapping {
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  @JSName("RulesConfiguration")
  var RulesConfiguration_UnmarshalledRoleMapping: js.UndefOr[UnmarshalledRulesConfigurationType] = js.native
}

object UnmarshalledRoleMapping {
  @scala.inline
  def apply(Type: Token | Rules | String): UnmarshalledRoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRoleMapping]
  }
  @scala.inline
  implicit class UnmarshalledRoleMappingOps[Self <: UnmarshalledRoleMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRulesConfiguration(value: UnmarshalledRulesConfigurationType): Self = {
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

