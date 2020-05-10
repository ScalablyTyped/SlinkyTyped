package typingsSlinky.chartJs.mod

import typingsSlinky.chartJs.chartJsStrings.linear
import typingsSlinky.chartJs.chartJsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartXAxe extends CommonAxe {
  var distribution: js.UndefOr[linear | series] = js.native
}

object ChartXAxe {
  @scala.inline
  def apply(): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartXAxe]
  }
  @scala.inline
  implicit class ChartXAxeOps[Self <: ChartXAxe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistribution(value: linear | series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
  }
  
}

