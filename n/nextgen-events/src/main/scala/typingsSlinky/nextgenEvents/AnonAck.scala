package typingsSlinky.nextgenEvents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAck extends js.Object {
  var ack: Boolean = js.native
  var emit: Boolean = js.native
  var listen: Boolean = js.native
}

object AnonAck {
  @scala.inline
  def apply(ack: Boolean, emit: Boolean, listen: Boolean): AnonAck = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAck]
  }
  @scala.inline
  implicit class AnonAckOps[Self <: AnonAck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

