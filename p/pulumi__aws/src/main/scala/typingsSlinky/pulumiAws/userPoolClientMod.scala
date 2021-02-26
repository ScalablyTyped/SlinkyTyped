package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.cognito.UserPoolClientAnalyticsConfiguration
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPoolClientMod {
  
  @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient")
  @js.native
  class UserPoolClient protected () extends CustomResource {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolClientArgs) = this()
    def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: Output_[js.UndefOr[UserPoolClientAnalyticsConfiguration]] = js.native
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The client secret of the user pool client.
      */
    val clientSecret: Output_[String] = js.native
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The name of the application client.
      */
    val name: Output_[String] = js.native
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: Output_[String] = js.native
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: Output_[String] = js.native
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object UserPoolClient {
    
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID]): UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): UserPoolClient = js.native
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): UserPoolClient = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cognito/userPoolClient", "UserPoolClient.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  @js.native
  trait UserPoolClientArgs extends StObject {
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]
      ] = js.native
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the application client.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: Input[String] = js.native
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object UserPoolClientArgs {
    
    @scala.inline
    def apply(userPoolId: Input[String]): UserPoolClientArgs = {
      val __obj = js.Dynamic.literal(userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPoolClientArgs]
    }
    
    @scala.inline
    implicit class UserPoolClientArgsMutableBuilder[Self <: UserPoolClientArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthFlows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthFlowsUndefined: Self = StObject.set(x, "allowedOauthFlows", js.undefined)
      
      @scala.inline
      def setAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthFlowsUserPoolClientUndefined: Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", js.undefined)
      
      @scala.inline
      def setAllowedOauthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthFlows", js.Array(value :_*))
      
      @scala.inline
      def setAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthScopesUndefined: Self = StObject.set(x, "allowedOauthScopes", js.undefined)
      
      @scala.inline
      def setAllowedOauthScopesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthScopes", js.Array(value :_*))
      
      @scala.inline
      def setAnalyticsConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]): Self = StObject.set(x, "analyticsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "analyticsConfiguration", js.undefined)
      
      @scala.inline
      def setCallbackUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "callbackUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUrlsUndefined: Self = StObject.set(x, "callbackUrls", js.undefined)
      
      @scala.inline
      def setCallbackUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "callbackUrls", js.Array(value :_*))
      
      @scala.inline
      def setDefaultRedirectUri(value: Input[String]): Self = StObject.set(x, "defaultRedirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRedirectUriUndefined: Self = StObject.set(x, "defaultRedirectUri", js.undefined)
      
      @scala.inline
      def setExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "explicitAuthFlows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "explicitAuthFlows", js.undefined)
      
      @scala.inline
      def setExplicitAuthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "explicitAuthFlows", js.Array(value :_*))
      
      @scala.inline
      def setGenerateSecret(value: Input[Boolean]): Self = StObject.set(x, "generateSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateSecretUndefined: Self = StObject.set(x, "generateSecret", js.undefined)
      
      @scala.inline
      def setLogoutUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logoutUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutUrlsUndefined: Self = StObject.set(x, "logoutUrls", js.undefined)
      
      @scala.inline
      def setLogoutUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "logoutUrls", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPreventUserExistenceErrors(value: Input[String]): Self = StObject.set(x, "preventUserExistenceErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "preventUserExistenceErrors", js.undefined)
      
      @scala.inline
      def setReadAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "readAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadAttributesUndefined: Self = StObject.set(x, "readAttributes", js.undefined)
      
      @scala.inline
      def setReadAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "readAttributes", js.Array(value :_*))
      
      @scala.inline
      def setRefreshTokenValidity(value: Input[Double]): Self = StObject.set(x, "refreshTokenValidity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenValidityUndefined: Self = StObject.set(x, "refreshTokenValidity", js.undefined)
      
      @scala.inline
      def setSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedIdentityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "supportedIdentityProviders", js.undefined)
      
      @scala.inline
      def setSupportedIdentityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "supportedIdentityProviders", js.Array(value :_*))
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "writeAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteAttributesUndefined: Self = StObject.set(x, "writeAttributes", js.undefined)
      
      @scala.inline
      def setWriteAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "writeAttributes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserPoolClientState extends StObject {
    
    /**
      * List of allowed OAuth flows (code, implicit, client_credentials).
      */
    val allowedOauthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Whether the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    val allowedOauthFlowsUserPoolClient: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * List of allowed OAuth scopes (phone, email, openid, profile, and aws.cognito.signin.user.admin).
      */
    val allowedOauthScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    val analyticsConfiguration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]
      ] = js.native
    
    /**
      * List of allowed callback URLs for the identity providers.
      */
    val callbackUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The client secret of the user pool client.
      */
    val clientSecret: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default redirect URI. Must be in the list of callback URLs.
      */
    val defaultRedirectUri: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of authentication flows (ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY,  USER_PASSWORD_AUTH, ALLOW_ADMIN_USER_PASSWORD_AUTH, ALLOW_CUSTOM_AUTH, ALLOW_USER_PASSWORD_AUTH, ALLOW_USER_SRP_AUTH, ALLOW_REFRESH_TOKEN_AUTH).
      */
    val explicitAuthFlows: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Should an application secret be generated.
      */
    val generateSecret: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * List of allowed logout URLs for the identity providers.
      */
    val logoutUrls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The name of the application client.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Choose which errors and responses are returned by Cognito APIs during authentication, account confirmation, and password recovery when the user does not exist in the user pool. When set to `ENABLED` and the user does not exist, authentication returns an error indicating either the username or password was incorrect, and account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to `LEGACY`, those APIs will return a `UserNotFoundException` exception if the user does not exist in the user pool.
      */
    val preventUserExistenceErrors: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of user pool attributes the application client can read from.
      */
    val readAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The time limit in days refresh tokens are valid for.
      */
    val refreshTokenValidity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * List of provider names for the identity providers that are supported on this client.
      */
    val supportedIdentityProviders: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The user pool the client belongs to.
      */
    val userPoolId: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of user pool attributes the application client can write to.
      */
    val writeAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object UserPoolClientState {
    
    @scala.inline
    def apply(): UserPoolClientState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolClientState]
    }
    
    @scala.inline
    implicit class UserPoolClientStateMutableBuilder[Self <: UserPoolClientState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedOauthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthFlows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthFlowsUndefined: Self = StObject.set(x, "allowedOauthFlows", js.undefined)
      
      @scala.inline
      def setAllowedOauthFlowsUserPoolClient(value: Input[Boolean]): Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthFlowsUserPoolClientUndefined: Self = StObject.set(x, "allowedOauthFlowsUserPoolClient", js.undefined)
      
      @scala.inline
      def setAllowedOauthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthFlows", js.Array(value :_*))
      
      @scala.inline
      def setAllowedOauthScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOauthScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedOauthScopesUndefined: Self = StObject.set(x, "allowedOauthScopes", js.undefined)
      
      @scala.inline
      def setAllowedOauthScopesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOauthScopes", js.Array(value :_*))
      
      @scala.inline
      def setAnalyticsConfiguration(value: Input[typingsSlinky.pulumiAws.inputMod.cognito.UserPoolClientAnalyticsConfiguration]): Self = StObject.set(x, "analyticsConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "analyticsConfiguration", js.undefined)
      
      @scala.inline
      def setCallbackUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "callbackUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUrlsUndefined: Self = StObject.set(x, "callbackUrls", js.undefined)
      
      @scala.inline
      def setCallbackUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "callbackUrls", js.Array(value :_*))
      
      @scala.inline
      def setClientSecret(value: Input[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setDefaultRedirectUri(value: Input[String]): Self = StObject.set(x, "defaultRedirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRedirectUriUndefined: Self = StObject.set(x, "defaultRedirectUri", js.undefined)
      
      @scala.inline
      def setExplicitAuthFlows(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "explicitAuthFlows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "explicitAuthFlows", js.undefined)
      
      @scala.inline
      def setExplicitAuthFlowsVarargs(value: Input[String]*): Self = StObject.set(x, "explicitAuthFlows", js.Array(value :_*))
      
      @scala.inline
      def setGenerateSecret(value: Input[Boolean]): Self = StObject.set(x, "generateSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateSecretUndefined: Self = StObject.set(x, "generateSecret", js.undefined)
      
      @scala.inline
      def setLogoutUrls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logoutUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutUrlsUndefined: Self = StObject.set(x, "logoutUrls", js.undefined)
      
      @scala.inline
      def setLogoutUrlsVarargs(value: Input[String]*): Self = StObject.set(x, "logoutUrls", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPreventUserExistenceErrors(value: Input[String]): Self = StObject.set(x, "preventUserExistenceErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "preventUserExistenceErrors", js.undefined)
      
      @scala.inline
      def setReadAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "readAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadAttributesUndefined: Self = StObject.set(x, "readAttributes", js.undefined)
      
      @scala.inline
      def setReadAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "readAttributes", js.Array(value :_*))
      
      @scala.inline
      def setRefreshTokenValidity(value: Input[Double]): Self = StObject.set(x, "refreshTokenValidity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshTokenValidityUndefined: Self = StObject.set(x, "refreshTokenValidity", js.undefined)
      
      @scala.inline
      def setSupportedIdentityProviders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "supportedIdentityProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "supportedIdentityProviders", js.undefined)
      
      @scala.inline
      def setSupportedIdentityProvidersVarargs(value: Input[String]*): Self = StObject.set(x, "supportedIdentityProviders", js.Array(value :_*))
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
      
      @scala.inline
      def setWriteAttributes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "writeAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteAttributesUndefined: Self = StObject.set(x, "writeAttributes", js.undefined)
      
      @scala.inline
      def setWriteAttributesVarargs(value: Input[String]*): Self = StObject.set(x, "writeAttributes", js.Array(value :_*))
    }
  }
}
