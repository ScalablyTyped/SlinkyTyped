package typingsSlinky.pulumiAws.organizationConfigurationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/guardduty/organizationConfiguration", "OrganizationConfiguration")
@js.native
class OrganizationConfiguration protected () extends CustomResource {
  /**
    * Create a OrganizationConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: OrganizationConfigurationArgs) = this()
  def this(name: String, args: OrganizationConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
    */
  val autoEnable: Output_[Boolean] = js.native
  
  /**
    * The detector ID of the GuardDuty account.
    */
  val detectorId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/guardduty/organizationConfiguration", "OrganizationConfiguration")
@js.native
object OrganizationConfiguration extends js.Object {
  
  /**
    * Get an existing OrganizationConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): OrganizationConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationConfiguration = js.native
  def get(name: String, id: Input[ID], state: OrganizationConfigurationState): OrganizationConfiguration = js.native
  def get(name: String, id: Input[ID], state: OrganizationConfigurationState, opts: CustomResourceOptions): OrganizationConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of OrganizationConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/organizationConfiguration.OrganizationConfiguration */ Boolean = js.native
}
