package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonGroupOptions extends StObject {
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var items: js.UndefOr[js.Array[ButtonGroupItem]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, Unit]] = js.native
  
  var selection: js.UndefOr[String] = js.native
}
object ButtonGroupOptions {
  
  @scala.inline
  def apply(): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupOptions]
  }
  
  @scala.inline
  implicit class ButtonGroupOptionsMutableBuilder[Self <: ButtonGroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ButtonGroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ButtonGroupItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ButtonGroupSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
