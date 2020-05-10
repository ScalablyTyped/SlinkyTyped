package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var incoming: js.UndefOr[Listener] = js.native
  var outgoing: js.UndefOr[Listener] = js.native
  var registered: js.UndefOr[js.Function2[/* name */ String, /* cometd */ CometD, Unit]] = js.native
  var unregistered: js.UndefOr[js.Function0[Unit]] = js.native
}

object Extension {
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncoming(value: /* message */ Message => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIncoming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoing(value: /* message */ Message => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOutgoing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistered(value: (/* name */ String, /* cometd */ CometD) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregistered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregistered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnregistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregistered")(js.undefined)
        ret
    }
  }
  
}

