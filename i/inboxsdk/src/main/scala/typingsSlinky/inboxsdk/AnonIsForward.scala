package typingsSlinky.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsForward extends js.Object {
  var isForward: Boolean = js.native
}

object AnonIsForward {
  @scala.inline
  def apply(isForward: Boolean): AnonIsForward = {
    val __obj = js.Dynamic.literal(isForward = isForward.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsForward]
  }
  @scala.inline
  implicit class AnonIsForwardOps[Self <: AnonIsForward] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForward")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

