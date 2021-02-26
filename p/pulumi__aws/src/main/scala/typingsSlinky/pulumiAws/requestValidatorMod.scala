package typingsSlinky.pulumiAws

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

object requestValidatorMod {
  
  @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator")
  @js.native
  class RequestValidator protected () extends CustomResource {
    /**
      * Create a RequestValidator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RequestValidatorArgs) = this()
    def this(name: String, args: RequestValidatorArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the request validator
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object RequestValidator {
    
    /**
      * Get an existing RequestValidator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator.get")
    @js.native
    def get(name: String, id: Input[ID]): RequestValidator = js.native
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RequestValidator = js.native
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator.get")
    @js.native
    def get(name: String, id: Input[ID], state: RequestValidatorState): RequestValidator = js.native
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator.get")
    @js.native
    def get(name: String, id: Input[ID], state: RequestValidatorState, opts: CustomResourceOptions): RequestValidator = js.native
    
    /**
      * Returns true if the given object is an instance of RequestValidator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean = js.native
  }
  
  @js.native
  trait RequestValidatorArgs extends StObject {
    
    /**
      * The name of the request validator
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: Input[String | RestApi] = js.native
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.native
  }
  object RequestValidatorArgs {
    
    @scala.inline
    def apply(restApi: Input[String | RestApi]): RequestValidatorArgs = {
      val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestValidatorArgs]
    }
    
    @scala.inline
    implicit class RequestValidatorArgsMutableBuilder[Self <: RequestValidatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBody(value: Input[Boolean]): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
      
      @scala.inline
      def setValidateRequestParameters(value: Input[Boolean]): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
    }
  }
  
  @js.native
  trait RequestValidatorState extends StObject {
    
    /**
      * The name of the request validator
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.native
  }
  object RequestValidatorState {
    
    @scala.inline
    def apply(): RequestValidatorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestValidatorState]
    }
    
    @scala.inline
    implicit class RequestValidatorStateMutableBuilder[Self <: RequestValidatorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setValidateRequestBody(value: Input[Boolean]): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
      
      @scala.inline
      def setValidateRequestParameters(value: Input[Boolean]): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
    }
  }
}
