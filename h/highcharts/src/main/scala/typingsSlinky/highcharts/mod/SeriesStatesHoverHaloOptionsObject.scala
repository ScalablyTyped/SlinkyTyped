package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesStatesHoverHaloOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) A collection of SVG attributes to override the
    * appearance of the halo, for example `fill`, `stroke` and `stroke-width`.
    */
  var attributes: js.UndefOr[PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
    * overridden using the `attributes` setting. Note that Highcharts is only
    * able to apply opacity to colors of hex or rgb(a) formats.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The pixel size of the halo. For point markers
    * this is the radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and is the width of
    * the halo outside the bubble.
    */
  var size: js.UndefOr[Double] = js.native
}
object SeriesStatesHoverHaloOptionsObject {
  
  @scala.inline
  def apply(): SeriesStatesHoverHaloOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesHoverHaloOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesStatesHoverHaloOptionsObjectMutableBuilder[Self <: SeriesStatesHoverHaloOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
