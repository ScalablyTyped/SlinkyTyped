package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolRoleAttachmentRoleMapping extends StObject {
  
  /**
    * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
    */
  var ambiguousRoleResolution: js.UndefOr[Input[String]] = js.native
  
  /**
    * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var identityProvider: Input[String] = js.native
  
  /**
    * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var mappingRules: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]]]] = js.native
  
  /**
    * The role mapping type.
    */
  var `type`: Input[String] = js.native
}
object IdentityPoolRoleAttachmentRoleMapping {
  
  @scala.inline
  def apply(identityProvider: Input[String], `type`: Input[String]): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
  
  @scala.inline
  implicit class IdentityPoolRoleAttachmentRoleMappingMutableBuilder[Self <: IdentityPoolRoleAttachmentRoleMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbiguousRoleResolution(value: Input[String]): Self = StObject.set(x, "ambiguousRoleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "ambiguousRoleResolution", js.undefined)
    
    @scala.inline
    def setIdentityProvider(value: Input[String]): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingRules(value: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]]]): Self = StObject.set(x, "mappingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingRulesUndefined: Self = StObject.set(x, "mappingRules", js.undefined)
    
    @scala.inline
    def setMappingRulesVarargs(value: Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]*): Self = StObject.set(x, "mappingRules", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
