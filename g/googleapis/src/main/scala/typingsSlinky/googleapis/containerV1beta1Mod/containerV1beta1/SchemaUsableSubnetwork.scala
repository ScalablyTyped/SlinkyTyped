package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UsableSubnetwork resource returns the subnetwork name, its associated
  * network and the primary CIDR range.
  */
@js.native
trait SchemaUsableSubnetwork extends js.Object {
  
  /**
    * The range of internal addresses that are owned by this subnetwork.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /**
    * Network Name. Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Secondary IP ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaUsableSubnetworkSecondaryRange]] = js.native
  
  /**
    * A human readable status message representing the reasons for cases where
    * the caller cannot use the secondary ranges under the subnet. For example
    * if the secondary_ip_ranges is empty due to a permission issue, an
    * insufficient permission message will be given by status_message.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * Subnetwork Name. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}
object SchemaUsableSubnetwork {
  
  @scala.inline
  def apply(): SchemaUsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetwork]
  }
  
  @scala.inline
  implicit class SchemaUsableSubnetworkOps[Self <: SchemaUsableSubnetwork] (val x: Self) extends AnyVal {
    
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
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setSecondaryIpRangesVarargs(value: SchemaUsableSubnetworkSecondaryRange*): Self = this.set("secondaryIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryIpRanges(value: js.Array[SchemaUsableSubnetworkSecondaryRange]): Self = this.set("secondaryIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryIpRanges: Self = this.set("secondaryIpRanges", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
  }
}
