package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveRulesConditionOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to gain
    * complete control on when the responsive rule applies. Return `true` if it
    * applies. This opens for checking against other metrics than the chart
    * size, for example the document size or other elements.
    */
  var callback: js.UndefOr[ResponsiveCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is less than this.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is less than this.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart height is greater than this.
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The responsive rule applies if
    * the chart width is greater than this.
    */
  var minWidth: js.UndefOr[Double] = js.native
}
object ResponsiveRulesConditionOptions {
  
  @scala.inline
  def apply(): ResponsiveRulesConditionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveRulesConditionOptions]
  }
  
  @scala.inline
  implicit class ResponsiveRulesConditionOptionsOps[Self <: ResponsiveRulesConditionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: ResponsiveCallbackFunction): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
}
