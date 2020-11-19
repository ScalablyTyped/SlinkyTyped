package typingsSlinky.pulumiAws.organizationMod

import typingsSlinky.pulumiAws.outputMod.organizations.OrganizationAccount
import typingsSlinky.pulumiAws.outputMod.organizations.OrganizationNonMasterAccount
import typingsSlinky.pulumiAws.outputMod.organizations.OrganizationRoot
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/organizations/organization", "Organization")
@js.native
class Organization protected () extends CustomResource {
  /**
    * Create a Organization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: OrganizationArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: OrganizationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: Output_[js.Array[OrganizationAccount]] = js.native
  
  /**
    * ARN of the root
    */
  val arn: Output_[String] = js.native
  
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `BACKUP_POLICY`, `SERVICE_CONTROL_POLICY`, and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: Output_[js.UndefOr[String]] = js.native
  
  /**
    * ARN of the master account
    */
  val masterAccountArn: Output_[String] = js.native
  
  /**
    * Email address of the master account
    */
  val masterAccountEmail: Output_[String] = js.native
  
  /**
    * Identifier of the master account
    */
  val masterAccountId: Output_[String] = js.native
  
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: Output_[js.Array[OrganizationNonMasterAccount]] = js.native
  
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: Output_[js.Array[OrganizationRoot]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/organizations/organization", "Organization")
@js.native
object Organization extends js.Object {
  
  /**
    * Get an existing Organization resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Organization = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState): Organization = js.native
  def get(name: String, id: Input[ID], state: OrganizationState, opts: CustomResourceOptions): Organization = js.native
  
  /**
    * Returns true if the given object is an instance of Organization.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/organization.Organization */ Boolean = js.native
}
