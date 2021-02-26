package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsTunnelTypeOptions extends StObject {
  
  /**
    * (Highstock) Background options.
    */
  var background: js.UndefOr[js.Object | AnnotationsTunnelTypeBackgroundOptions] = js.native
  
  /**
    * (Highstock) The height of the annotation in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Options for the control point which controls the annotation's
    * height.
    */
  var heightControlPoint: js.UndefOr[AnnotationsTunnelTypeHeightControlPointOptions] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsTunnelTypeLineOptions] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsTunnelTypePointsOptions]] = js.native
  
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
object AnnotationsTunnelTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsTunnelTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsTunnelTypeOptionsMutableBuilder[Self <: AnnotationsTunnelTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: js.Object | AnnotationsTunnelTypeBackgroundOptions): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightControlPoint(value: AnnotationsTunnelTypeHeightControlPointOptions): Self = StObject.set(x, "heightControlPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightControlPointUndefined: Self = StObject.set(x, "heightControlPoint", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsTunnelTypeLineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsTunnelTypePointsOptions]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsTunnelTypePointsOptions*): Self = StObject.set(x, "points", js.Array(value :_*))
    
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
