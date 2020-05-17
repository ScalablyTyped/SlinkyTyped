package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ValueText
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies common options for scale labels. */
@js.native
trait BaseGaugeScaleLabel extends js.Object {
  /** Specifies a callback function that returns the text to be displayed in scale labels. */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueText, String]] = js.native
  /** Specifies font options for the text displayed in the scale labels of the gauge. */
  var font: js.UndefOr[Font] = js.native
  /** Formats a value before it is displayed in a scale label. Accepts only numeric formats. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Decides how to arrange scale labels when there is not enough space to keep all of them. */
  var overlappingBehavior: js.UndefOr[hide | none] = js.native
  /** Specifies whether or not scale labels should be colored similarly to their corresponding ranges in the range container. */
  var useRangeColors: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not scale labels are visible on the gauge. */
  var visible: js.UndefOr[Boolean] = js.native
}

object BaseGaugeScaleLabel {
  @scala.inline
  def apply(): BaseGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScaleLabel]
  }
  @scala.inline
  implicit class BaseGaugeScaleLabelOps[Self <: BaseGaugeScaleLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizeText(value: /* scaleValue */ ValueText => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
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
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlappingBehavior(value: hide | none): Self = {
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
    def withUseRangeColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRangeColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRangeColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRangeColors")(js.undefined)
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

