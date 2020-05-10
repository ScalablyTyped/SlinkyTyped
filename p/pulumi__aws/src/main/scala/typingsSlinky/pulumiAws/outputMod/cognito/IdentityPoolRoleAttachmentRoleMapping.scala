package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentRoleMapping extends js.Object {
  /**
    * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
    */
  var ambiguousRoleResolution: js.UndefOr[String] = js.native
  /**
    * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var identityProvider: String = js.native
  /**
    * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var mappingRules: js.UndefOr[js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule]] = js.native
  /**
    * The role mapping type.
    */
  var `type`: String = js.native
}

object IdentityPoolRoleAttachmentRoleMapping {
  @scala.inline
  def apply(identityProvider: String, `type`: String): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
  @scala.inline
  implicit class IdentityPoolRoleAttachmentRoleMappingOps[Self <: IdentityPoolRoleAttachmentRoleMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmbiguousRoleResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousRoleResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbiguousRoleResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousRoleResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMappingRules(value: js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingRules")(js.undefined)
        ret
    }
  }
  
}

