package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.native
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.native
  var onReceiveStatus: js.UndefOr[StatusListener] = js.native
}

object Listener {
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnReceiveMessage(value: (/* message */ js.Any, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReceiveMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveMetadata")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReceiveMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReceiveStatus(value: (/* status */ StatusObject, /* next */ js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveStatus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReceiveStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceiveStatus")(js.undefined)
        ret
    }
  }
  
}

