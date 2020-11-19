package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.elastictranscoderPipelineMod.PipelineArgs
import typingsSlinky.pulumiAws.elastictranscoderPipelineMod.PipelineState
import typingsSlinky.pulumiAws.presetMod.PresetArgs
import typingsSlinky.pulumiAws.presetMod.PresetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "elastictranscoder")
@js.native
object elastictranscoder extends js.Object {
  
  @js.native
  class Pipeline protected ()
    extends typingsSlinky.pulumiAws.elastictranscoderMod.Pipeline {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ Boolean = js.native
  }
  
  @js.native
  class Preset protected ()
    extends typingsSlinky.pulumiAws.elastictranscoderMod.Preset {
    /**
      * Create a Preset resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PresetArgs) = this()
    def this(name: String, args: PresetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Preset extends js.Object {
    
    /**
      * Get an existing Preset resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    
    /**
      * Returns true if the given object is an instance of Preset.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
  }
}
