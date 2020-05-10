package typingsSlinky.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandled extends js.Object {
  var _handled: Double = js.native
  var _unhandled: Double = js.native
}

object AnonHandled {
  @scala.inline
  def apply(_handled: Double, _unhandled: Double): AnonHandled = {
    val __obj = js.Dynamic.literal(_handled = _handled.asInstanceOf[js.Any], _unhandled = _unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandled]
  }
  @scala.inline
  implicit class AnonHandledOps[Self <: AnonHandled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_handled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_unhandled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unhandled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

