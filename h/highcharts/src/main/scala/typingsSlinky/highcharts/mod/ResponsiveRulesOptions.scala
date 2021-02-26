package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveRulesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A full set of chart options to
    * apply as overrides to the general chart options. The chart options are
    * applied when the given rule is active.
    *
    * A special case is configuration objects that take arrays, for example
    * xAxis, yAxis or series. For these collections, an `id` option is used to
    * map the new option set to an existing object. If an existing object of
    * the same id is not found, the item of the same indexupdated. So for
    * example, setting `chartOptions` with two series items without an `id`,
    * will cause the existing chart's two series to be updated with respective
    * options.
    */
  var chartOptions: js.UndefOr[Options] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Under which conditions the rule
    * applies.
    */
  var condition: js.UndefOr[ResponsiveRulesConditionOptions] = js.native
}
object ResponsiveRulesOptions {
  
  @scala.inline
  def apply(): ResponsiveRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveRulesOptions]
  }
  
  @scala.inline
  implicit class ResponsiveRulesOptionsMutableBuilder[Self <: ResponsiveRulesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartOptions(value: Options): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartOptionsUndefined: Self = StObject.set(x, "chartOptions", js.undefined)
    
    @scala.inline
    def setCondition(value: ResponsiveRulesConditionOptions): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
