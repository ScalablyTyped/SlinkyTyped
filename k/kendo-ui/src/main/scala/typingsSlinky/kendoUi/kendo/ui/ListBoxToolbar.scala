package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxToolbar extends StObject {
  
  var position: js.UndefOr[String] = js.native
  
  var tools: js.UndefOr[js.Any] = js.native
}
object ListBoxToolbar {
  
  @scala.inline
  def apply(): ListBoxToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxToolbar]
  }
  
  @scala.inline
  implicit class ListBoxToolbarMutableBuilder[Self <: ListBoxToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTools(value: js.Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
