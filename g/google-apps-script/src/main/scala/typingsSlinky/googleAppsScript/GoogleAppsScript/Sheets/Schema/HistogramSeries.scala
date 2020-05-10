package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramSeries extends js.Object {
  var barColor: js.UndefOr[Color] = js.native
  var data: js.UndefOr[ChartData] = js.native
}

object HistogramSeries {
  @scala.inline
  def apply(): HistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramSeries]
  }
  @scala.inline
  implicit class HistogramSeriesOps[Self <: HistogramSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

