package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.codepipelineWebhookMod.WebhookArgs
import typingsSlinky.pulumiAws.codepipelineWebhookMod.WebhookState
import typingsSlinky.pulumiAws.pipelineMod.PipelineArgs
import typingsSlinky.pulumiAws.pipelineMod.PipelineState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codepipeline", JSImport.Namespace)
@js.native
object codepipelineMod extends js.Object {
  @js.native
  class Pipeline protected ()
    extends typingsSlinky.pulumiAws.pipelineMod.Pipeline {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: PipelineArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Webhook protected ()
    extends typingsSlinky.pulumiAws.codepipelineWebhookMod.Webhook {
    /**
      * Create a Webhook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebhookArgs) = this()
    def this(name: String, args: WebhookArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Pipeline extends js.Object {
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.pipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState): typingsSlinky.pulumiAws.pipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.pipelineMod.Pipeline = js.native
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Webhook extends js.Object {
    /**
      * Get an existing Webhook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.codepipelineWebhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState): typingsSlinky.pulumiAws.codepipelineWebhookMod.Webhook = js.native
    def get(name: String, id: Input[ID], state: WebhookState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.codepipelineWebhookMod.Webhook = js.native
    /**
      * Returns true if the given object is an instance of Webhook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/webhook.Webhook */ Boolean = js.native
  }
  
}

