package typingsSlinky.pulumiAws.adminAccountMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount")
@js.native
class AdminAccount protected () extends CustomResource {
  /**
    * Create a AdminAccount resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AdminAccountArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: AdminAccountArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
    */
  val accountId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/fms/adminAccount", "AdminAccount")
@js.native
object AdminAccount extends js.Object {
  
  /**
    * Get an existing AdminAccount resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AdminAccount = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AdminAccount = js.native
  def get(name: String, id: Input[ID], state: AdminAccountState): AdminAccount = js.native
  def get(name: String, id: Input[ID], state: AdminAccountState, opts: CustomResourceOptions): AdminAccount = js.native
  
  /**
    * Returns true if the given object is an instance of AdminAccount.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/fms/adminAccount.AdminAccount */ Boolean = js.native
}
