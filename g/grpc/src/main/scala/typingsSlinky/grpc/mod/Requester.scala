package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.native
  var getPeer: js.UndefOr[GetPeerRequester] = js.native
  var halfClose: js.UndefOr[CloseRequester] = js.native
  var sendMessage: js.UndefOr[MessageRequester] = js.native
  var start: js.UndefOr[MetadataRequester] = js.native
}

object Requester {
  @scala.inline
  def apply(): Requester = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requester]
  }
  @scala.inline
  implicit class RequesterOps[Self <: Requester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: /* next */ js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPeer(value: /* next */ js.Function => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPeer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPeer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPeer")(js.undefined)
        ret
    }
    @scala.inline
    def withHalfClose(value: /* next */ js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHalfClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSendMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSendMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

