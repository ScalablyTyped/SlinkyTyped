package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsteriskPing extends js.Object {
  /* Properties */
  var asterisk_id: String = js.native
  var ping: String = js.native
  var timestamp: String = js.native
}

object AsteriskPing {
  @scala.inline
  def apply(asterisk_id: String, ping: String, timestamp: String): AsteriskPing = {
    val __obj = js.Dynamic.literal(asterisk_id = asterisk_id.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskPing]
  }
  @scala.inline
  implicit class AsteriskPingOps[Self <: AsteriskPing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsterisk_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asterisk_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

