package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcIpv6CidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
  
  /**
    * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
    */
  var Ipv6Pool: js.UndefOr[String] = js.native
  
  /**
    * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses, for example, us-east-1-wl1-bos-wlz-1.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
}
object VpcIpv6CidrBlockAssociation {
  
  @scala.inline
  def apply(): VpcIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIpv6CidrBlockAssociation]
  }
  
  @scala.inline
  implicit class VpcIpv6CidrBlockAssociationMutableBuilder[Self <: VpcIpv6CidrBlockAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockState(value: VpcCidrBlockState): Self = StObject.set(x, "Ipv6CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockStateUndefined: Self = StObject.set(x, "Ipv6CidrBlockState", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setIpv6Pool(value: String): Self = StObject.set(x, "Ipv6Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6PoolUndefined: Self = StObject.set(x, "Ipv6Pool", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
  }
}
