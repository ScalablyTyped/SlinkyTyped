package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoReplyWait extends js.Object {
  var noreplyWait: Boolean = js.native
}

object NoReplyWait {
  @scala.inline
  def apply(noreplyWait: Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoReplyWait]
  }
  @scala.inline
  implicit class NoReplyWaitOps[Self <: NoReplyWait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoreplyWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noreplyWait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

