package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesStatesInactiveOptionsObject extends StObject {
  
  /**
    * (Highstock) Animation when not hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highstock) Enable or disable the inactive state for a series
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.native
}
object SeriesStatesInactiveOptionsObject {
  
  @scala.inline
  def apply(): SeriesStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesInactiveOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesStatesInactiveOptionsObjectMutableBuilder[Self <: SeriesStatesInactiveOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOpacityUndefined: Self = StObject.set(x, "linkOpacity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
