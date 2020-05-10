package typingsSlinky.libpq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyMsg extends js.Object {
  var be_pid: Double = js.native
  var extra: String = js.native
  var relname: String = js.native
}

object NotifyMsg {
  @scala.inline
  def apply(be_pid: Double, extra: String, relname: String): NotifyMsg = {
    val __obj = js.Dynamic.literal(be_pid = be_pid.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], relname = relname.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyMsg]
  }
  @scala.inline
  implicit class NotifyMsgOps[Self <: NotifyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBe_pid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("be_pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

