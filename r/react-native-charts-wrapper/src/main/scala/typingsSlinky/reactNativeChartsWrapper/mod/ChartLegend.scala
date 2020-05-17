package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Colors
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CENTER
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DEFAULT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.EMPTY
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TO_RIGHT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.NONE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TO_LEFT
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegend extends js.Object {
  var custom: js.UndefOr[Colors] = js.native
  var direction: js.UndefOr[LEFT_TO_RIGHT | RIGHT_TO_LEFT] = js.native
  var drawInside: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var form: js.UndefOr[NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE] = js.native
  var formSize: js.UndefOr[Double] = js.native
  var formToTextSpace: js.UndefOr[Double] = js.native
  var horizontalAlignment: js.UndefOr[LEFT | CENTER | RIGHT] = js.native
  var maxSizePercent: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[HORIZONTAL | VERTICAL] = js.native
  var textColor: js.UndefOr[Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
  var verticalAlignment: js.UndefOr[TOP | CENTER | BOTTOM] = js.native
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
  var xEntrySpace: js.UndefOr[Double] = js.native
  var yEntrySpace: js.UndefOr[Double] = js.native
}

object ChartLegend {
  @scala.inline
  def apply(): ChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegend]
  }
  @scala.inline
  implicit class ChartLegendOps[Self <: ChartLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: Colors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: LEFT_TO_RIGHT | RIGHT_TO_LEFT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawInside")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withFormSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFormToTextSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formToTextSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormToTextSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formToTextSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: LEFT | CENTER | RIGHT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: HORIZONTAL | VERTICAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: TOP | CENTER | BOTTOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withXEntrySpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xEntrySpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXEntrySpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xEntrySpace")(js.undefined)
        ret
    }
    @scala.inline
    def withYEntrySpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yEntrySpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYEntrySpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yEntrySpace")(js.undefined)
        ret
    }
  }
  
}

