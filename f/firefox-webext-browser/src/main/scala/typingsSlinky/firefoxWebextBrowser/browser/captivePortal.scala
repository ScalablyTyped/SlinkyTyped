package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability detect the captive portal state of the users connection.
  *
  * Permissions: `captivePortal`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object captivePortal {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear
  */
  trait OnConnectivityAvailableStatus extends StObject
  object OnConnectivityAvailableStatus {
    
    @scala.inline
    def captive: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive = "captive".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive]
    
    @scala.inline
    def clear: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear = "clear".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear]
  }
  
  @js.native
  trait OnStateChangedDetails extends StObject {
    
    /** The current captive portal state. */
    var state: OnStateChangedDetailsState = js.native
  }
  object OnStateChangedDetails {
    
    @scala.inline
    def apply(state: OnStateChangedDetailsState): OnStateChangedDetails = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStateChangedDetails]
    }
    
    @scala.inline
    implicit class OnStateChangedDetailsMutableBuilder[Self <: OnStateChangedDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: OnStateChangedDetailsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /** The current captive portal state. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal
  */
  trait OnStateChangedDetailsState extends StObject
  object OnStateChangedDetailsState {
    
    @scala.inline
    def locked_portal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal = "locked_portal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal]
    
    @scala.inline
    def not_captive: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive = "not_captive".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive]
    
    @scala.inline
    def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    @scala.inline
    def unlocked_portal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal]
  }
}
