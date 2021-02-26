package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getReportDefinitionMod.GetReportDefinitionArgs
import typingsSlinky.pulumiAws.getReportDefinitionMod.GetReportDefinitionResult
import typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinitionArgs
import typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinitionState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curMod {
  
  @JSImport("@pulumi/aws/cur", "ReportDefinition")
  @js.native
  class ReportDefinition protected ()
    extends typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinition {
    /**
      * Create a ReportDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportDefinitionArgs) = this()
    def this(name: String, args: ReportDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReportDefinition {
    
    /**
      * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cur", "ReportDefinition.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    @JSImport("@pulumi/aws/cur", "ReportDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    @JSImport("@pulumi/aws/cur", "ReportDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState): typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    @JSImport("@pulumi/aws/cur", "ReportDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    
    /**
      * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cur", "ReportDefinition.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cur", "getReportDefinition")
  @js.native
  def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] = js.native
  @JSImport("@pulumi/aws/cur", "getReportDefinition")
  @js.native
  def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] = js.native
}
