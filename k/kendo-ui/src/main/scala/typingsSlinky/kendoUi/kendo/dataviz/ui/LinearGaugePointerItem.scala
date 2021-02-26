package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugePointerItem extends StObject {
  
  var border: js.UndefOr[LinearGaugePointerItemBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[Double | js.Any] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var shape: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var track: js.UndefOr[LinearGaugePointerItemTrack] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object LinearGaugePointerItem {
  
  @scala.inline
  def apply(): LinearGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugePointerItem]
  }
  
  @scala.inline
  implicit class LinearGaugePointerItemMutableBuilder[Self <: LinearGaugePointerItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: LinearGaugePointerItemBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTrack(value: LinearGaugePointerItemTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
