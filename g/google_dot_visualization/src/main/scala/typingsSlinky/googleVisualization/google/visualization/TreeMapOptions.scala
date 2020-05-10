package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMapOptions extends js.Object {
  var fontColor: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var headerHeight: js.UndefOr[Double] = js.native
  var headerHighlightColor: js.UndefOr[String] = js.native
  var hintOpacity: js.UndefOr[Double] = js.native
  var maxColor: js.UndefOr[String] = js.native
  var maxColorValue: js.UndefOr[Double] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var maxHighlightColor: js.UndefOr[String] = js.native
  var maxPostDepth: js.UndefOr[Double] = js.native
  var midColor: js.UndefOr[String] = js.native
  var midHighlightColor: js.UndefOr[String] = js.native
  var minColor: js.UndefOr[String] = js.native
  var minColorValue: js.UndefOr[Double] = js.native
  var minHighlightColor: js.UndefOr[String] = js.native
  var showScale: js.UndefOr[Boolean] = js.native
  var showTooltips: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.native
  var useWeightedAverageForAggregation: js.UndefOr[Boolean] = js.native
}

object TreeMapOptions {
  @scala.inline
  def apply(): TreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapOptions]
  }
  @scala.inline
  implicit class TreeMapOptionsOps[Self <: TreeMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontColor(value: String): Self = {
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
    def withForceIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHintOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPostDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPostDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPostDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPostDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMidColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMidHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColorValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withTitleTextStyle(value: ChartTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWeightedAverageForAggregation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWeightedAverageForAggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWeightedAverageForAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWeightedAverageForAggregation")(js.undefined)
        ret
    }
  }
  
}

