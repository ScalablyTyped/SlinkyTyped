package typingsSlinky.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedProxyLocation extends StObject {
  
  /** The proxy IP address host. */
  var Host: js.UndefOr[ManagedDOMString] = js.native
  
  /** The port to use for the proxy */
  var Port: js.UndefOr[ManagedLong] = js.native
}
object ManagedProxyLocation {
  
  @scala.inline
  def apply(): ManagedProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProxyLocation]
  }
  
  @scala.inline
  implicit class ManagedProxyLocationMutableBuilder[Self <: ManagedProxyLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: ManagedDOMString): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPort(value: ManagedLong): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
