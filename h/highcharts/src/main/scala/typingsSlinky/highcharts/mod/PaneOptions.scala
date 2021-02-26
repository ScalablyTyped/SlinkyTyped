package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneOptions extends StObject {
  
  /**
    * (Highcharts) An array of background items for the pane.
    */
  var background: js.UndefOr[js.Array[PaneBackgroundOptions]] = js.native
  
  /**
    * (Highcharts) The center of a polar chart or angular gauge, given as an
    * array of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.native
  
  /**
    * (Highcharts) The end angle of the polar X axis or gauge value axis, given
    * in degrees where 0 is north. Defaults to startAngle
    *
    * + 360.
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The inner size of the pane, either as a number defining
    * pixels, or a percentage defining a percentage of the pane's size.
    */
  var innerSize: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The size of the pane, either as a number defining pixels, or
    * a percentage defining a percentage of the available plot area (the
    * smallest of the plot height or plot width).
    */
  var size: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The start angle of the polar X axis or gauge axis, given in
    * degrees where 0 is north. Defaults to 0.
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object PaneOptions {
  
  @scala.inline
  def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  
  @scala.inline
  implicit class PaneOptionsMutableBuilder[Self <: PaneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: js.Array[PaneBackgroundOptions]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBackgroundVarargs(value: PaneBackgroundOptions*): Self = StObject.set(x, "background", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[String | Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: (String | Double)*): Self = StObject.set(x, "center", js.Array(value :_*))
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerSize(value: Double | String): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
