package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAnimationParameter extends js.Object {
  var animationObject: js.UndefOr[js.Any] = js.native
  var chartInstance: js.UndefOr[js.Any] = js.native
}

object ChartAnimationParameter {
  @scala.inline
  def apply(): ChartAnimationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationParameter]
  }
  @scala.inline
  implicit class ChartAnimationParameterOps[Self <: ChartAnimationParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationObject")(js.undefined)
        ret
    }
    @scala.inline
    def withChartInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartInstance")(js.undefined)
        ret
    }
  }
  
}

