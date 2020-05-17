package typingsSlinky.apolloServerCore.anon

import typingsSlinky.subscriptionsTransportWs.serverMod.ConnectionContext
import typingsSlinky.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-server-core.apollo-server-core/dist/types.SubscriptionServerOptions> */
@js.native
trait PartialSubscriptionServer extends js.Object {
  var keepAlive: js.UndefOr[Double] = js.native
  var onConnect: js.UndefOr[
    js.Function3[
      /* connectionParams */ js.Object, 
      /* websocket */ ^, 
      /* context */ ConnectionContext, 
      _
    ]
  ] = js.native
  var onDisconnect: js.UndefOr[js.Function2[/* websocket */ ^, /* context */ ConnectionContext, _]] = js.native
  var path: js.UndefOr[String] = js.native
}

object PartialSubscriptionServer {
  @scala.inline
  def apply(): PartialSubscriptionServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSubscriptionServer]
  }
  @scala.inline
  implicit class PartialSubscriptionServerOps[Self <: PartialSubscriptionServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepAlive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAlive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAlive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: (/* connectionParams */ js.Object, /* websocket */ ^, /* context */ ConnectionContext) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnect(value: (/* websocket */ ^, /* context */ ConnectionContext) => _): Self = {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

