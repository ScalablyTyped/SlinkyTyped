package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnCommandItem extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var click: js.UndefOr[js.Function] = js.native
  
  var iconClass: js.UndefOr[String | GridColumnCommandItemIconClass] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String | GridColumnCommandItemText] = js.native
  
  var visible: js.UndefOr[js.Function] = js.native
}
object GridColumnCommandItem {
  
  @scala.inline
  def apply(): GridColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnCommandItem]
  }
  
  @scala.inline
  implicit class GridColumnCommandItemMutableBuilder[Self <: GridColumnCommandItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setIconClass(value: String | GridColumnCommandItemIconClass): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setText(value: String | GridColumnCommandItemText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVisible(value: js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
