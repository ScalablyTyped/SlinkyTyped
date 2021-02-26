package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotLineDataSortingOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Enable or disable data sorting for the series.
    * Use xAxis.reversed to change the sorting order.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Whether to allow matching points by name in an
    * update. If this option is disabled, points will be matched by order.
    */
  var matchByName: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock) Determines what data value should be used to sort
    * by.
    */
  var sortKey: js.UndefOr[String] = js.native
}
object PlotLineDataSortingOptions {
  
  @scala.inline
  def apply(): PlotLineDataSortingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLineDataSortingOptions]
  }
  
  @scala.inline
  implicit class PlotLineDataSortingOptionsMutableBuilder[Self <: PlotLineDataSortingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMatchByName(value: Boolean): Self = StObject.set(x, "matchByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchByNameUndefined: Self = StObject.set(x, "matchByName", js.undefined)
    
    @scala.inline
    def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
  }
}
