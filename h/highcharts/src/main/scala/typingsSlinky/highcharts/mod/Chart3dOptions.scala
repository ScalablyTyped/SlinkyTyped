package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart3dOptions extends StObject {
  
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Set it to `"auto"` to automatically move the labels to the
    * best edge.
    */
  var axisLabelPosition: js.UndefOr[auto | Null] = js.native
  
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var beta: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The total depth of the chart.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Wether to render the chart using the 3D functionality.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether the 3d box should automatically adjust to the chart
    * plot area.
    */
  var fitToPlot: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[Chart3dFrameOptions] = js.native
  
  /**
    * (Highcharts) Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective effect in
    * column and scatter charts. It is not used for 3D pie charts.
    */
  var viewDistance: js.UndefOr[Double] = js.native
}
object Chart3dOptions {
  
  @scala.inline
  def apply(): Chart3dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dOptions]
  }
  
  @scala.inline
  implicit class Chart3dOptionsMutableBuilder[Self <: Chart3dOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAxisLabelPosition(value: auto): Self = StObject.set(x, "axisLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabelPositionNull: Self = StObject.set(x, "axisLabelPosition", null)
    
    @scala.inline
    def setAxisLabelPositionUndefined: Self = StObject.set(x, "axisLabelPosition", js.undefined)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFitToPlot(value: Boolean): Self = StObject.set(x, "fitToPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToPlotUndefined: Self = StObject.set(x, "fitToPlot", js.undefined)
    
    @scala.inline
    def setFrame(value: Chart3dFrameOptions): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setViewDistance(value: Double): Self = StObject.set(x, "viewDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDistanceUndefined: Self = StObject.set(x, "viewDistance", js.undefined)
  }
}
