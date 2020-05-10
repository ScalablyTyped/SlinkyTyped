package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettingsStripStyle extends js.Object {
  /** An object defining the configuration options for a strip label style. */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyleLabel] = js.native
}

object dxPolarChartCommonAxisSettingsStripStyle {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyle]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsStripStyleOps[Self <: dxPolarChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: dxPolarChartCommonAxisSettingsStripStyleLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

