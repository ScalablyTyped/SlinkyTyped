package typingsSlinky.reactTracking

import typingsSlinky.reactTracking.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTracking[T] extends js.Object {
  var tracking: Options[T] with AnonData = js.native
}

object AnonTracking {
  @scala.inline
  def apply[T](tracking: Options[T] with AnonData): AnonTracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTracking[T]]
  }
  @scala.inline
  implicit class AnonTrackingOps[Self[t] <: AnonTracking[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTracking(value: Options[T] with AnonData): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

