package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
@js.native
trait ASPxClientMenuItemMouseEventArgs extends ASPxClientMenuItemEventArgs {
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
}
object ASPxClientMenuItemMouseEventArgs {
  
  @scala.inline
  def apply(htmlElement: js.Any, item: ASPxClientMenuItem): ASPxClientMenuItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemMouseEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientMenuItemMouseEventArgsMutableBuilder[Self <: ASPxClientMenuItemMouseEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
  }
}
