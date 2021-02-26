package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.RoleMapping
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetIdentityPoolRolesInputMod {
  
  @js.native
  trait SetIdentityPoolRolesInput extends InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.native
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String = js.native
    
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p> <p>Up to 25 rules can be specified per identity provider.</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[RoleMapping] | (js.Iterable[js.Tuple2[String, RoleMapping]])] = js.native
    
    /**
      * <p>The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.</p>
      */
    var Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = js.native
  }
  object SetIdentityPoolRolesInput {
    
    @scala.inline
    def apply(IdentityPoolId: String, Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): SetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIdentityPoolRolesInput]
    }
    
    @scala.inline
    implicit class SetIdentityPoolRolesInputMutableBuilder[Self <: SetIdentityPoolRolesInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappings(value: StringDictionary[RoleMapping] | (js.Iterable[js.Tuple2[String, RoleMapping]])): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappingsIterable(value: js.Iterable[js.Tuple2[String, RoleMapping]]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
      
      @scala.inline
      def setRoles(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    }
  }
}
