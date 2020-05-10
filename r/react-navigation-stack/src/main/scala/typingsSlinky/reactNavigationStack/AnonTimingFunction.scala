package typingsSlinky.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimingFunction extends js.Object {
  var timing: js.Function = js.native
}

object AnonTimingFunction {
  @scala.inline
  def apply(timing: js.Function): AnonTimingFunction = {
    val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimingFunction]
  }
  @scala.inline
  implicit class AnonTimingFunctionOps[Self <: AnonTimingFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTiming(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

