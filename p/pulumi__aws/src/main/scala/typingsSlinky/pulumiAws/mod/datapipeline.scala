package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.datapipelinePipelineMod.PipelineArgs
import typingsSlinky.pulumiAws.datapipelinePipelineMod.PipelineState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datapipeline {
  
  @JSImport("@pulumi/aws", "datapipeline.Pipeline")
  @js.native
  class Pipeline protected ()
    extends typingsSlinky.pulumiAws.datapipelineMod.Pipeline {
    /**
      * Create a Pipeline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PipelineArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws", "datapipeline.Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.datapipelinePipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws", "datapipeline.Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.datapipelinePipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws", "datapipeline.Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState): typingsSlinky.pulumiAws.datapipelinePipelineMod.Pipeline = js.native
    @JSImport("@pulumi/aws", "datapipeline.Pipeline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PipelineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.datapipelinePipelineMod.Pipeline = js.native
    
    /**
      * Returns true if the given object is an instance of Pipeline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "datapipeline.Pipeline.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datapipeline/pipeline.Pipeline */ Boolean = js.native
  }
}
