package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSankeyDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  /**
    * The node object. The node name, if defined, is available through
    * `this.point.name`.
    */
  @JSName("point")
  var point_SeriesSankeyDataLabelsFormatterContextObject: SankeyNodeObject
}

object SeriesSankeyDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    point: SankeyNodeObject,
    series: Series,
    x: Double,
    percentage: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    y: Double = null.asInstanceOf[Double]
  ): SeriesSankeyDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyDataLabelsFormatterContextObject]
  }
}

