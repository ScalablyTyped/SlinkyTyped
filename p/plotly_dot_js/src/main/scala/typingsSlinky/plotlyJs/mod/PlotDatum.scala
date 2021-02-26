package typingsSlinky.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotDatum extends StObject {
  
  var curveNumber: Double = js.native
  
  var customdata: Datum = js.native
  
  var data: PlotData = js.native
  
  var pointIndex: Double = js.native
  
  var pointNumber: Double = js.native
  
  var x: Datum = js.native
  
  var xaxis: LayoutAxis = js.native
  
  var y: Datum = js.native
  
  var yaxis: LayoutAxis = js.native
}
object PlotDatum {
  
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    xaxis: LayoutAxis,
    yaxis: LayoutAxis
  ): PlotDatum = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDatum]
  }
  
  @scala.inline
  implicit class PlotDatumMutableBuilder[Self <: PlotDatum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurveNumber(value: Double): Self = StObject.set(x, "curveNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdata(value: Datum): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataDate(value: js.Date): Self = StObject.set(x, "customdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomdataNull: Self = StObject.set(x, "customdata", null)
    
    @scala.inline
    def setData(value: PlotData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointNumber(value: Double): Self = StObject.set(x, "pointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Datum): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDate(value: js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXNull: Self = StObject.set(x, "x", null)
    
    @scala.inline
    def setXaxis(value: LayoutAxis): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Datum): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDate(value: js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYNull: Self = StObject.set(x, "y", null)
    
    @scala.inline
    def setYaxis(value: LayoutAxis): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
  }
}
