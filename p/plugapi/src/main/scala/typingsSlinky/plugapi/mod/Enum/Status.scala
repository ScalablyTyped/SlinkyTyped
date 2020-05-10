package typingsSlinky.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var OFFLINE: Double = js.native
  var ONLINE: Double = js.native
}

object Status {
  @scala.inline
  def apply(OFFLINE: Double, ONLINE: Double): Status = {
    val __obj = js.Dynamic.literal(OFFLINE = OFFLINE.asInstanceOf[js.Any], ONLINE = ONLINE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOFFLINE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFLINE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withONLINE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONLINE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

