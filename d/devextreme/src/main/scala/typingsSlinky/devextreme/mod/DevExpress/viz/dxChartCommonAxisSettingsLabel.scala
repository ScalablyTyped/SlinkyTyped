package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.rotate
import typingsSlinky.devextreme.devextremeStrings.stagger
import typingsSlinky.devextreme.devextremeStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsLabel extends js.Object {
  /** Aligns axis labels in relation to ticks. */
  var alignment: js.UndefOr[center | left | right] = js.native
  /** Allows you to rotate or stagger axis labels. Applies to the horizontal axis only. */
  var displayMode: js.UndefOr[rotate | stagger | standard] = js.native
  /** Specifies font options for axis labels. */
  var font: js.UndefOr[Font] = js.native
  /** Adds a pixel-measured empty space between an axis and its labels. */
  var indentFromAxis: js.UndefOr[Double] = js.native
  /** Decides how to arrange axis labels when there is not enough space to keep all of them. */
  var overlappingBehavior: js.UndefOr[rotate | stagger | none | hide] = js.native
  /** Specifies the rotation angle of axis labels. Applies only if displayMode or overlappingBehavior is "rotate". */
  var rotationAngle: js.UndefOr[Double] = js.native
  /** Adds a pixel-measured empty space between two staggered rows of axis labels. Applies only if displayMode or overlappingBehavior is "stagger". */
  var staggeringSpacing: js.UndefOr[Double] = js.native
  /** Specifies what to do with axis labels that overflow the allocated space after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  /** Shows/hides axis labels. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies how to wrap texts that do not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object dxChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsLabel]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsLabelOps[Self <: dxChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: center | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: rotate | stagger | standard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
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
    def withOverlappingBehavior(value: rotate | stagger | none | hide): Self = {
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
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggeringSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggeringSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggeringSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggeringSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: ellipsis | hide | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
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
    @scala.inline
    def withWordWrap(value: normal | breakWord | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

