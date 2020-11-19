package typingsSlinky.pulumiAws.subnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetState extends js.Object {
  
  /**
    * The ARN of the subnet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify true to indicate
    * that network interfaces created in the specified subnet should be
    * assigned an IPv6 address. Default is `false`
    */
  val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The AZ for the subnet.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AZ ID of the subnet.
    */
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The CIDR block for the subnet.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IPv6 network range for the subnet,
    * in CIDR notation. The subnet size must use a /64 prefix length.
    */
  val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6CidrBlockAssociationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specify true to indicate
    * that instances launched into the subnet should be assigned
    * a public IP address. Default is `false`.
    */
  val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object SubnetState {
  
  @scala.inline
  def apply(): SubnetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetState]
  }
  
  @scala.inline
  implicit class SubnetStateOps[Self <: SubnetState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAssignIpv6AddressOnCreation(value: Input[Boolean]): Self = this.set("assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignIpv6AddressOnCreation: Self = this.set("assignIpv6AddressOnCreation", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneId(value: Input[String]): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("availabilityZoneId", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: Input[String]): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationId(value: Input[String]): Self = this.set("ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockAssociationId: Self = this.set("ipv6CidrBlockAssociationId", js.undefined)
    
    @scala.inline
    def setMapPublicIpOnLaunch(value: Input[Boolean]): Self = this.set("mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapPublicIpOnLaunch: Self = this.set("mapPublicIpOnLaunch", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: Input[String]): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("outpostArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
