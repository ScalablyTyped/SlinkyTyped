package typingsSlinky.chartJs.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var datasets: js.UndefOr[js.Array[ChartDataSets]] = js.undefined
  var labels: js.UndefOr[
    js.Array[
      String | (js.Array[js.Date | Double | Moment | String]) | Double | js.Date | Moment
    ]
  ] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(
    datasets: js.Array[ChartDataSets] = null,
    labels: js.Array[
      String | (js.Array[js.Date | Double | Moment | String]) | Double | js.Date | Moment
    ] = null
  ): ChartData = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

