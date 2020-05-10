package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  var bodyAlign: js.UndefOr[TextAlignment] = js.native
  var bodyFontColor: js.UndefOr[ChartColor] = js.native
  var bodyFontFamily: js.UndefOr[String] = js.native
  var bodyFontSize: js.UndefOr[Double] = js.native
  var bodyFontStyle: js.UndefOr[String] = js.native
  var bodySpacing: js.UndefOr[Double] = js.native
  var borderColor: js.UndefOr[ChartColor] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[ChartTooltipCallback] = js.native
  var caretPadding: js.UndefOr[Double] = js.native
  var caretSize: js.UndefOr[Double] = js.native
  var cornerRadius: js.UndefOr[Double] = js.native
  var custom: js.UndefOr[js.Function1[/* tooltipModel */ ChartTooltipModel, Unit]] = js.native
  var displayColors: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[js.Function2[/* item */ ChartTooltipItem, /* data */ ChartData, Boolean]] = js.native
  var footerAlign: js.UndefOr[TextAlignment] = js.native
  var footerFontColor: js.UndefOr[ChartColor] = js.native
  var footerFontFamily: js.UndefOr[String] = js.native
  var footerFontSize: js.UndefOr[Double] = js.native
  var footerFontStyle: js.UndefOr[String] = js.native
  var footerMarginTop: js.UndefOr[Double] = js.native
  var footerSpacing: js.UndefOr[Double] = js.native
  var intersect: js.UndefOr[Boolean] = js.native
  var itemSort: js.UndefOr[
    js.Function3[
      /* itemA */ ChartTooltipItem, 
      /* itemB */ ChartTooltipItem, 
      /* data */ js.UndefOr[ChartData], 
      Double
    ]
  ] = js.native
  var mode: js.UndefOr[InteractionMode] = js.native
  var multiKeyBackground: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var titleAlign: js.UndefOr[TextAlignment] = js.native
  var titleFontColor: js.UndefOr[ChartColor] = js.native
  var titleFontFamily: js.UndefOr[String] = js.native
  var titleFontSize: js.UndefOr[Double] = js.native
  var titleFontStyle: js.UndefOr[String] = js.native
  var titleMarginBottom: js.UndefOr[Double] = js.native
  var titleSpacing: js.UndefOr[Double] = js.native
  var xPadding: js.UndefOr[Double] = js.native
  var yPadding: js.UndefOr[Double] = js.native
}

object ChartTooltipOptions {
  @scala.inline
  def apply(): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipOptions]
  }
  @scala.inline
  implicit class ChartTooltipOptionsOps[Self <: ChartTooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyAlign(value: TextAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBodySpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodySpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: ChartTooltipCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: /* tooltipModel */ ChartTooltipModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayColors")(js.undefined)
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
    def withFilter(value: (/* item */ ChartTooltipItem, /* data */ ChartData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterAlign(value: TextAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerMarginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSort(
      value: (/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, /* data */ js.UndefOr[ChartData]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutItemSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSort")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: InteractionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiKeyBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiKeyBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiKeyBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiKeyBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAlign(value: TextAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withXPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withYPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPadding")(js.undefined)
        ret
    }
  }
  
}

