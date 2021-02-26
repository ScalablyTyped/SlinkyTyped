package typingsSlinky.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltipItem extends StObject {
  
  var datasetIndex: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xLabel: js.UndefOr[String | Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yLabel: js.UndefOr[String | Double] = js.native
}
object ChartTooltipItem {
  
  @scala.inline
  def apply(): ChartTooltipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipItem]
  }
  
  @scala.inline
  implicit class ChartTooltipItemMutableBuilder[Self <: ChartTooltipItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIndexUndefined: Self = StObject.set(x, "datasetIndex", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXLabel(value: String | Double): Self = StObject.set(x, "xLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXLabelUndefined: Self = StObject.set(x, "xLabel", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYLabel(value: String | Double): Self = StObject.set(x, "yLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYLabelUndefined: Self = StObject.set(x, "yLabel", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
