package typingsSlinky.pulumiAws.patchBaselineMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ssm.PatchBaselineApprovalRule
import typingsSlinky.pulumiAws.outputMod.ssm.PatchBaselineGlobalFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline")
@js.native
class PatchBaseline protected () extends CustomResource {
  /**
    * Create a PatchBaseline resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PatchBaselineArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
    */
  val approvalRules: Output_[js.UndefOr[js.Array[PatchBaselineApprovalRule]]] = js.native
  
  /**
    * A list of explicitly approved patches for the baseline.
    */
  val approvedPatches: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
    */
  val approvedPatchesComplianceLevel: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The description of the patch baseline.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
    */
  val globalFilters: Output_[js.UndefOr[js.Array[PatchBaselineGlobalFilter]]] = js.native
  
  /**
    * The name of the patch baseline.
    */
  val name: Output_[String] = js.native
  
  /**
    * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
    */
  val operatingSystem: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of rejected patches.
    */
  val rejectedPatches: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline")
@js.native
object PatchBaseline extends js.Object {
  
  /**
    * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PatchBaseline = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PatchBaseline = js.native
  def get(name: String, id: Input[ID], state: PatchBaselineState): PatchBaseline = js.native
  def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): PatchBaseline = js.native
  
  /**
    * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
}
