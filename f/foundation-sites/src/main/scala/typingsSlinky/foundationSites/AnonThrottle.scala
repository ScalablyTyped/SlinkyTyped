package typingsSlinky.foundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThrottle extends js.Object {
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _] = js.native
}

object AnonThrottle {
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]
  ): AnonThrottle = {
    val __obj = js.Dynamic.literal(throttle = js.Any.fromFunction2(throttle))
    __obj.asInstanceOf[AnonThrottle]
  }
  @scala.inline
  implicit class AnonThrottleOps[Self <: AnonThrottle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThrottle(value: (js.Function1[/* repeated */ js.Any, _], Double) => js.Function1[/* repeated */ js.Any, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

