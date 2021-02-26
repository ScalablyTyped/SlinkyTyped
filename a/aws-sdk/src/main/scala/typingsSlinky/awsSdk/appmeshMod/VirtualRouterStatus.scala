package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterStatus extends StObject {
  
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatusCode = js.native
}
object VirtualRouterStatus {
  
  @scala.inline
  def apply(status: VirtualRouterStatusCode): VirtualRouterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterStatus]
  }
  
  @scala.inline
  implicit class VirtualRouterStatusMutableBuilder[Self <: VirtualRouterStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: VirtualRouterStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
