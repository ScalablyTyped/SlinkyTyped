package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.elastictranscoderPipelineMod.PipelineArgs
import typingsSlinky.pulumiAws.elastictranscoderPipelineMod.PipelineState
import typingsSlinky.pulumiAws.presetMod.PresetArgs
import typingsSlinky.pulumiAws.presetMod.PresetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elastictranscoderMod {
  
  @JSImport("@pulumi/aws/elastictranscoder", "Pipeline")
  @js.native
  class Pipeline protected ()
    extends typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline {
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
  object Pipeline {
    
    /**
      * Get an existing Pipeline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elastictranscoder", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elastictranscoderPipelineMod.Pipeline = js.native
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elastictranscoder", "Pipeline.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/pipeline.Pipeline */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elastictranscoder", "Preset")
  @js.native
  class Preset protected ()
    extends typingsSlinky.pulumiAws.presetMod.Preset {
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
  object Preset {
    
    /**
      * Get an existing Preset resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elastictranscoder", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: PresetState): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    @JSImport("@pulumi/aws/elastictranscoder", "Preset.get")
    @js.native
    def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.presetMod.Preset = js.native
    
    /**
      * Returns true if the given object is an instance of Preset.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elastictranscoder", "Preset.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
  }
}
