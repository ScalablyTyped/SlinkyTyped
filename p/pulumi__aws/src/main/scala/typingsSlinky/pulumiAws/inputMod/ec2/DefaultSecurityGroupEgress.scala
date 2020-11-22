package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultSecurityGroupEgress extends js.Object {
  
  /**
    * List of CIDR blocks.
    */
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Description of this egress rule.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The start port (or ICMP type number if protocol is "icmp")
    */
  var fromPort: Input[Double] = js.native
  
  /**
    * List of IPv6 CIDR blocks.
    */
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints)
    */
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The protocol. If you select a protocol of "-1" (semantically equivalent to `"all"`, which is not a valid value here), you must specify a "fromPort" and "toPort" equal to 0. If not icmp, tcp, udp, or "-1" use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  var protocol: Input[String] = js.native
  
  /**
    * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * If true, the security group itself will be added as a source to this egress rule.
    */
  var self: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The end range port (or ICMP code if protocol is "icmp").
    */
  var toPort: Input[Double] = js.native
}
object DefaultSecurityGroupEgress {
  
  @scala.inline
  def apply(fromPort: Input[Double], protocol: Input[String], toPort: Input[Double]): DefaultSecurityGroupEgress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupEgress]
  }
  
  @scala.inline
  implicit class DefaultSecurityGroupEgressOps[Self <: DefaultSecurityGroupEgress] (val x: Self) extends AnyVal {
    
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
    def setFromPort(value: Input[Double]): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPort(value: Input[Double]): Self = this.set("toPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlocksVarargs(value: Input[String]*): Self = this.set("cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlocksVarargs(value: Input[String]*): Self = this.set("ipv6CidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = this.set("ipv6CidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlocks: Self = this.set("ipv6CidrBlocks", js.undefined)
    
    @scala.inline
    def setPrefixListIdsVarargs(value: Input[String]*): Self = this.set("prefixListIds", js.Array(value :_*))
    
    @scala.inline
    def setPrefixListIds(value: Input[js.Array[Input[String]]]): Self = this.set("prefixListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListIds: Self = this.set("prefixListIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    
    @scala.inline
    def setSelf(value: Input[Boolean]): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
}
