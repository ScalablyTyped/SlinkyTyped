package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.mod.RelayPaginationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayRelayPaginationProp extends StObject {
  
  var relay: RelayPaginationProp = js.native
}
object RelayRelayPaginationProp {
  
  @scala.inline
  def apply(relay: RelayPaginationProp): RelayRelayPaginationProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayPaginationProp]
  }
  
  @scala.inline
  implicit class RelayRelayPaginationPropMutableBuilder[Self <: RelayRelayPaginationProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelay(value: RelayPaginationProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
  }
}
