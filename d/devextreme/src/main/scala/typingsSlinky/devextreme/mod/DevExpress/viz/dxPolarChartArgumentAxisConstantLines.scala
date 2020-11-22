package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartArgumentAxisConstantLines extends dxPolarChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * [descr:dxPolarChart.Options.argumentAxis.constantLines.displayBehindSeries]
    */
  var displayBehindSeries: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.argumentAxis.constantLines.extendAxis]
    */
  var extendAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.argumentAxis.constantLines.label]
    */
  @JSName("label")
  var label_dxPolarChartArgumentAxisConstantLines: js.UndefOr[dxPolarChartArgumentAxisConstantLinesLabel] = js.native
  
  /**
    * [descr:dxPolarChart.Options.argumentAxis.constantLines.value]
    */
  var value: js.UndefOr[Double | js.Date | String] = js.native
}
object dxPolarChartArgumentAxisConstantLines {
  
  @scala.inline
  def apply(): dxPolarChartArgumentAxisConstantLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisConstantLines]
  }
  
  @scala.inline
  implicit class dxPolarChartArgumentAxisConstantLinesOps[Self <: dxPolarChartArgumentAxisConstantLines] (val x: Self) extends AnyVal {
    
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
    def setDisplayBehindSeries(value: Boolean): Self = this.set("displayBehindSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayBehindSeries: Self = this.set("displayBehindSeries", js.undefined)
    
    @scala.inline
    def setExtendAxis(value: Boolean): Self = this.set("extendAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendAxis: Self = this.set("extendAxis", js.undefined)
    
    @scala.inline
    def setLabel(value: dxPolarChartArgumentAxisConstantLinesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setValueDate(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | js.Date | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
