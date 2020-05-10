package typingsSlinky.reactMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScrollingSpeed extends js.Object {
  var scrollingSpeed: Double = js.native
}

object AnonScrollingSpeed {
  @scala.inline
  def apply(scrollingSpeed: Double): AnonScrollingSpeed = {
    val __obj = js.Dynamic.literal(scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScrollingSpeed]
  }
  @scala.inline
  implicit class AnonScrollingSpeedOps[Self <: AnonScrollingSpeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollingSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingSpeed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

