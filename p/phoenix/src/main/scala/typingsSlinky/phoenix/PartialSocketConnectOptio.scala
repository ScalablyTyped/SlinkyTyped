package typingsSlinky.phoenix

import typingsSlinky.phoenix.mod.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<phoenix.phoenix.SocketConnectOption> */
@js.native
trait PartialSocketConnectOptio extends js.Object {
  var binaryType: js.UndefOr[BinaryType] = js.native
  var decode: js.UndefOr[
    js.Function2[/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit], Unit]
  ] = js.native
  var encode: js.UndefOr[
    js.Function2[
      /* payload */ js.Object, 
      /* callback */ js.Function1[/* encoded */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var heartbeatIntervalMs: js.UndefOr[Double] = js.native
  var logger: js.UndefOr[js.Function3[/* kind */ String, /* message */ String, /* data */ js.Any, Unit]] = js.native
  var longpollerTimeout: js.UndefOr[Double] = js.native
  var params: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
  var reconnectAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
  var rejoinAfterMs: js.UndefOr[js.Function1[/* tries */ Double, Double]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transport: js.UndefOr[String] = js.native
}

object PartialSocketConnectOptio {
  @scala.inline
  def apply(): PartialSocketConnectOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSocketConnectOptio]
  }
  @scala.inline
  implicit class PartialSocketConnectOptioOps[Self <: PartialSocketConnectOptio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryType(value: BinaryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withDecode(value: (/* payload */ String, /* callback */ js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: (/* payload */ js.Object, /* callback */ js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: (/* kind */ String, /* message */ String, /* data */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withLongpollerTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpollerTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongpollerTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpollerTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsFunction0(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParams(value: js.Object | js.Function0[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectAfterMs(value: /* tries */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectAfterMs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReconnectAfterMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectAfterMs")(js.undefined)
        ret
    }
    @scala.inline
    def withRejoinAfterMs(value: /* tries */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejoinAfterMs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRejoinAfterMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejoinAfterMs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

