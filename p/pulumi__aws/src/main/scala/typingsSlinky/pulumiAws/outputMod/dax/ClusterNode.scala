package typingsSlinky.pulumiAws.outputMod.dax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterNode extends js.Object {
  
  var address: String = js.native
  
  var availabilityZone: String = js.native
  
  var id: String = js.native
  
  /**
    * The port used by the configuration endpoint
    */
  var port: Double = js.native
}
object ClusterNode {
  
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterNode = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterNode]
  }
  
  @scala.inline
  implicit class ClusterNodeOps[Self <: ClusterNode] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
