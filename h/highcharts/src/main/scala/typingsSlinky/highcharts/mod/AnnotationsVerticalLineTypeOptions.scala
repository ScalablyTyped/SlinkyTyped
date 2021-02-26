package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsVerticalLineTypeOptions extends StObject {
  
  /**
    * (Highstock) Connector options.
    */
  var connector: js.UndefOr[AnnotationsVerticalLineTypeConnectorOptions] = js.native
  
  /**
    * (Highstock) Label options.
    */
  var label: js.UndefOr[AnnotationsVerticalLineTypeLabelOptions] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsVerticalLineTypeLineOptions] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsVerticalLineTypePointsOptions]] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsVerticalLineTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsVerticalLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsVerticalLineTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsVerticalLineTypeOptionsMutableBuilder[Self <: AnnotationsVerticalLineTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnector(value: AnnotationsVerticalLineTypeConnectorOptions): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    @scala.inline
    def setLabel(value: AnnotationsVerticalLineTypeLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsVerticalLineTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsVerticalLineTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsVerticalLineTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
