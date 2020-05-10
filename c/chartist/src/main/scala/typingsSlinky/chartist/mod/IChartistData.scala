package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// data formats are not well documented on all the ways they can be passed to the constructors
// this definition gives some intellisense, but does not protect the user from misuse
// TODO: come in and tidy this up and make it fit better
@js.native
trait IChartistData extends js.Object {
  var labels: js.UndefOr[js.Array[js.Date | Double | String]] = js.native
  var series: js.Array[
    (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
  ] = js.native
}

object IChartistData {
  @scala.inline
  def apply(
    series: js.Array[
      (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
    ]
  ): IChartistData = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistData]
  }
  @scala.inline
  implicit class IChartistDataOps[Self <: IChartistData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeries(
      value: js.Array[
          (js.Array[Double | IChartistData | IChartistSeriesData]) | Double | IChartistSeriesData
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[js.Date | Double | String]): Self = {
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

