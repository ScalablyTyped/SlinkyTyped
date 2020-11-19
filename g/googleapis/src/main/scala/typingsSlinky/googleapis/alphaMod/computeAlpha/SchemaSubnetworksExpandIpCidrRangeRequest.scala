package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSubnetworksExpandIpCidrRangeRequest extends js.Object {
  
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal
    * on this Subnetwork. This range should be disjoint from other subnetworks
    * within this network. This range can only be larger than (i.e. a superset
    * of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /**
    * The type of IP CIDR range to associate with this subnetwork. The default
    * is RFC_1918. When expanding to a non-RFC 1918 range, this field must be
    * be set to NON_RFC_1918.
    */
  var rangeType: js.UndefOr[String] = js.native
}
object SchemaSubnetworksExpandIpCidrRangeRequest {
  
  @scala.inline
  def apply(): SchemaSubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksExpandIpCidrRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaSubnetworksExpandIpCidrRangeRequestOps[Self <: SchemaSubnetworksExpandIpCidrRangeRequest] (val x: Self) extends AnyVal {
    
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeType(value: String): Self = this.set("rangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeType: Self = this.set("rangeType", js.undefined)
  }
}
