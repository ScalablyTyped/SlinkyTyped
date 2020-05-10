package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartParallelAxesDateTimeLabelFormatsWeekOptions extends js.Object {
  var main: js.UndefOr[String] = js.native
}

object ChartParallelAxesDateTimeLabelFormatsWeekOptions {
  @scala.inline
  def apply(): ChartParallelAxesDateTimeLabelFormatsWeekOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesDateTimeLabelFormatsWeekOptions]
  }
  @scala.inline
  implicit class ChartParallelAxesDateTimeLabelFormatsWeekOptionsOps[Self <: ChartParallelAxesDateTimeLabelFormatsWeekOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
  }
  
}

