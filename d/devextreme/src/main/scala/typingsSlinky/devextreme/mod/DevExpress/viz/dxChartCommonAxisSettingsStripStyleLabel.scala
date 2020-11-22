package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartCommonAxisSettingsStripStyleLabel extends js.Object {
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.label.font]
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.label.horizontalAlignment]
    */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.label.verticalAlignment]
    */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.native
}
object dxChartCommonAxisSettingsStripStyleLabel {
  
  @scala.inline
  def apply(): dxChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyleLabel]
  }
  
  @scala.inline
  implicit class dxChartCommonAxisSettingsStripStyleLabelOps[Self <: dxChartCommonAxisSettingsStripStyleLabel] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | center | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
}
