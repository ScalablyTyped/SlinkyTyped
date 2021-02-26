package typingsSlinky.jqueryClientsidelogging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSideLoggingClientInfoObject extends StObject {
  
  var location: js.UndefOr[Boolean] = js.native
  
  //  The url to the page on which the error occurred.
  var screen_size: js.UndefOr[Boolean] = js.native
  
  //  The size of the user's screen (different to the window size because the window might not be maximized)
  var user_agent: js.UndefOr[Boolean] = js.native
  
  //  The user agent string.
  var window_size: js.UndefOr[Boolean] = js.native
}
object ClientSideLoggingClientInfoObject {
  
  @scala.inline
  def apply(): ClientSideLoggingClientInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingClientInfoObject]
  }
  
  @scala.inline
  implicit class ClientSideLoggingClientInfoObjectMutableBuilder[Self <: ClientSideLoggingClientInfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setScreen_size(value: Boolean): Self = StObject.set(x, "screen_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_sizeUndefined: Self = StObject.set(x, "screen_size", js.undefined)
    
    @scala.inline
    def setUser_agent(value: Boolean): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    
    @scala.inline
    def setWindow_size(value: Boolean): Self = StObject.set(x, "window_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow_sizeUndefined: Self = StObject.set(x, "window_size", js.undefined)
  }
}
