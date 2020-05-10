package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendBubbleLegendOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
    * also defined for an individual range.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
    * pixels, can be also defined for an individual range.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend' circle graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
    * Applies to ranges, if individual color is not defined.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend's connector graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var connectorClassName: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
    * defined for an individual range.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
    * If labels are centered, the distance is reduced to 0.
    */
  var connectorDistance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
    */
  var labels: js.UndefOr[LegendBubbleLegendLabelsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
    * the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var minSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Options for specific range. One range
    * consists of bubble, label and connector.
    */
  var ranges: js.UndefOr[js.Array[LegendBubbleLegendRangesOptions]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
    * should be represented by the area or the width of the bubble. The
    * default, area, corresponds best to the human perception of the size of
    * each bubble.
    */
  var sizeBy: js.UndefOr[BubbleSizeByValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
    * of z determines the size of the bubble. This means that with the default
    * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
    * of value 1, while a bubble of value 0 will have a smaller size according
    * to minSize.
    */
  var sizeByAbsoluteValue: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
    * legend.
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
    * zThreshold, are skipped.
    */
  var zThreshold: js.UndefOr[Double] = js.native
}

object LegendBubbleLegendOptions {
  @scala.inline
  def apply(): LegendBubbleLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendOptions]
  }
  @scala.inline
  implicit class LegendBubbleLegendOptionsOps[Self <: LegendBubbleLegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withConnectorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorWidth")(js.undefined)
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
    def withLabels(value: LegendBubbleLegendLabelsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[LegendBubbleLegendRangesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeBy(value: BubbleSizeByValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeByAbsoluteValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeByAbsoluteValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeByAbsoluteValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeByAbsoluteValue")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zThreshold")(js.undefined)
        ret
    }
  }
  
}

