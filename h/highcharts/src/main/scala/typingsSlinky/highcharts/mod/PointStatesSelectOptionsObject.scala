package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointStatesSelectOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Enable or disable visible feedback for selection.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) The fill color of the point marker.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Set the marker's fixed height on select state.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The number of pixels to increase the height of
    * the hovered point.
    */
  var heightPlus: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) Set the marker's fixed width on select state.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The number of pixels to increase the width of the
    * hovered point.
    */
  var widthPlus: js.UndefOr[Double] = js.native
}
object PointStatesSelectOptionsObject {
  
  @scala.inline
  def apply(): PointStatesSelectOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesSelectOptionsObject]
  }
  
  @scala.inline
  implicit class PointStatesSelectOptionsObjectMutableBuilder[Self <: PointStatesSelectOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPlus(value: Double): Self = StObject.set(x, "heightPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPlusUndefined: Self = StObject.set(x, "heightPlus", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPlus(value: Double): Self = StObject.set(x, "widthPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPlusUndefined: Self = StObject.set(x, "widthPlus", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
