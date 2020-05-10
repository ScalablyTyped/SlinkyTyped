package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogarithmicScale extends ChartScales {
  @JSName("ticks")
  var ticks_LogarithmicScale: js.UndefOr[LogarithmicTickOptions] = js.native
}

object LogarithmicScale {
  @scala.inline
  def apply(): LogarithmicScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogarithmicScale]
  }
  @scala.inline
  implicit class LogarithmicScaleOps[Self <: LogarithmicScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTicks(value: LogarithmicTickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
  }
  
}

