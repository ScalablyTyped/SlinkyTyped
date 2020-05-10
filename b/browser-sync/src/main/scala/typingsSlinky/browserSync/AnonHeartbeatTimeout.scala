package typingsSlinky.browserSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeartbeatTimeout extends js.Object {
  var heartbeatTimeout: js.UndefOr[Double] = js.native
}

object AnonHeartbeatTimeout {
  @scala.inline
  def apply(): AnonHeartbeatTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHeartbeatTimeout]
  }
  @scala.inline
  implicit class AnonHeartbeatTimeoutOps[Self <: AnonHeartbeatTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeartbeatTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatTimeout")(js.undefined)
        ret
    }
  }
  
}

