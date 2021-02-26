package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.RulesConfigurationType
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.UnmarshalledRulesConfigurationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRoleMappingMod {
  
  @js.native
  trait RoleMapping extends StObject {
    
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
    implicit class RoleMappingMutableBuilder[Self <: RoleMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmbiguousRoleResolution(value: AuthenticatedRole | Deny | String): Self = StObject.set(x, "AmbiguousRoleResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "AmbiguousRoleResolution", js.undefined)
      
      @scala.inline
      def setRulesConfiguration(value: RulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
      
      @scala.inline
      def setType(value: Token | Rules | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class UnmarshalledRoleMappingMutableBuilder[Self <: UnmarshalledRoleMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRulesConfiguration(value: UnmarshalledRulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
    }
  }
}
