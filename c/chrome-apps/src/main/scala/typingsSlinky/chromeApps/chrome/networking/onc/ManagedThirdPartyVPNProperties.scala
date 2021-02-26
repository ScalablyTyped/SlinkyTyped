package typingsSlinky.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedThirdPartyVPNProperties extends StObject {
  
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: ManagedDOMString = js.native
  
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.native
}
object ManagedThirdPartyVPNProperties {
  
  @scala.inline
  def apply(ExtensionID: ManagedDOMString): ManagedThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedThirdPartyVPNProperties]
  }
  
  @scala.inline
  implicit class ManagedThirdPartyVPNPropertiesMutableBuilder[Self <: ManagedThirdPartyVPNProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionID(value: ManagedDOMString): Self = StObject.set(x, "ExtensionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
