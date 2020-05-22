package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelsFormatterContextObject extends js.Object {
  /**
    * Stacked series and pies only. The point's percentage of the total.
    */
  var percentage: js.UndefOr[Double] = js.undefined
  /**
    * The point object. The point name, if defined, is available through
    * `this.point.name`.
    */
  var point: Point
  /**
    * The series object. The series name is available through
    * `this.series.name`.
    */
  var series: Series
  /**
    * Stacked series only. The total value at this point's x value.
    */
  var total: js.UndefOr[Double] = js.undefined
  /**
    * The x value.
    */
  var x: Double
  /**
    * The y value.
    */
  var y: Double | Null
}

object DataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    point: Point,
    series: Series,
    x: Double,
    percentage: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    y: Double = null.asInstanceOf[Double]
  ): DataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsFormatterContextObject]
  }
}

