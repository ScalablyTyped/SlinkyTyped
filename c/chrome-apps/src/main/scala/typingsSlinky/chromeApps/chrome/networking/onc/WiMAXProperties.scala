package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiMAXProperties[M /* <: ManagedObject */, B] extends StObject {
  
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.native
  
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.native
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
}
object WiMAXProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, B](): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
  
  @scala.inline
  implicit class WiMAXPropertiesMutableBuilder[Self <: WiMAXProperties[_, _], M /* <: ManagedObject */, B] (val x: Self with (WiMAXProperties[M, B])) extends AnyVal {
    
    @scala.inline
    def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    @scala.inline
    def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
