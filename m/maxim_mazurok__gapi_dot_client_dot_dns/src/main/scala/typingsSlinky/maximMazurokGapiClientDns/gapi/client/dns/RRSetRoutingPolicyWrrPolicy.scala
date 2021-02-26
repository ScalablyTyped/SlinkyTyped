package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyWrrPolicy extends StObject {
  
  var items: js.UndefOr[js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object RRSetRoutingPolicyWrrPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyWrrPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyWrrPolicyMutableBuilder[Self <: RRSetRoutingPolicyWrrPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RRSetRoutingPolicyWrrPolicyWrrPolicyItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
