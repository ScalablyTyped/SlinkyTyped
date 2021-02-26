package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) A `closePopup` event. Fired when Popup should be
    * hidden, for example when clicking on an annotation again.
    */
  var closePopup: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) Event fired when button state should change, for
    * example after adding an annotation.
    */
  var deselectButton: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) Event fired on a button click.
    */
  var selectButton: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
    * example an annotation.
    */
  var showPopup: js.UndefOr[js.Function] = js.native
}
object NavigationEventsOptions {
  
  @scala.inline
  def apply(): NavigationEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationEventsOptions]
  }
  
  @scala.inline
  implicit class NavigationEventsOptionsMutableBuilder[Self <: NavigationEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosePopup(value: js.Function): Self = StObject.set(x, "closePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosePopupUndefined: Self = StObject.set(x, "closePopup", js.undefined)
    
    @scala.inline
    def setDeselectButton(value: js.Function): Self = StObject.set(x, "deselectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectButtonUndefined: Self = StObject.set(x, "deselectButton", js.undefined)
    
    @scala.inline
    def setSelectButton(value: js.Function): Self = StObject.set(x, "selectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectButtonUndefined: Self = StObject.set(x, "selectButton", js.undefined)
    
    @scala.inline
    def setShowPopup(value: js.Function): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
  }
}
