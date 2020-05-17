package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRangeColor extends js.Object {
  var color: js.UndefOr[String] = js.native
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.native
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  var invalidRangeColor: js.UndefOr[String] = js.native
  var paddingLeftRight: js.UndefOr[Double] = js.native
  var paddingTopBottom: js.UndefOr[Double] = js.native
  var placeholderHeight: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object InvalidRangeColor {
  @scala.inline
  def apply(): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRangeColor]
  }
  @scala.inline
  implicit class InvalidRangeColorOps[Self <: InvalidRangeColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = {
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
    def withFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = {
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
    def withInvalidRangeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRangeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidRangeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRangeColor")(js.undefined)
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
    @scala.inline
    def withPlaceholderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderHeight")(js.undefined)
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

