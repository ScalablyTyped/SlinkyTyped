package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dial extends Event {
  /* Properties */
  var caller: js.UndefOr[Channel] = js.native
  var dialstatus: String = js.native
  var dialstring: js.UndefOr[String] = js.native
  var forward: js.UndefOr[String] = js.native
  var forwarded: js.UndefOr[Channel] = js.native
  var peer: Channel = js.native
}

object Dial {
  @scala.inline
  def apply(application: String, dialstatus: String, peer: Channel, timestamp: js.Date, `type`: String): Dial = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], dialstatus = dialstatus.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dial]
  }
  @scala.inline
  implicit class DialOps[Self <: Dial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialstatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeer(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(js.undefined)
        ret
    }
    @scala.inline
    def withDialstring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialstring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialstring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialstring")(js.undefined)
        ret
    }
    @scala.inline
    def withForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
        ret
    }
    @scala.inline
    def withForwarded(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded")(js.undefined)
        ret
    }
  }
  
}

