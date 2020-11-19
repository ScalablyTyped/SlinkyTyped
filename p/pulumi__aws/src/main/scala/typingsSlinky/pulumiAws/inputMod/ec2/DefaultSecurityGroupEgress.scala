package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultSecurityGroupEgress extends js.Object {
  
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The description of the security group
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  var fromPort: Input[Double] = js.native
  
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var protocol: Input[String] = js.native
  
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var self: js.UndefOr[Input[Boolean]] = js.native
  
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
