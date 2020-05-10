package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettingsLabel extends js.Object {
  /** Specifies font options for axis labels. */
  var font: js.UndefOr[Font] = js.native
  /** Specifies the spacing between an axis and its labels in pixels. */
  var indentFromAxis: js.UndefOr[Double] = js.native
  /** Decides how to arrange axis labels when there is not enough space to keep all of them. */
  var overlappingBehavior: js.UndefOr[none | hide] = js.native
  /** Indicates whether or not axis labels are visible. */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxPolarChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsLabel]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsLabelOps[Self <: dxPolarChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFromAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFromAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlappingBehavior(value: none | hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlappingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

