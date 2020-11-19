package typingsSlinky.pulumiAws.ec2clientvpnEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2clientvpn.EndpointAuthenticationOption
import typingsSlinky.pulumiAws.outputMod.ec2clientvpn.EndpointConnectionLogOptions
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint")
@js.native
class Endpoint protected () extends CustomResource {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointArgs) = this()
  def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the Client VPN endpoint.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  val authenticationOptions: Output_[js.Array[EndpointAuthenticationOption]] = js.native
  
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  val clientCidrBlock: Output_[String] = js.native
  
  /**
    * Information about the client connection logging options.
    */
  val connectionLogOptions: Output_[EndpointConnectionLogOptions] = js.native
  
  /**
    * Name of the repository.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  val dnsName: Output_[String] = js.native
  
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN endpoint is used as the DNS server.
    */
  val dnsServers: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The ARN of the ACM server certificate.
    */
  val serverCertificateArn: Output_[String] = js.native
  
  /**
    * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
    */
  val splitTunnel: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The current state of the Client VPN endpoint.
    */
  val status: Output_[String] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The transport protocol to be used by the VPN session. Default value is `udp`.
    */
  val transportProtocol: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2clientvpn/endpoint", "Endpoint")
@js.native
object Endpoint extends js.Object {
  
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Endpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
  
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = js.native
}
