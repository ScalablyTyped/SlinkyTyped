package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProfileMobileApplication extends StObject {
  
  /** The app store the app belongs to. */
  var appStore: js.UndefOr[String] = js.native
  
  /** The external ID for the app from its app store. */
  var externalAppId: js.UndefOr[String] = js.native
  
  /** The name of the app. */
  var name: js.UndefOr[String] = js.native
}
object PublisherProfileMobileApplication {
  
  @scala.inline
  def apply(): PublisherProfileMobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProfileMobileApplication]
  }
  
  @scala.inline
  implicit class PublisherProfileMobileApplicationMutableBuilder[Self <: PublisherProfileMobileApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStore(value: String): Self = StObject.set(x, "appStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUndefined: Self = StObject.set(x, "appStore", js.undefined)
    
    @scala.inline
    def setExternalAppId(value: String): Self = StObject.set(x, "externalAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAppIdUndefined: Self = StObject.set(x, "externalAppId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
