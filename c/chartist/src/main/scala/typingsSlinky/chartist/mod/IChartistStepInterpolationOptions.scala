package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistStepInterpolationOptions extends IChartistInterpolationOptions {
  var postpone: js.UndefOr[Boolean] = js.native
}

object IChartistStepInterpolationOptions {
  @scala.inline
  def apply(): IChartistStepInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistStepInterpolationOptions]
  }
  @scala.inline
  implicit class IChartistStepInterpolationOptionsOps[Self <: IChartistStepInterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostpone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostpone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postpone")(js.undefined)
        ret
    }
  }
  
}

