package typingsSlinky.reactHooksHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseStepResponse extends js.Object {
  var autoAdvanceDuration: Double = js.native
  var index: Double = js.native
  var isPaused: Boolean = js.native
  var navigation: NavigationProps = js.native
  var step: Double = js.native
}

object UseStepResponse {
  @scala.inline
  def apply(
    autoAdvanceDuration: Double,
    index: Double,
    isPaused: Boolean,
    navigation: NavigationProps,
    step: Double
  ): UseStepResponse = {
    val __obj = js.Dynamic.literal(autoAdvanceDuration = autoAdvanceDuration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepResponse]
  }
  @scala.inline
  implicit class UseStepResponseOps[Self <: UseStepResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAdvanceDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdvanceDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

