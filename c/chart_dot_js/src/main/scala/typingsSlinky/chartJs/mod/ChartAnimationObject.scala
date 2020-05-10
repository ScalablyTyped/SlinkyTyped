package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAnimationObject extends js.Object {
  var currentStep: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[Easing] = js.native
  var numSteps: js.UndefOr[Double] = js.native
  var onAnimationComplete: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
  var onAnimationProgress: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
  var render: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
}

object ChartAnimationObject {
  @scala.inline
  def apply(): ChartAnimationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationObject]
  }
  @scala.inline
  implicit class ChartAnimationObjectOps[Self <: ChartAnimationObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStep")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: Easing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withNumSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationComplete(value: /* arg */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationProgress(value: /* arg */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* arg */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

