package typingsSlinky.canvasGauges.CanvasGauges

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericOptions extends js.Object {
  var animateOnInit: js.UndefOr[Boolean] = js.native
  var animatedValue: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationRule: js.UndefOr[String | AnimationRule] = js.native
  var barProgress: js.UndefOr[Boolean] = js.native
  var barShadow: js.UndefOr[Double] = js.native
  var barStrokeWidth: js.UndefOr[Double] = js.native
  var barWidth: js.UndefOr[Double] = js.native
  var borderInnerWidth: js.UndefOr[Double] = js.native
  var borderMiddleWidth: js.UndefOr[Double] = js.native
  var borderOuterWidth: js.UndefOr[Double] = js.native
  var borderShadowWidth: js.UndefOr[Double] = js.native
  var borders: js.UndefOr[Boolean] = js.native
  var colorBar: js.UndefOr[String] = js.native
  var colorBarProgress: js.UndefOr[String] = js.native
  var colorBarShadow: js.UndefOr[String] = js.native
  var colorBarStroke: js.UndefOr[String] = js.native
  var colorBorderInner: js.UndefOr[String] = js.native
  var colorBorderInnerEnd: js.UndefOr[String] = js.native
  var colorBorderMiddle: js.UndefOr[String] = js.native
  var colorBorderMiddleEnd: js.UndefOr[String] = js.native
  var colorBorderOuter: js.UndefOr[String] = js.native
  var colorBorderOuterEnd: js.UndefOr[String] = js.native
  var colorBorderShadow: js.UndefOr[String] = js.native
  var colorMajorTicks: js.UndefOr[String] = js.native
  var colorMinorTicks: js.UndefOr[String] = js.native
  var colorNeedle: js.UndefOr[String] = js.native
  var colorNeedleEnd: js.UndefOr[String] = js.native
  var colorNeedleShadowDown: js.UndefOr[String] = js.native
  var colorNeedleShadowUp: js.UndefOr[String] = js.native
  var colorNumbers: js.UndefOr[String] = js.native
  var colorPlate: js.UndefOr[String] = js.native
  var colorPlateEnd: js.UndefOr[String] = js.native
  var colorTitle: js.UndefOr[String] = js.native
  var colorUnits: js.UndefOr[String] = js.native
  var colorValueBoxBackground: js.UndefOr[String] = js.native
  var colorValueBoxRect: js.UndefOr[String] = js.native
  var colorValueBoxRectEnd: js.UndefOr[String] = js.native
  var colorValueBoxShadow: js.UndefOr[String] = js.native
  var colorValueText: js.UndefOr[String] = js.native
  var colorValueTextShadow: js.UndefOr[String] = js.native
  var exactTicks: js.UndefOr[Boolean] = js.native
  var fontNumbers: js.UndefOr[String] = js.native
  var fontNumbersSize: js.UndefOr[Double] = js.native
  var fontNumbersStyle: js.UndefOr[FontStyle] = js.native
  var fontNumbersWeight: js.UndefOr[FontWeight] = js.native
  var fontTitle: js.UndefOr[String] = js.native
  var fontTitleSize: js.UndefOr[Double] = js.native
  var fontTitleStyle: js.UndefOr[FontStyle] = js.native
  var fontTitleWeight: js.UndefOr[FontWeight] = js.native
  var fontUnits: js.UndefOr[String] = js.native
  var fontUnitsSize: js.UndefOr[Double] = js.native
  var fontUnitsStyle: js.UndefOr[FontStyle] = js.native
  var fontUnitsWeight: js.UndefOr[FontWeight] = js.native
  var fontValue: js.UndefOr[String] = js.native
  var fontValueSize: js.UndefOr[Double] = js.native
  var fontValueStyle: js.UndefOr[FontStyle] = js.native
  var fontValueWeight: js.UndefOr[FontWeight] = js.native
  var height: js.UndefOr[Double] = js.native
  var highlights: js.UndefOr[js.Array[Highlight]] = js.native
  var highlightsWidth: js.UndefOr[Double] = js.native
  var listeners: js.UndefOr[EventListeners] = js.native
  var majorTicks: js.UndefOr[MajorTicks] = js.native
  var majorTicksDec: js.UndefOr[Double] = js.native
  var majorTicksInt: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var minorTicks: js.UndefOr[Double] = js.native
  var needle: js.UndefOr[Boolean] = js.native
  var needleEnd: js.UndefOr[Double] = js.native
  var needleShadow: js.UndefOr[Boolean] = js.native
  var needleStart: js.UndefOr[Double] = js.native
  var needleType: js.UndefOr[String] = js.native
  var needleWidth: js.UndefOr[Double] = js.native
  var numbersMargin: js.UndefOr[Double] = js.native
  var renderTo: RenderTarget = js.native
  var strokeTicks: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
  var units: js.UndefOr[String | Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
  var valueBox: js.UndefOr[Boolean] = js.native
  var valueBoxBorderRadius: js.UndefOr[Double] = js.native
  var valueBoxStroke: js.UndefOr[Double] = js.native
  var valueBoxWidth: js.UndefOr[Double] = js.native
  var valueDec: js.UndefOr[Double] = js.native
  var valueInt: js.UndefOr[Double] = js.native
  var valueText: js.UndefOr[String] = js.native
  var valueTextShadow: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GenericOptions {
  @scala.inline
  def apply(renderTo: RenderTarget): GenericOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericOptions]
  }
  @scala.inline
  implicit class GenericOptionsOps[Self <: GenericOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderToHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTo(value: RenderTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationRuleFunction1(value: /* percent */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimationRule(value: String | AnimationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationRule")(js.undefined)
        ret
    }
    @scala.inline
    def withBarProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withBarShadow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderInnerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInnerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderInnerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderInnerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderMiddleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderMiddleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderMiddleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderMiddleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOuterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOuterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOuterWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderShadowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderShadowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderShadowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderShadowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBar")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBarProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBarProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBarShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBarShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBarStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBarStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderInner")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderInnerEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderInnerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderInnerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderInnerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderMiddle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderMiddle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderMiddle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderMiddle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderMiddleEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderMiddleEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderMiddleEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderMiddleEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderOuter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderOuter")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderOuterEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderOuterEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderOuterEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderOuterEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBorderShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBorderShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBorderShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMajorTicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMajorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMajorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMinorTicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMinorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMinorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleShadowDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleShadowDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleShadowDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleShadowDown")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNeedleShadowUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleShadowUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNeedleShadowUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNeedleShadowUp")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNumbers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPlate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPlate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPlate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPlate")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPlateEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPlateEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPlateEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPlateEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueBoxBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueBoxBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueBoxRect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueBoxRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxRect")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueBoxRectEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxRectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueBoxRectEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxRectEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueBoxShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueBoxShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueBoxShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueText")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValueTextShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueTextShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValueTextShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValueTextShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withExactTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNumbers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNumbersSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNumbersSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNumbersStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNumbersStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNumbersWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNumbersWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNumbersWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontTitleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontTitleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontTitleStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontTitleWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontTitleWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontTitleWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withFontUnitsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontUnitsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontUnitsStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontUnitsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontUnitsWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontUnitsWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUnitsWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFontValueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontValueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontValueStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontValueStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontValueWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontValueWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontValueWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlights(value: js.Array[Highlight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightsWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightsWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightsWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightsWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: EventListeners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicks(value: MajorTicks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicksDec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicksDec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicksDec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicksDec")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicksInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicksInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicksInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicksInt")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needle")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStart")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleType")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNumbersMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbersMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumbersMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbersMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBox")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBoxBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoxBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBoxStroke(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoxStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withValueBoxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDec")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInt")(js.undefined)
        ret
    }
    @scala.inline
    def withValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTextShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTextShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

