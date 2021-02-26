package typingsSlinky.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatterDataPoint extends StObject {
  
  var curveNumber: Double = js.native
  
  var data: PlotData = js.native
  
  var pointIndex: Double = js.native
  
  var pointNumber: Double = js.native
  
  var x: Double = js.native
  
  var xaxis: LayoutAxis = js.native
  
  var y: Double = js.native
  
  var yaxis: LayoutAxis = js.native
}
object PlotScatterDataPoint {
  
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    x: Double,
    xaxis: LayoutAxis,
    y: Double,
    yaxis: LayoutAxis
  ): PlotScatterDataPoint = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatterDataPoint]
  }
  
  @scala.inline
  implicit class PlotScatterDataPointMutableBuilder[Self <: PlotScatterDataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: PlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxis(value: LayoutAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxis(value: LayoutAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
  }
}
