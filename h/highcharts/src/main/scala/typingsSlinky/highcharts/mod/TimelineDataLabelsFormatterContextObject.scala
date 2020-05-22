package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  var key: js.UndefOr[String] = js.undefined
}

object TimelineDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    point: Point,
    series: Series,
    x: Double,
    key: String = null,
    percentage: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    y: Double = null.asInstanceOf[Double]
  ): TimelineDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineDataLabelsFormatterContextObject]
  }
}

