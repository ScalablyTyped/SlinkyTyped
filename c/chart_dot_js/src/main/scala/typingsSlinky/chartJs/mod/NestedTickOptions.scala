package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.chartJs.chartJsStrings.auto
import typingsSlinky.chartJs.chartJsStrings.data
import typingsSlinky.chartJs.chartJsStrings.labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedTickOptions extends js.Object {
  var autoSkip: js.UndefOr[Boolean] = js.native
  var autoSkipPadding: js.UndefOr[Double] = js.native
  var backdropColor: js.UndefOr[ChartColor] = js.native
  var backdropPaddingX: js.UndefOr[Double] = js.native
  var backdropPaddingY: js.UndefOr[Double] = js.native
  var beginAtZero: js.UndefOr[Boolean] = js.native
  /**
    * If the callback returns null or undefined the associated grid line will be hidden.
    */
  var callback: js.UndefOr[
    js.Function3[
      /* value */ Double | String, 
      /* index */ Double, 
      /* values */ js.Array[Double | String], 
      js.UndefOr[String | Double | Null]
    ]
  ] = js.native
  var display: js.UndefOr[Boolean] = js.native
  var fontColor: js.UndefOr[ChartColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var labelOffset: js.UndefOr[Double] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var maxRotation: js.UndefOr[Double] = js.native
  var maxTicksLimit: js.UndefOr[Double] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var minRotation: js.UndefOr[Double] = js.native
  var mirror: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * The number of ticks to examine when deciding how many labels will fit.
    * Setting a smaller value will be faster, but may be less accurate
    * when there is large variability in label length.
    * Deault: `ticks.length`
    */
  var sampleSize: js.UndefOr[Double] = js.native
  var showLabelBackdrop: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[auto | data | labels] = js.native
  var stepSize: js.UndefOr[Double] = js.native
  var suggestedMax: js.UndefOr[Double] = js.native
  var suggestedMin: js.UndefOr[Double] = js.native
}

object NestedTickOptions {
  @scala.inline
  def apply(): NestedTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedTickOptions]
  }
  @scala.inline
  implicit class NestedTickOptionsOps[Self <: NestedTickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSkipPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSkipPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSkipPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSkipPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropPaddingX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPaddingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropPaddingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPaddingX")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropPaddingY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPaddingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropPaddingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPaddingY")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginAtZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginAtZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginAtZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginAtZero")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(
      value: (/* value */ Double | String, /* index */ Double, /* values */ js.Array[Double | String]) => js.UndefOr[String | Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
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
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
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
    def withLabelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTicksLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTicksLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTicksLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTicksLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabelBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabelBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: auto | data | labels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedMax")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedMin")(js.undefined)
        ret
    }
  }
  
}

