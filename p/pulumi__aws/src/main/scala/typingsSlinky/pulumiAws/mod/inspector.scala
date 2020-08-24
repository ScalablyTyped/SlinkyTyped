package typingsSlinky.pulumiAws.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "inspector")
@js.native
object inspector extends js.Object {
  @js.native
  class AssessmentTarget protected ()
    extends typingsSlinky.pulumiAws.inspectorMod.AssessmentTarget {
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
  
  @js.native
  class AssessmentTemplate protected ()
    extends typingsSlinky.pulumiAws.inspectorMod.AssessmentTemplate {
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
  
  @js.native
  class ResourceGroup protected ()
    extends typingsSlinky.pulumiAws.inspectorMod.ResourceGroup {
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
  
  def getRulesPackages(): js.Promise[GetRulesPackagesResult] = js.native
  def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] = js.native
  /* static members */
  @js.native
  object AssessmentTarget extends js.Object {
    /**
      * Get an existing AssessmentTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    def get(name: String, id: Input[ID], state: AssessmentTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTargetMod.AssessmentTarget = js.native
    /**
      * Returns true if the given object is an instance of AssessmentTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTarget.AssessmentTarget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object AssessmentTemplate extends js.Object {
    /**
      * Get an existing AssessmentTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    def get(name: String, id: Input[ID], state: AssessmentTemplateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.assessmentTemplateMod.AssessmentTemplate = js.native
    /**
      * Returns true if the given object is an instance of AssessmentTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/assessmentTemplate.AssessmentTemplate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceGroup extends js.Object {
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourceGroupMod.ResourceGroup = js.native
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
  }
  
}

