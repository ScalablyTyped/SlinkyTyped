package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpLoadBalancing extends StObject {
  
  /** Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers. */
  var disabled: js.UndefOr[Boolean] = js.native
}
object HttpLoadBalancing {
  
  @scala.inline
  def apply(): HttpLoadBalancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpLoadBalancing]
  }
  
  @scala.inline
  implicit class HttpLoadBalancingMutableBuilder[Self <: HttpLoadBalancing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
