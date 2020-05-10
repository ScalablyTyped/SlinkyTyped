package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusInfo extends js.Object {
  var last_reload_time: js.Date = js.native
  /* Properties */
  var startup_time: js.Date = js.native
}

object StatusInfo {
  @scala.inline
  def apply(last_reload_time: js.Date, startup_time: js.Date): StatusInfo = {
    val __obj = js.Dynamic.literal(last_reload_time = last_reload_time.asInstanceOf[js.Any], startup_time = startup_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
  @scala.inline
  implicit class StatusInfoOps[Self <: StatusInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_reload_time(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_reload_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartup_time(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startup_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

