package typingsSlinky.chartJs.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  var datasets: js.UndefOr[js.Array[ChartDataSets]] = js.native
  var labels: js.UndefOr[
    js.Array[
      String | (js.Array[js.Date | Double | Moment | String]) | Double | js.Date | Moment
    ]
  ] = js.native
}

object ChartData {
  @scala.inline
  def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasets(value: js.Array[ChartDataSets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasets")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(
      value: js.Array[
          String | (js.Array[js.Date | Double | Moment | String]) | Double | js.Date | Moment
        ]
    ): Self = {
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
  }
  
}

