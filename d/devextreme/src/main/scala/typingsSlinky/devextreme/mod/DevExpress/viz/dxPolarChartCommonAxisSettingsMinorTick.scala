package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonAxisSettingsMinorTick extends js.Object {
  
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick.color */
  var color: js.UndefOr[String] = js.native
  
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick.length */
  var length: js.UndefOr[Double] = js.native
  
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick.opacity */
  var opacity: js.UndefOr[Double] = js.native
  
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick.visible */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick.width */
  var width: js.UndefOr[Double] = js.native
}
object dxPolarChartCommonAxisSettingsMinorTick {
  
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsMinorTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsMinorTick]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsMinorTickOps[Self <: dxPolarChartCommonAxisSettingsMinorTick] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
