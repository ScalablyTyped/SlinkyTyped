package typingsSlinky.pulumiAws.logResourcePolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy")
@js.native
class LogResourcePolicy protected () extends CustomResource {
  /**
    * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogResourcePolicyArgs) = this()
  def this(name: String, args: LogResourcePolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: Output_[String] = js.native
  
  /**
    * Name of the resource policy.
    */
  val policyName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cloudwatch/logResourcePolicy", "LogResourcePolicy")
@js.native
object LogResourcePolicy extends js.Object {
  
  /**
    * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LogResourcePolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogResourcePolicy = js.native
  def get(name: String, id: Input[ID], state: LogResourcePolicyState): LogResourcePolicy = js.native
  def get(name: String, id: Input[ID], state: LogResourcePolicyState, opts: CustomResourceOptions): LogResourcePolicy = js.native
  
  /**
    * Returns true if the given object is an instance of LogResourcePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logResourcePolicy.LogResourcePolicy */ Boolean = js.native
}
