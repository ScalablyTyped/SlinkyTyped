package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayoutContainer extends StObject {
  
  var bodyTemplate: js.UndefOr[String | js.Function] = js.native
  
  var colSpan: js.UndefOr[Double] = js.native
  
  var header: js.UndefOr[TileLayoutContainerHeader] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
}
object TileLayoutContainer {
  
  @scala.inline
  def apply(): TileLayoutContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutContainer]
  }
  
  @scala.inline
  implicit class TileLayoutContainerMutableBuilder[Self <: TileLayoutContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyTemplate(value: String | js.Function): Self = StObject.set(x, "bodyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyTemplateUndefined: Self = StObject.set(x, "bodyTemplate", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    @scala.inline
    def setHeader(value: TileLayoutContainerHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
