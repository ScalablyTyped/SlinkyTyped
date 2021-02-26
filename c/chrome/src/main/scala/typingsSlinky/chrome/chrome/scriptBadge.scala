package typingsSlinky.chrome.chrome

import typingsSlinky.chrome.chrome.events.Event
import typingsSlinky.chrome.chrome.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
object scriptBadge {
  
  @js.native
  trait AttentionDetails extends StObject {
    
    var tabId: Double = js.native
  }
  object AttentionDetails {
    
    @scala.inline
    def apply(tabId: Double): AttentionDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttentionDetails]
    }
    
    @scala.inline
    implicit class AttentionDetailsMutableBuilder[Self <: AttentionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPopupDetails extends StObject {
    
    var tabId: Double = js.native
  }
  object GetPopupDetails {
    
    @scala.inline
    def apply(tabId: Double): GetPopupDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPopupDetails]
    }
    
    @scala.inline
    implicit class GetPopupDetailsMutableBuilder[Self <: GetPopupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptBadgeClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
  
  @js.native
  trait SetPopupDetails extends StObject {
    
    var popup: String = js.native
    
    var tabId: Double = js.native
  }
  object SetPopupDetails {
    
    @scala.inline
    def apply(popup: String, tabId: Double): SetPopupDetails = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPopupDetails]
    }
    
    @scala.inline
    implicit class SetPopupDetailsMutableBuilder[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
}
