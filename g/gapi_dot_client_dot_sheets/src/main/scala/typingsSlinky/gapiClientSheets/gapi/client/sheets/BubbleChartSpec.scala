package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleChartSpec extends js.Object {
  /** The bubble border color. */
  var bubbleBorderColor: js.UndefOr[Color] = js.native
  /**
    * The bubble border color.
    * If bubble_border_color is also set, this field takes precedence.
    */
  var bubbleBorderColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The data containing the bubble labels.  These do not need to be unique. */
  var bubbleLabels: js.UndefOr[ChartData] = js.native
  /**
    * The max radius size of the bubbles, in pixels.
    * If specified, the field must be a positive value.
    */
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.native
  /**
    * The minimum radius size of the bubbles, in pixels.
    * If specific, the field must be a positive value.
    */
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.native
  /**
    * The opacity of the bubbles between 0 and 1.0.
    * 0 is fully transparent and 1 is fully opaque.
    */
  var bubbleOpacity: js.UndefOr[Double] = js.native
  /**
    * The data contianing the bubble sizes.  Bubble sizes are used to draw
    * the bubbles at different sizes relative to each other.
    * If specified, group_ids must also be specified.  This field is
    * optional.
    */
  var bubbleSizes: js.UndefOr[ChartData] = js.native
  /**
    * The format of the text inside the bubbles.
    * Underline and Strikethrough are not supported.
    */
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.native
  /**
    * The data containing the bubble x-values.  These values locate the bubbles
    * in the chart horizontally.
    */
  var domain: js.UndefOr[ChartData] = js.native
  /**
    * The data containing the bubble group IDs. All bubbles with the same group
    * ID are drawn in the same color. If bubble_sizes is specified then
    * this field must also be specified but may contain blank values.
    * This field is optional.
    */
  var groupIds: js.UndefOr[ChartData] = js.native
  /** Where the legend of the chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * The data contianing the bubble y-values.  These values locate the bubbles
    * in the chart vertically.
    */
  var series: js.UndefOr[ChartData] = js.native
}

object BubbleChartSpec {
  @scala.inline
  def apply(): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartSpec]
  }
  @scala.inline
  implicit class BubbleChartSpecOps[Self <: BubbleChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbleBorderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleBorderColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleBorderColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleBorderColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleBorderColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleLabels(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleMaxRadiusSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleMaxRadiusSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleMaxRadiusSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleMaxRadiusSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleMinRadiusSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleMinRadiusSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleMinRadiusSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleMinRadiusSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleSizes(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleTextStyle(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIds(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
  }
  
}

