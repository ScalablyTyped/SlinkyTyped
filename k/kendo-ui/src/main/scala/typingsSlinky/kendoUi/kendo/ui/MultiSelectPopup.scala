package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectPopup extends StObject {
  
  var appendTo: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object MultiSelectPopup {
  
  @scala.inline
  def apply(): MultiSelectPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectPopup]
  }
  
  @scala.inline
  implicit class MultiSelectPopupMutableBuilder[Self <: MultiSelectPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
