package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicIpv4Pool extends StObject {
  
  /**
    * A description of the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the location from which the address pool is advertised. A network border group is a unique set of Availability Zones or Local Zones from where AWS advertises public IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  
  /**
    * The address ranges.
    */
  var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet] = js.native
  
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[String] = js.native
  
  /**
    * Any tags for the address pool.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The total number of addresses.
    */
  var TotalAddressCount: js.UndefOr[Integer] = js.native
  
  /**
    * The total number of available addresses.
    */
  var TotalAvailableAddressCount: js.UndefOr[Integer] = js.native
}
object PublicIpv4Pool {
  
  @scala.inline
  def apply(): PublicIpv4Pool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicIpv4Pool]
  }
  
  @scala.inline
  implicit class PublicIpv4PoolMutableBuilder[Self <: PublicIpv4Pool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setPoolAddressRanges(value: PublicIpv4PoolRangeSet): Self = StObject.set(x, "PoolAddressRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolAddressRangesUndefined: Self = StObject.set(x, "PoolAddressRanges", js.undefined)
    
    @scala.inline
    def setPoolAddressRangesVarargs(value: PublicIpv4PoolRange*): Self = StObject.set(x, "PoolAddressRanges", js.Array(value :_*))
    
    @scala.inline
    def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTotalAddressCount(value: Integer): Self = StObject.set(x, "TotalAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAddressCountUndefined: Self = StObject.set(x, "TotalAddressCount", js.undefined)
    
    @scala.inline
    def setTotalAvailableAddressCount(value: Integer): Self = StObject.set(x, "TotalAvailableAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAvailableAddressCountUndefined: Self = StObject.set(x, "TotalAvailableAddressCount", js.undefined)
  }
}
