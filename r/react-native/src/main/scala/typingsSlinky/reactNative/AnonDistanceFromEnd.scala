package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDistanceFromEnd extends js.Object {
  var distanceFromEnd: Double = js.native
}

object AnonDistanceFromEnd {
  @scala.inline
  def apply(distanceFromEnd: Double): AnonDistanceFromEnd = {
    val __obj = js.Dynamic.literal(distanceFromEnd = distanceFromEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistanceFromEnd]
  }
  @scala.inline
  implicit class AnonDistanceFromEndOps[Self <: AnonDistanceFromEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceFromEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

