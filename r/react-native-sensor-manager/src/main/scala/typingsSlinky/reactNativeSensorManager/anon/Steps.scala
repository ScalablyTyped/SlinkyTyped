package typingsSlinky.reactNativeSensorManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Steps extends js.Object {
  var steps: Double = js.native
}

object Steps {
  @scala.inline
  def apply(steps: Double): Steps = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
  @scala.inline
  implicit class StepsOps[Self <: Steps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

