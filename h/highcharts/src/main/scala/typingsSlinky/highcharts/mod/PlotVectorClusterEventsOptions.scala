package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVectorClusterEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Fires when the cluster point is clicked and
    * `drillToCluster` is enabled. One parameter, `event`, is passed to the
    * function. The default action is to zoom to the cluster points range. This
    * can be prevented by calling `event.preventDefault()`.
    */
  var drillToCluster: js.UndefOr[MarkerClusterDrillCallbackFunction] = js.native
}
object PlotVectorClusterEventsOptions {
  
  @scala.inline
  def apply(): PlotVectorClusterEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVectorClusterEventsOptions]
  }
  
  @scala.inline
  implicit class PlotVectorClusterEventsOptionsMutableBuilder[Self <: PlotVectorClusterEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrillToCluster(value: MarkerClusterDrillCallbackFunction): Self = StObject.set(x, "drillToCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillToClusterUndefined: Self = StObject.set(x, "drillToCluster", js.undefined)
  }
}
