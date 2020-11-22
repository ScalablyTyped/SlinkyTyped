package typingsSlinky.pulumiAws.apigatewayStageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.apigateway.StageAccessLogSettings
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway/stage", "Stage")
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
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: Output_[js.UndefOr[StageAccessLogSettings]] = js.native
  
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: Output_[String] = js.native
  
  /**
    * The description of the stage
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The execution ARN to be used in `lambdaPermission`'s `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: Output_[String] = js.native
  
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: Output_[String] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
  
  /**
    * The name of the stage
    */
  val stageName: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A map that defines the stage variables
    */
  val variables: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: Output_[js.UndefOr[Boolean]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigateway/stage", "Stage")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/stage.Stage */ Boolean = js.native
}
