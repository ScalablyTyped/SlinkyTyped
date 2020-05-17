package typingsSlinky.expressFrappe.anon

import typingsSlinky.socketIo.mod.Server
import typingsSlinky.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{use (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, next : (err ? : any): void): void, onConnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, onDisconnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, [eventHandler: string] : (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, data : any, cb : std.Function): void}> */
@js.native
trait PartialuseioServersocketS extends js.Object {
  var onConnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
  var onDisconnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.native
  var use: js.UndefOr[
    js.Function3[
      /* io */ Server, 
      /* socket */ Socket, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
}

object PartialuseioServersocketS {
  @scala.inline
  def apply(): PartialuseioServersocketS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseioServersocketS]
  }
  @scala.inline
  implicit class PartialuseioServersocketSOps[Self <: PartialuseioServersocketS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnect(value: (/* io */ Server, /* socket */ Socket) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(
      value: (/* io */ Server, /* socket */ Socket, /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

