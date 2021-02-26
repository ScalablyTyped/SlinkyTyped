package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.privacy.Network
import typingsSlinky.chrome.chrome.privacy.Services
import typingsSlinky.chrome.chrome.privacy.Websites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofprivacy extends StObject {
  
  var network: Network = js.native
  
  var services: Services = js.native
  
  var websites: Websites = js.native
}
object Typeofprivacy {
  
  @scala.inline
  def apply(network: Network, services: Services, websites: Websites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
  
  @scala.inline
  implicit class TypeofprivacyMutableBuilder[Self <: Typeofprivacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: Services): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsites(value: Websites): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
  }
}
