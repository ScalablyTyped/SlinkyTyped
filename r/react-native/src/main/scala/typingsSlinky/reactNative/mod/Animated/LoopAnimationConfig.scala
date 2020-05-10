package typingsSlinky.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoopAnimationConfig extends js.Object {
  var iterations: js.UndefOr[Double] = js.native
   // default -1 for infinite
  /**
    * Defaults to `true`
    */
  var resetBeforeIteration: js.UndefOr[Boolean] = js.native
}

object LoopAnimationConfig {
  @scala.inline
  def apply(): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoopAnimationConfig]
  }
  @scala.inline
  implicit class LoopAnimationConfigOps[Self <: LoopAnimationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withResetBeforeIteration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBeforeIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetBeforeIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetBeforeIteration")(js.undefined)
        ret
    }
  }
  
}

