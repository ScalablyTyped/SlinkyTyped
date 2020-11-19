package typingsSlinky.pulumiAws.vpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.VpcEndpointDnsEntry
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
@js.native
class VpcEndpoint protected () extends CustomResource {
  /**
    * Create a VpcEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointArgs) = this()
  def this(name: String, args: VpcEndpointArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: Output_[js.Array[String]] = js.native
  
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: Output_[js.Array[VpcEndpointDnsEntry]] = js.native
  
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: Output_[js.Array[String]] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: Output_[String] = js.native
  
  /**
    * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
    */
  val policy: Output_[String] = js.native
  
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: Output_[String] = js.native
  
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: Output_[Boolean] = js.native
  
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: Output_[js.Array[String]] = js.native
  
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: Output_[js.Array[String]] = js.native
  
  /**
    * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    */
  val serviceName: Output_[String] = js.native
  
  /**
    * The state of the VPC endpoint.
    */
  val state: Output_[String] = js.native
  
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
@js.native
object VpcEndpoint extends js.Object {
  
  /**
    * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState): VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState, opts: CustomResourceOptions): VpcEndpoint = js.native
  
  /**
    * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ Boolean = js.native
}
