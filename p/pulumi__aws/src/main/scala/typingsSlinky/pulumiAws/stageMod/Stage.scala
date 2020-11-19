package typingsSlinky.pulumiAws.stageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageAccessLogSettings
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageDefaultRouteSettings
import typingsSlinky.pulumiAws.outputMod.apigatewayv2.StageRouteSetting
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The deployment identifier of the stage. Use the `aws.apigatewayv2.Deployment` resource to configure a deployment.
    */
  val deploymentId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The description for the stage.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN prefix to be used in an `aws.lambda.Permission`'s `sourceArn` attribute
    * or in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
    * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
    * Set only for WebSocket APIs.
    */
  val executionArn: Output_[String] = js.native
  
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
    */
  val invokeUrl: Output_[String] = js.native
  
  /**
    * The name of the stage.
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
@JSImport("@pulumi/aws/apigatewayv2/stage", "Stage")
@js.native
object Stage extends js.Object {
  
  /**
    * Get an existing Stage resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Stage = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Stage = js.native
  def get(name: String, id: Input[ID], state: StageState): Stage = js.native
  def get(name: String, id: Input[ID], state: StageState, opts: CustomResourceOptions): Stage = js.native
  
  /**
    * Returns true if the given object is an instance of Stage.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/stage.Stage */ Boolean = js.native
}
