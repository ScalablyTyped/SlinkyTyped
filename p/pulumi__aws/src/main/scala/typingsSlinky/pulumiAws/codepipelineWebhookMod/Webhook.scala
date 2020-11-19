package typingsSlinky.pulumiAws.codepipelineWebhookMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.codepipeline.WebhookAuthenticationConfiguration
import typingsSlinky.pulumiAws.outputMod.codepipeline.WebhookFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codepipeline/webhook", "Webhook")
@js.native
class Webhook protected () extends CustomResource {
  /**
    * Create a Webhook resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WebhookArgs) = this()
  def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
    */
  val authentication: Output_[String] = js.native
  
  /**
    * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
    */
  val authenticationConfiguration: Output_[js.UndefOr[WebhookAuthenticationConfiguration]] = js.native
  
  /**
    * One or more `filter` blocks. Filter blocks are documented below.
    */
  val filters: Output_[js.Array[WebhookFilter]] = js.native
  
  /**
    * The name of the webhook.
    */
  val name: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  val targetAction: Output_[String] = js.native
  
  /**
    * The name of the pipeline.
    */
  val targetPipeline: Output_[String] = js.native
  
  /**
    * The CodePipeline webhook's URL. POST events to this endpoint to trigger the target.
    */
  val url: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codepipeline/webhook", "Webhook")
@js.native
object Webhook extends js.Object {
  
  /**
    * Get an existing Webhook resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Webhook = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Webhook = js.native
  def get(name: String, id: Input[ID], state: WebhookState): Webhook = js.native
  def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): Webhook = js.native
  
  /**
    * Returns true if the given object is an instance of Webhook.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/webhook.Webhook */ Boolean = js.native
}
