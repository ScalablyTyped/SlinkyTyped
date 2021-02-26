package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.UnmarshalledRoleMapping
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetIdentityPoolRolesOutputMod {
  
  @js.native
  trait GetIdentityPoolRolesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.native
    
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a String-to-<a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[UnmarshalledRoleMapping]] = js.native
    
    /**
      * <p>The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.</p>
      */
    var Roles: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetIdentityPoolRolesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetIdentityPoolRolesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIdentityPoolRolesOutput]
    }
    
    @scala.inline
    implicit class GetIdentityPoolRolesOutputMutableBuilder[Self <: GetIdentityPoolRolesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
      
      @scala.inline
      def setRoleMappings(value: StringDictionary[UnmarshalledRoleMapping]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
      
      @scala.inline
      def setRoles(value: StringDictionary[String]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    }
  }
}
