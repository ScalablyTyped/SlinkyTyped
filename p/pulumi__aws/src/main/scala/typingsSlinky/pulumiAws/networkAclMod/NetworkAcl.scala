package typingsSlinky.pulumiAws.networkAclMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.NetworkAclEgress
import typingsSlinky.pulumiAws.outputMod.ec2.NetworkAclIngress
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
@js.native
class NetworkAcl protected () extends CustomResource {
  /**
    * Create a NetworkAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclArgs) = this()
  def this(name: String, args: NetworkAclArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the network ACL
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: Output_[js.Array[NetworkAclEgress]] = js.native
  
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: Output_[js.Array[NetworkAclIngress]] = js.native
  
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
@js.native
object NetworkAcl extends js.Object {
  
  /**
    * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NetworkAcl = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkAcl = js.native
  def get(name: String, id: Input[ID], state: NetworkAclState): NetworkAcl = js.native
  def get(name: String, id: Input[ID], state: NetworkAclState, opts: CustomResourceOptions): NetworkAcl = js.native
  
  /**
    * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ Boolean = js.native
}
