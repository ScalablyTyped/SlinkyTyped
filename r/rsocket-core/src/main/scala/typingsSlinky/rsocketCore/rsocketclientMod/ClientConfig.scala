package typingsSlinky.rsocketCore.rsocketclientMod

import typingsSlinky.rsocketCore.AnonDataMimeType
import typingsSlinky.rsocketCore.rsocketleaseMod.Leases
import typingsSlinky.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfig[D, M] extends js.Object {
  var errorHandler: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var leases: js.UndefOr[js.Function0[Leases[_]]] = js.native
  var responder: js.UndefOr[Partial[Responder[D, M]]] = js.native
  var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.native
  var setup: AnonDataMimeType[D, M] = js.native
  var transport: DuplexConnection = js.native
}

object ClientConfig {
  @scala.inline
  def apply[D, M](setup: AnonDataMimeType[D, M], transport: DuplexConnection): ClientConfig[D, M] = {
    val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig[D, M]]
  }
  @scala.inline
  implicit class ClientConfigOps[Self[d, m] <: ClientConfig[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withSetup(value: AnonDataMimeType[D, M]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: DuplexConnection): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* error */ js.Error => Unit): Self[D, M] = {
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
    def withResponder(value: Partial[Responder[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponder: Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responder")(js.undefined)
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

