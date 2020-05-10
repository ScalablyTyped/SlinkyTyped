package typingsSlinky.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRight extends js.Object {
  var right: String = js.native
}

object AnonRight {
  @scala.inline
  def apply(right: String): AnonRight = {
    val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRight]
  }
  @scala.inline
  implicit class AnonRightOps[Self <: AnonRight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

