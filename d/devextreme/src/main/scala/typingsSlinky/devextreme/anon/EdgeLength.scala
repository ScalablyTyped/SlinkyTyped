package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.fixed
import typingsSlinky.devextreme.devextremeStrings.high
import typingsSlinky.devextreme.devextremeStrings.low
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.percent
import typingsSlinky.devextreme.devextremeStrings.stdDeviation
import typingsSlinky.devextreme.devextremeStrings.stdError
import typingsSlinky.devextreme.devextremeStrings.variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeLength extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var displayMode: js.UndefOr[auto | high | low | none] = js.native
  
  var edgeLength: js.UndefOr[Double] = js.native
  
  var highValueField: js.UndefOr[String] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var lowValueField: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[fixed | percent | stdDeviation | stdError | variance] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object EdgeLength {
  
  @scala.inline
  def apply(): EdgeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeLength]
  }
  
  @scala.inline
  implicit class EdgeLengthMutableBuilder[Self <: EdgeLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisplayMode(value: auto | high | low | none): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    @scala.inline
    def setEdgeLength(value: Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
    
    @scala.inline
    def setHighValueField(value: String): Self = StObject.set(x, "highValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighValueFieldUndefined: Self = StObject.set(x, "highValueField", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setLowValueField(value: String): Self = StObject.set(x, "lowValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowValueFieldUndefined: Self = StObject.set(x, "lowValueField", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setType(value: fixed | percent | stdDeviation | stdError | variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
