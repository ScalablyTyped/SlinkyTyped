package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@js.native
trait ASPxClientToolbarItemValueChangedEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  var editor: ASPxClientControl = js.native
  
  /**
    * Gets the menu item object related to the event.
    */
  var item: ASPxClientMenuItem = js.native
}
object ASPxClientToolbarItemValueChangedEventArgs {
  
  @scala.inline
  def apply(editor: ASPxClientControl, item: ASPxClientMenuItem, processOnServer: Boolean): ASPxClientToolbarItemValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientToolbarItemValueChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientToolbarItemValueChangedEventArgsMutableBuilder[Self <: ASPxClientToolbarItemValueChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditor(value: ASPxClientControl): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
