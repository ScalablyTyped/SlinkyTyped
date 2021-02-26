package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTargetArgs
import typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTargetState
import typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplateArgs
import typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplateState
import typingsSlinky.pulumiAws.getRulesPackagesMod.GetRulesPackagesResult
import typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroupArgs
import typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroupState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  @JSImport("@pulumi/aws/inspector", "AssessmentTarget")
  @js.native
  class AssessmentTarget protected ()
    extends typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget {
    /**
      * Create a AssessmentTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssessmentTargetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AssessmentTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AssessmentTarget {
    
    /**
      * Get an existing AssessmentTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/inspector", "AssessmentTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    
    /**
      * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/inspector", "AssessmentTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/inspector", "AssessmentTemplate")
  @js.native
  class AssessmentTemplate protected ()
    extends typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate {
    /**
      * Create a AssessmentTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AssessmentTemplateArgs) = this()
    def this(name: String, args: AssessmentTemplateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AssessmentTemplate {
    
    /**
      * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/inspector", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    @JSImport("@pulumi/aws/inspector", "AssessmentTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    
    /**
      * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/inspector", "AssessmentTemplate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/inspector", "ResourceGroup")
  @js.native
  class ResourceGroup protected ()
    extends typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup {
    /**
      * Create a ResourceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceGroupArgs) = this()
    def this(name: String, args: ResourceGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourceGroup {
    
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/inspector", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/inspector", "ResourceGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/inspector", "getRulesPackages")
  @js.native
  def getRulesPackages(): js.Promise[GetRulesPackagesResult] = js.native
  @JSImport("@pulumi/aws/inspector", "getRulesPackages")
  @js.native
  def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] = js.native
}
