package typingsSlinky.pixiJs.anon

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var align: js.UndefOr[String] = js.native
  var breakWords: js.UndefOr[Boolean] = js.native
  var dropShadow: js.UndefOr[Boolean] = js.native
  var dropShadowAlpha: js.UndefOr[Double] = js.native
  var dropShadowAngle: js.UndefOr[Double] = js.native
  var dropShadowBlur: js.UndefOr[Double] = js.native
  var dropShadowColor: js.UndefOr[String | Double] = js.native
  var dropShadowDistance: js.UndefOr[Double] = js.native
  var fill: js.UndefOr[String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern] = js.native
  var fillGradientStops: js.UndefOr[js.Array[Double]] = js.native
  var fillGradientType: js.UndefOr[Double] = js.native
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontVariant: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var leading: js.UndefOr[Double] = js.native
  var letterSpacing: js.UndefOr[Double] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[String] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[String | Double] = js.native
  var strokeThickness: js.UndefOr[Double] = js.native
  var textBaseline: js.UndefOr[String] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var whiteSpace: js.UndefOr[String] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
  var wordWrapWidth: js.UndefOr[Double] = js.native
}

object Align {
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWords")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadowAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadowAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadowAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadowAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadowColor(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDropShadowDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropShadowDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withFillCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillGradientStops(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillGradientStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientStops")(js.undefined)
        ret
    }
    @scala.inline
    def withFillGradientType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillGradientType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientType")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String | js.Array[String]): Self = {
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
    def withFontSize(value: Double | String): Self = {
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
    def withFontVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
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
    def withLeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
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
    def withLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(js.undefined)
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
    def withStroke(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBaseline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
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
    @scala.inline
    def withWordWrapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapWidth")(js.undefined)
        ret
    }
  }
  
}

