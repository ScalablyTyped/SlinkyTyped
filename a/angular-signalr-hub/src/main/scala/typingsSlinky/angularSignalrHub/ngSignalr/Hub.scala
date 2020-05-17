package typingsSlinky.angularSignalrHub.ngSignalr

import typingsSlinky.jquery.JQueryDeferred
import typingsSlinky.jquery.JQueryPromise
import typingsSlinky.signalr.SignalR.Connection
import typingsSlinky.signalr.SignalR.Hub.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hub extends js.Object {
  var connection: Connection = js.native
  var hubName: String = js.native
  var proxy: Proxy = js.native
  def connect(): JQueryPromise[_] = js.native
  def disconnect(): Unit = js.native
  def invoke(method: String, args: js.Any*): JQueryDeferred[_] = js.native
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

object Hub {
  @scala.inline
  def apply(
    connect: () => JQueryPromise[_],
    connection: Connection,
    disconnect: () => Unit,
    hubName: String,
    invoke: (String, /* repeated */ js.Any) => JQueryDeferred[_],
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    proxy: Proxy
  ): Hub = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), connection = connection.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), hubName = hubName.asInstanceOf[js.Any], invoke = js.Any.fromFunction2(invoke), on = js.Any.fromFunction2(on), proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hub]
  }
  @scala.inline
  implicit class HubOps[Self <: Hub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: () => JQueryPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHubName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hubName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoke(value: (String, /* repeated */ js.Any) => JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withProxy(value: Proxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

