package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateClusterConfig extends js.Object {
  
  /** Whether the master's internal IP address is used as the cluster endpoint. */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  
  /** Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking. */
  var enablePrivateNodes: js.UndefOr[Boolean] = js.native
  
  /** Controls master global access settings. */
  var masterGlobalAccessConfig: js.UndefOr[PrivateClusterMasterGlobalAccessConfig] = js.native
  
  /**
    * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB
    * VIP. This range must not overlap with any other ranges in use within the cluster's network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Output only. The peering name in the customer VPC used by this cluster. */
  var peeringName: js.UndefOr[String] = js.native
  
  /** Output only. The internal IP address of this cluster's master endpoint. */
  var privateEndpoint: js.UndefOr[String] = js.native
  
  /** Output only. The external IP address of this cluster's master endpoint. */
  var publicEndpoint: js.UndefOr[String] = js.native
}
object PrivateClusterConfig {
  
  @scala.inline
  def apply(): PrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateClusterConfig]
  }
  
  @scala.inline
  implicit class PrivateClusterConfigOps[Self <: PrivateClusterConfig] (val x: Self) extends AnyVal {
    
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
    def setEnablePrivateEndpoint(value: Boolean): Self = this.set("enablePrivateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePrivateEndpoint: Self = this.set("enablePrivateEndpoint", js.undefined)
    
    @scala.inline
    def setEnablePrivateNodes(value: Boolean): Self = this.set("enablePrivateNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePrivateNodes: Self = this.set("enablePrivateNodes", js.undefined)
    
    @scala.inline
    def setMasterGlobalAccessConfig(value: PrivateClusterMasterGlobalAccessConfig): Self = this.set("masterGlobalAccessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterGlobalAccessConfig: Self = this.set("masterGlobalAccessConfig", js.undefined)
    
    @scala.inline
    def setMasterIpv4CidrBlock(value: String): Self = this.set("masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterIpv4CidrBlock: Self = this.set("masterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setPeeringName(value: String): Self = this.set("peeringName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeeringName: Self = this.set("peeringName", js.undefined)
    
    @scala.inline
    def setPrivateEndpoint(value: String): Self = this.set("privateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateEndpoint: Self = this.set("privateEndpoint", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: String): Self = this.set("publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicEndpoint: Self = this.set("publicEndpoint", js.undefined)
  }
}
