package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsStripStyle extends js.Object {
  /** Configures the appearance of strip labels. */
  var label: js.UndefOr[dxChartCommonAxisSettingsStripStyleLabel] = js.native
  /** Generates a pixel-measured empty space between the left/right border of a strip and the strip label. */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  /** Generates a pixel-measured empty space between the top/bottom border of a strip and the strip label. */
  var paddingTopBottom: js.UndefOr[Double] = js.native
}

object dxChartCommonAxisSettingsStripStyle {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyle]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsStripStyleOps[Self <: dxChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: dxChartCommonAxisSettingsStripStyleLabel): Self = {
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
    @scala.inline
    def withPaddingLeftRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeftRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeftRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTopBottom")(js.undefined)
        ret
    }
  }
  
}

