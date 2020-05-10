package typingsSlinky.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChartistInterpolationOptions extends js.Object {
  var fillHoles: js.UndefOr[Boolean] = js.native
}

object IChartistInterpolationOptions {
  @scala.inline
  def apply(): IChartistInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistInterpolationOptions]
  }
  @scala.inline
  implicit class IChartistInterpolationOptionsOps[Self <: IChartistInterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillHoles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillHoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHoles")(js.undefined)
        ret
    }
  }
  
}

