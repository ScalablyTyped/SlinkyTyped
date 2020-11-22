package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ValueValueText
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartValueAxisLabel extends dxChartCommonAxisSettingsLabel {
  
  /**
    * [descr:dxChart.Options.valueAxis.label.customizeHint]
    */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.label.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.label.format]
    */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
}
object dxChartValueAxisLabel {
  
  @scala.inline
  def apply(): dxChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisLabel]
  }
  
  @scala.inline
  implicit class dxChartValueAxisLabelOps[Self <: dxChartValueAxisLabel] (val x: Self) extends AnyVal {
    
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
    def setCustomizeHint(value: /* axisValue */ ValueValueText => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* axisValue */ ValueValueText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | js.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
