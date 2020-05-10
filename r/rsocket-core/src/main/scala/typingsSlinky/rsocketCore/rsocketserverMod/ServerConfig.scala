package typingsSlinky.rsocketCore.rsocketserverMod

import typingsSlinky.rsocketCore.rsocketleaseMod.Leases
import typingsSlinky.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Payload
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.native
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.native
  var transport: TransportServer = js.native
  def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]] = js.native
}

object ServerConfig {
  @scala.inline
  def apply[D, M](
    getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
    transport: TransportServer
  ): ServerConfig[D, M] = {
    val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig[D, M]]
  }
  @scala.inline
  implicit class ServerConfigOps[Self[d, m] <: ServerConfig[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withGetRequestHandler(value: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequestHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransport(value: TransportServer): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* e */ js.Error => Unit): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withLeases(value: () => Leases[_]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leases")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLeases: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leases")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializers(value: PayloadSerializers[D, M]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializers: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(js.undefined)
        ret
    }
  }
  
}

