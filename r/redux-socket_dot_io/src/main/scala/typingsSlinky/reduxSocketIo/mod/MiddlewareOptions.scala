package typingsSlinky.reduxSocketIo.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.socketIoClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends js.Object {
  var eventName: js.UndefOr[String] = js.native
  var execute: js.UndefOr[
    js.Function4[
      /* action */ Action[_], 
      /* emitBound */ Socket, 
      /* next */ Dispatch[_], 
      /* dispatch */ Dispatch[_], 
      _
    ]
  ] = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(
      value: (/* action */ Action[_], /* emitBound */ Socket, /* next */ Dispatch[_], /* dispatch */ Dispatch[_]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
  }
  
}

