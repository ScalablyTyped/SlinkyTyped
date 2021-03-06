package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on items.
  */
@js.native
trait ASPxClientNavBarItemEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the HTML object that contains the processed navbar item.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the item object related to the event.
    */
  var item: ASPxClientNavBarItem = js.native
}
object ASPxClientNavBarItemEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, htmlEvent: js.Any, item: ASPxClientNavBarItem, processOnServer: Boolean): ASPxClientNavBarItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItemEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarItemEventArgsMutableBuilder[Self <: ASPxClientNavBarItemEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientNavBarItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
