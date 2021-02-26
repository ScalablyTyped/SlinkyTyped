package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageAccessLogSettings
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageDefaultRouteSettings
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageRouteSetting
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stageMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage")
  @js.native
  class Stage protected () extends CustomResource {
    /**
      * Create a Stage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StageArgs) = this()
    def this(name: String, args: StageArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Settings for logging access in this stage.
      * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
      */
    val accessLogSettings: Output_[js.UndefOr[StageAccessLogSettings]] = js.native
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The ARN of the stage.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
      */
    val autoDeploy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
      * Supported only for WebSocket APIs.
      */
    val clientCertificateId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The default route settings for the stage.
      */
    val defaultRouteSettings: Output_[js.UndefOr[StageDefaultRouteSettings]] = js.native
    
    /**
      * The deployment identifier of the stage. Use the [`aws.apigatewayv2.Deployment`](https://www.terraform.io/docs/providers/aws/r/apigatewayv2_deployment.html) resource to configure a deployment.
      */
    val deploymentId: Output_[String] = js.native
    
    /**
      * The description for the stage. Must be less than or equal to 1024 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN prefix to be used in an `aws.lambda.Permission` `sourceArn` attribute.
      * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
      * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
      */
    val executionArn: Output_[String] = js.native
    
    /**
      * The URL to invoke the API pointing to the stage,
      * e.g. `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
      */
    val invokeUrl: Output_[String] = js.native
    
    /**
      * The name of the stage. Must be between 1 and 128 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * Route settings for the stage.
      */
    val routeSettings: Output_[js.UndefOr[js.Array[StageRouteSetting]]] = js.native
    
    /**
      * A map that defines the stage variables for the stage.
      */
    val stageVariables: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A map of tags to assign to the stage.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Stage {
    
    /**
      * Get an existing Stage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage.get")
    @js.native
    def get(name: String, id: Input[ID]): Stage = js.native
    @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Stage = js.native
    @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage.get")
    @js.native
    def get(name: String, id: Input[ID], state: StageState): Stage = js.native
    @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage.get")
    @js.native
    def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): Stage = js.native
    
    /**
      * Returns true if the given object is an instance of Stage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigatewayv2/stage", "Stage.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/stage.Stage */ Boolean = js.native
  }
  
  @js.native
  trait StageArgs extends StObject {
    
    /**
      * Settings for logging access in this stage.
      * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
      */
    val accessLogSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageAccessLogSettings]] = js.native
    
    /**
      * The API identifier.
      */
    val apiId: Input[String] = js.native
    
    /**
      * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
      */
    val autoDeploy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
      * Supported only for WebSocket APIs.
      */
    val clientCertificateId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default route settings for the stage.
      */
    val defaultRouteSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageDefaultRouteSettings]] = js.native
    
    /**
      * The deployment identifier of the stage. Use the [`aws.apigatewayv2.Deployment`](https://www.terraform.io/docs/providers/aws/r/apigatewayv2_deployment.html) resource to configure a deployment.
      */
    val deploymentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description for the stage. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the stage. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Route settings for the stage.
      */
    val routeSettings: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]]]
      ] = js.native
    
    /**
      * A map that defines the stage variables for the stage.
      */
    val stageVariables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the stage.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object StageArgs {
    
    @scala.inline
    def apply(apiId: Input[String]): StageArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageArgs]
    }
    
    @scala.inline
    implicit class StageArgsMutableBuilder[Self <: StageArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessLogSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageAccessLogSettings]): Self = StObject.set(x, "accessLogSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessLogSettingsUndefined: Self = StObject.set(x, "accessLogSettings", js.undefined)
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeploy(value: Input[Boolean]): Self = StObject.set(x, "autoDeploy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeployUndefined: Self = StObject.set(x, "autoDeploy", js.undefined)
      
      @scala.inline
      def setClientCertificateId(value: Input[String]): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
      
      @scala.inline
      def setDefaultRouteSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageDefaultRouteSettings]): Self = StObject.set(x, "defaultRouteSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteSettingsUndefined: Self = StObject.set(x, "defaultRouteSettings", js.undefined)
      
      @scala.inline
      def setDeploymentId(value: Input[String]): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRouteSettings(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]]]): Self = StObject.set(x, "routeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteSettingsUndefined: Self = StObject.set(x, "routeSettings", js.undefined)
      
      @scala.inline
      def setRouteSettingsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]*): Self = StObject.set(x, "routeSettings", js.Array(value :_*))
      
      @scala.inline
      def setStageVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait StageState extends StObject {
    
    /**
      * Settings for logging access in this stage.
      * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
      */
    val accessLogSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageAccessLogSettings]] = js.native
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the stage.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
      */
    val autoDeploy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
      * Supported only for WebSocket APIs.
      */
    val clientCertificateId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default route settings for the stage.
      */
    val defaultRouteSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageDefaultRouteSettings]] = js.native
    
    /**
      * The deployment identifier of the stage. Use the [`aws.apigatewayv2.Deployment`](https://www.terraform.io/docs/providers/aws/r/apigatewayv2_deployment.html) resource to configure a deployment.
      */
    val deploymentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description for the stage. Must be less than or equal to 1024 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN prefix to be used in an `aws.lambda.Permission` `sourceArn` attribute.
      * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
      * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
      */
    val executionArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URL to invoke the API pointing to the stage,
      * e.g. `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
      */
    val invokeUrl: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the stage. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Route settings for the stage.
      */
    val routeSettings: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]]]
      ] = js.native
    
    /**
      * A map that defines the stage variables for the stage.
      */
    val stageVariables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the stage.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object StageState {
    
    @scala.inline
    def apply(): StageState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StageState]
    }
    
    @scala.inline
    implicit class StageStateMutableBuilder[Self <: StageState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessLogSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageAccessLogSettings]): Self = StObject.set(x, "accessLogSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessLogSettingsUndefined: Self = StObject.set(x, "accessLogSettings", js.undefined)
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoDeploy(value: Input[Boolean]): Self = StObject.set(x, "autoDeploy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDeployUndefined: Self = StObject.set(x, "autoDeploy", js.undefined)
      
      @scala.inline
      def setClientCertificateId(value: Input[String]): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertificateIdUndefined: Self = StObject.set(x, "clientCertificateId", js.undefined)
      
      @scala.inline
      def setDefaultRouteSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageDefaultRouteSettings]): Self = StObject.set(x, "defaultRouteSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouteSettingsUndefined: Self = StObject.set(x, "defaultRouteSettings", js.undefined)
      
      @scala.inline
      def setDeploymentId(value: Input[String]): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionArn(value: Input[String]): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionArnUndefined: Self = StObject.set(x, "executionArn", js.undefined)
      
      @scala.inline
      def setInvokeUrl(value: Input[String]): Self = StObject.set(x, "invokeUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeUrlUndefined: Self = StObject.set(x, "invokeUrl", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRouteSettings(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]]]): Self = StObject.set(x, "routeSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteSettingsUndefined: Self = StObject.set(x, "routeSettings", js.undefined)
      
      @scala.inline
      def setRouteSettingsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.apigatewayv2.StageRouteSetting]*): Self = StObject.set(x, "routeSettings", js.Array(value :_*))
      
      @scala.inline
      def setStageVariables(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageVariablesUndefined: Self = StObject.set(x, "stageVariables", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
