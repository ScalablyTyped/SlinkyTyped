package typingsSlinky.pulumiAws.outputMod.s3outposts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointNetworkInterface extends js.Object {
  
  /**
    * Identifier of the Elastic Network Interface (ENI).
    */
  var networkInterfaceId: String = js.native
}
object EndpointNetworkInterface {
  
  @scala.inline
  def apply(networkInterfaceId: String): EndpointNetworkInterface = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointNetworkInterface]
  }
  
  @scala.inline
  implicit class EndpointNetworkInterfaceOps[Self <: EndpointNetworkInterface] (val x: Self) extends AnyVal {
    
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
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
  }
}
