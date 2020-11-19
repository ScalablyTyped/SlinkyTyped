package typingsSlinky.pulumiAws.securityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.SecurityGroupEgress
import typingsSlinky.pulumiAws.outputMod.ec2.SecurityGroupIngress
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/securityGroup", "SecurityGroup")
@js.native
class SecurityGroup protected () extends CustomResource {
  /**
    * Create a SecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SecurityGroupArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the security group
    */
  val arn: Output_[String] = js.native
  
  /**
    * Description of this egress rule.
    */
  val description: Output_[String] = js.native
  
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    */
  val egress: Output_[js.Array[SecurityGroupEgress]] = js.native
  
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    */
  val ingress: Output_[js.Array[SecurityGroupIngress]] = js.native
  
  /**
    * The name of the security group. If omitted, this provider will
    * assign a random, unique name
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The owner ID.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * Instruct this provider to revoke all of the
    * Security Groups attached ingress and egress rules before deleting the rule
    * itself. This is normally not needed, however certain AWS services such as
    * Elastic Map Reduce may automatically add required rules to security groups used
    * with the service, and those rules may contain a cyclic dependency that prevent
    * the security groups from being destroyed without removing the dependency first.
    * Default `false`
    */
  val revokeRulesOnDelete: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The VPC ID.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/securityGroup", "SecurityGroup")
@js.native
object SecurityGroup extends js.Object {
  
  /**
    * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): SecurityGroup = js.native
  
  /**
    * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroup.SecurityGroup */ Boolean = js.native
}
