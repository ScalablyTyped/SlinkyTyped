package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistSimpleInterpolationOptions extends IChartistInterpolationOptions {
  var divisor: js.UndefOr[Double] = js.native
}

object IChartistSimpleInterpolationOptions {
  @scala.inline
  def apply(): IChartistSimpleInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistSimpleInterpolationOptions]
  }
  @scala.inline
  implicit class IChartistSimpleInterpolationOptionsOps[Self <: IChartistSimpleInterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivisor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(js.undefined)
        ret
    }
  }
  
}

