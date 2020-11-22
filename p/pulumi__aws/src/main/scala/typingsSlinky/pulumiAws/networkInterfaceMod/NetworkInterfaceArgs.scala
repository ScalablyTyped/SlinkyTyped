package typingsSlinky.pulumiAws.networkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceArgs extends js.Object {
  
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: js.UndefOr[Input[js.Array[Input[NetworkInterfaceAttachment]]]] = js.native
  
  /**
    * A description for the network interface.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6Addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
    */
  val ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying `ipv6AddressCount`.
    */
  val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  val privateIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: Input[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object NetworkInterfaceArgs {
  
  @scala.inline
  def apply(subnetId: Input[String]): NetworkInterfaceArgs = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceArgs]
  }
  
  @scala.inline
  implicit class NetworkInterfaceArgsOps[Self <: NetworkInterfaceArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: Input[NetworkInterfaceAttachment]*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: Input[js.Array[Input[NetworkInterfaceAttachment]]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIpv6AddressCount(value: Input[Double]): Self = this.set("ipv6AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("ipv6AddressCount", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: Input[String]*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("ipv6Addresses", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: Input[String]): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    
    @scala.inline
    def setPrivateIpsVarargs(value: Input[String]*): Self = this.set("privateIps", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIps(value: Input[js.Array[Input[String]]]): Self = this.set("privateIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIps: Self = this.set("privateIps", js.undefined)
    
    @scala.inline
    def setPrivateIpsCount(value: Input[Double]): Self = this.set("privateIpsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpsCount: Self = this.set("privateIpsCount", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: Input[Boolean]): Self = this.set("sourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("sourceDestCheck", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
