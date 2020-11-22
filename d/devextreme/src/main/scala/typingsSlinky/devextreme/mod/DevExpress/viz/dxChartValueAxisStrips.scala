package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartValueAxisStrips extends dxChartCommonAxisSettingsStripStyle {
  
  /**
    * [descr:dxChart.Options.valueAxis.strips.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.strips.endValue]
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.strips.label]
    */
  @JSName("label")
  var label_dxChartValueAxisStrips: js.UndefOr[dxChartValueAxisStripsLabel] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.strips.startValue]
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.native
}
object dxChartValueAxisStrips {
  
  @scala.inline
  def apply(): dxChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisStrips]
  }
  
  @scala.inline
  implicit class dxChartValueAxisStripsOps[Self <: dxChartValueAxisStrips] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEndValueDate(value: js.Date): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValue(value: Double | js.Date | String): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartValueAxisStripsLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setStartValueDate(value: js.Date): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: Double | js.Date | String): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
}
