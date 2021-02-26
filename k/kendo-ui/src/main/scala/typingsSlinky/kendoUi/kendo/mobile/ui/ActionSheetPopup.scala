package typingsSlinky.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetPopup extends StObject {
  
  var direction: js.UndefOr[Double | String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ActionSheetPopup {
  
  @scala.inline
  def apply(): ActionSheetPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSheetPopup]
  }
  
  @scala.inline
  implicit class ActionSheetPopupMutableBuilder[Self <: ActionSheetPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
