package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiFiPropertiesBase[M /* <: ManagedObject */, S] extends StObject {
  
  /** The BSSID of the associated access point.. */
  var BSSID: js.UndefOr[String] = js.native
  
  /**
    * The WiFi service operating frequency in MHz.
    * For connected networks, the current frequency on which the network is connected.
    * Otherwise, the frequency of the best available BSS.
    */
  var Frequency: js.UndefOr[integer] = js.native
  
  /** HEX-encoded copy of the network SSID. */
  var HexSSID: js.UndefOr[S] = js.native
  
  /** The network SSID. */
  var SSID: js.UndefOr[S] = js.native
  
  /** The network security type. */
  var Security: js.UndefOr[S] = js.native
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
  
  /**
    * @since Chrome 70
    * @description The tethering state associated with the connection.
    */
  var TetheringState: js.UndefOr[String] = js.native
}
object WiFiPropertiesBase {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, S](): WiFiPropertiesBase[M, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiPropertiesBase[M, S]]
  }
  
  @scala.inline
  implicit class WiFiPropertiesBaseMutableBuilder[Self <: WiFiPropertiesBase[_, _], M /* <: ManagedObject */, S] (val x: Self with (WiFiPropertiesBase[M, S])) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
    
    @scala.inline
    def setFrequency(value: integer): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    @scala.inline
    def setHexSSID(value: S): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
    
    @scala.inline
    def setSSID(value: S): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    
    @scala.inline
    def setSecurity(value: S): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "Security", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
    
    @scala.inline
    def setTetheringState(value: String): Self = StObject.set(x, "TetheringState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetheringStateUndefined: Self = StObject.set(x, "TetheringState", js.undefined)
  }
}
