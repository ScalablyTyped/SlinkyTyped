package typingsSlinky.echarts.echarts.VisualMap

import typingsSlinky.echarts.anon.InRange
import typingsSlinky.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typingsSlinky.echarts.echartsStrings.auto
import typingsSlinky.echarts.echartsStrings.bottom
import typingsSlinky.echarts.echartsStrings.continuous
import typingsSlinky.echarts.echartsStrings.horizontal
import typingsSlinky.echarts.echartsStrings.left
import typingsSlinky.echarts.echartsStrings.right
import typingsSlinky.echarts.echartsStrings.top
import typingsSlinky.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Continuous
  extends typingsSlinky.echarts.echarts.EChartOption.VisualMap {
  var align: js.UndefOr[auto | left | right | top | bottom] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var bottom: js.UndefOr[Double | String] = js.native
  var calculable: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[js.Array[String]] = js.native
  var controller: js.UndefOr[InRange] = js.native
  var dimension: js.UndefOr[String | Double] = js.native
  var formatter: js.UndefOr[String | js.Function] = js.native
  var hoverLink: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inRange: js.UndefOr[RangeObject] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  var itemHeight: js.UndefOr[Double] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double | String] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var orient: js.UndefOr[vertical | horizontal] = js.native
  var outOfRange: js.UndefOr[RangeObject] = js.native
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Array[Double]] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[Double | String] = js.native
  var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[js.Array[String]] = js.native
  var textGap: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.native
  var top: js.UndefOr[Double | String] = js.native
  var `type`: js.UndefOr[continuous] = js.native
  var z: js.UndefOr[Double] = js.native
  var zlevel: js.UndefOr[Double] = js.native
}

object Continuous {
  @scala.inline
  def apply(): Continuous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Continuous]
  }
  @scala.inline
  implicit class ContinuousOps[Self <: Continuous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: auto | left | right | top | bottom): Self = {
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
    def withBackgroundColor(value: String): Self = {
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
    def withBorderColor(value: String): Self = {
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
    def withBottom(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculable")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Array[String]): Self = {
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
    def withController(value: InRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withDimension(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverLink")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInRange(value: RangeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
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
    def withMin(value: Double): Self = {
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
    def withOrient(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orient")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfRange(value: RangeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | js.Array[Double]): Self = {
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
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textGap")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: BaseTextStyleWithRich): Self = {
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
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: continuous): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

