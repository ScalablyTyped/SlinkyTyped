package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridPageable extends StObject {
  
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  
  var buttonCount: js.UndefOr[Double] = js.native
  
  var info: js.UndefOr[Boolean] = js.native
  
  var input: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[GridPageableMessages] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var previousNext: js.UndefOr[Boolean] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
}
object GridPageable {
  
  @scala.inline
  def apply(): GridPageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPageable]
  }
  
  @scala.inline
  implicit class GridPageableMutableBuilder[Self <: GridPageable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    @scala.inline
    def setButtonCount(value: Double): Self = StObject.set(x, "buttonCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonCountUndefined: Self = StObject.set(x, "buttonCount", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMessages(value: GridPageableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageSizes(value: Boolean | js.Any): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPreviousNext(value: Boolean): Self = StObject.set(x, "previousNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNextUndefined: Self = StObject.set(x, "previousNext", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
  }
}
