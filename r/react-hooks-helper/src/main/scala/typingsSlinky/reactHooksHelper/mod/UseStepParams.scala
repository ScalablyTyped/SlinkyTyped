package typingsSlinky.reactHooksHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseStepParams extends js.Object {
  var autoAdvanceDuration: js.UndefOr[Double] = js.native
  var initialStep: js.UndefOr[Double] = js.native
  var steps: js.Array[String] | Double = js.native
}

object UseStepParams {
  @scala.inline
  def apply(steps: js.Array[String] | Double): UseStepParams = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepParams]
  }
  @scala.inline
  implicit class UseStepParamsOps[Self <: UseStepParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSteps(value: js.Array[String] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAdvanceDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvanceDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdvanceDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvanceDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStep")(js.undefined)
        ret
    }
  }
  
}

