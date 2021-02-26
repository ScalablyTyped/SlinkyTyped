package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterNode extends StObject {
  
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.native
  
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.native
}
object ClusterNode {
  
  @scala.inline
  def apply(): ClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterNode]
  }
  
  @scala.inline
  implicit class ClusterNodeMutableBuilder[Self <: ClusterNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeRole(value: String): Self = StObject.set(x, "NodeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRoleUndefined: Self = StObject.set(x, "NodeRole", js.undefined)
    
    @scala.inline
    def setPrivateIPAddress(value: String): Self = StObject.set(x, "PrivateIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIPAddressUndefined: Self = StObject.set(x, "PrivateIPAddress", js.undefined)
    
    @scala.inline
    def setPublicIPAddress(value: String): Self = StObject.set(x, "PublicIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIPAddressUndefined: Self = StObject.set(x, "PublicIPAddress", js.undefined)
  }
}
