package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleChartSpec extends js.Object {
  var bubbleBorderColor: js.UndefOr[Color] = js.native
  var bubbleLabels: js.UndefOr[ChartData] = js.native
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.native
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.native
  var bubbleOpacity: js.UndefOr[Double] = js.native
  var bubbleSizes: js.UndefOr[ChartData] = js.native
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.native
  var domain: js.UndefOr[ChartData] = js.native
  var groupIds: js.UndefOr[ChartData] = js.native
  var legendPosition: js.UndefOr[String] = js.native
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

