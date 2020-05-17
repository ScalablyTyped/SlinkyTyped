package typingsSlinky.reactTracking.anon

import typingsSlinky.reactTracking.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracking[T] extends js.Object {
  var tracking: Options[T] with Data = js.native
}

object Tracking {
  @scala.inline
  def apply[T](tracking: Options[T] with Data): Tracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracking[T]]
  }
  @scala.inline
  implicit class TrackingOps[Self[t] <: Tracking[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTracking(value: Options[T] with Data): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

