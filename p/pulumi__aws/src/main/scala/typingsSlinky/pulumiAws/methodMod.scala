package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.apigatewayMod.RestApi
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodMod {
  
  @JSImport("@pulumi/aws/apigateway/method", "Method")
  @js.native
  class Method protected () extends CustomResource {
    /**
      * Create a Method resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MethodArgs) = this()
    def this(name: String, args: MethodArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: Output_[String] = js.native
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: Output_[js.UndefOr[StringDictionary[Boolean]]] = js.native
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Output_[String] = js.native
  }
  /* static members */
  object Method {
    
    /**
      * Get an existing Method resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/method", "Method.get")
    @js.native
    def get(name: String, id: Input[ID]): Method = js.native
    @JSImport("@pulumi/aws/apigateway/method", "Method.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Method = js.native
    @JSImport("@pulumi/aws/apigateway/method", "Method.get")
    @js.native
    def get(name: String, id: Input[ID], state: MethodState): Method = js.native
    @JSImport("@pulumi/aws/apigateway/method", "Method.get")
    @js.native
    def get(name: String, id: Input[ID], state: MethodState, opts: CustomResourceOptions): Method = js.native
    
    /**
      * Returns true if the given object is an instance of Method.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/method", "Method.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/method.Method */ Boolean = js.native
  }
  
  @js.native
  trait MethodArgs extends StObject {
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: Input[String] = js.native
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: Input[String] = js.native
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.native
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: Input[String] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: Input[String | RestApi] = js.native
  }
  object MethodArgs {
    
    @scala.inline
    def apply(
      authorization: Input[String],
      httpMethod: Input[String],
      resourceId: Input[String],
      restApi: Input[String | RestApi]
    ): MethodArgs = {
      val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodArgs]
    }
    
    @scala.inline
    implicit class MethodArgsMutableBuilder[Self <: MethodArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      @scala.inline
      def setAuthorization(value: Input[String]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      @scala.inline
      def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      @scala.inline
      def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      @scala.inline
      def setRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      @scala.inline
      def setRequestValidatorId(value: Input[String]): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestValidatorIdUndefined: Self = StObject.set(x, "requestValidatorId", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MethodState extends StObject {
    
    /**
      * Specify if the method requires an API key
      */
    val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
      */
    val authorization: js.UndefOr[Input[String]] = js.native
    
    /**
      * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
      */
    val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
      */
    val authorizerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
      */
    val httpMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of the API models used for the request's content type
      * where key is the content type (e.g. `application/json`)
      * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
      */
    val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
      * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
      */
    val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.native
    
    /**
      * The ID of a `aws.apigateway.RequestValidator`
      */
    val requestValidatorId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The API resource ID
      */
    val resourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated REST API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  }
  object MethodState {
    
    @scala.inline
    def apply(): MethodState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodState]
    }
    
    @scala.inline
    implicit class MethodStateMutableBuilder[Self <: MethodState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeyRequired(value: Input[Boolean]): Self = StObject.set(x, "apiKeyRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyRequiredUndefined: Self = StObject.set(x, "apiKeyRequired", js.undefined)
      
      @scala.inline
      def setAuthorization(value: Input[String]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "authorizationScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationScopesUndefined: Self = StObject.set(x, "authorizationScopes", js.undefined)
      
      @scala.inline
      def setAuthorizationScopesVarargs(value: Input[String]*): Self = StObject.set(x, "authorizationScopes", js.Array(value :_*))
      
      @scala.inline
      def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      @scala.inline
      def setAuthorizerId(value: Input[String]): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizerIdUndefined: Self = StObject.set(x, "authorizerId", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setRequestModels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requestModels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestModelsUndefined: Self = StObject.set(x, "requestModels", js.undefined)
      
      @scala.inline
      def setRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
      
      @scala.inline
      def setRequestValidatorId(value: Input[String]): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestValidatorIdUndefined: Self = StObject.set(x, "requestValidatorId", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
    }
  }
}
