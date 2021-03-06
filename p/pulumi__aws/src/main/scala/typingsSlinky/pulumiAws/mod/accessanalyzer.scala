package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.analyzerMod.AnalyzerArgs
import typingsSlinky.pulumiAws.analyzerMod.AnalyzerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessanalyzer {
  
  @JSImport("@pulumi/aws", "accessanalyzer.Analyzer")
  @js.native
  class Analyzer protected ()
    extends typingsSlinky.pulumiAws.accessanalyzerMod.Analyzer {
    /**
      * Create a Analyzer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AnalyzerArgs) = this()
    def this(name: String, args: AnalyzerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Analyzer {
    
    /**
      * Get an existing Analyzer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "accessanalyzer.Analyzer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.analyzerMod.Analyzer = js.native
    @JSImport("@pulumi/aws", "accessanalyzer.Analyzer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.analyzerMod.Analyzer = js.native
    @JSImport("@pulumi/aws", "accessanalyzer.Analyzer.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyzerState): typingsSlinky.pulumiAws.analyzerMod.Analyzer = js.native
    @JSImport("@pulumi/aws", "accessanalyzer.Analyzer.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyzerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.analyzerMod.Analyzer = js.native
    
    /**
      * Returns true if the given object is an instance of Analyzer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "accessanalyzer.Analyzer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/accessanalyzer/analyzer.Analyzer */ Boolean = js.native
  }
}
