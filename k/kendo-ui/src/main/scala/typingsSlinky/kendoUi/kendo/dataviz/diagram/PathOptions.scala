package typingsSlinky.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathOptions extends StObject {
  
  var data: js.UndefOr[String] = js.native
  
  var endCap: js.UndefOr[String | PathEndCap] = js.native
  
  var fill: js.UndefOr[String | PathFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var startCap: js.UndefOr[String | PathStartCap] = js.native
  
  var stroke: js.UndefOr[PathStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object PathOptions {
  
  @scala.inline
  def apply(): PathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOptions]
  }
  
  @scala.inline
  implicit class PathOptionsMutableBuilder[Self <: PathOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEndCap(value: String | PathEndCap): Self = StObject.set(x, "endCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCapUndefined: Self = StObject.set(x, "endCap", js.undefined)
    
    @scala.inline
    def setFill(value: String | PathFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStartCap(value: String | PathStartCap): Self = StObject.set(x, "startCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCapUndefined: Self = StObject.set(x, "startCap", js.undefined)
    
    @scala.inline
    def setStroke(value: PathStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
