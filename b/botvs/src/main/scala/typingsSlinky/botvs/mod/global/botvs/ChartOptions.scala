package typingsSlinky.botvs.mod.global.botvs

import typingsSlinky.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends Options {
  var __isStock: js.UndefOr[Boolean] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__isStock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__isStock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__isStock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__isStock")(js.undefined)
        ret
    }
  }
  
}

