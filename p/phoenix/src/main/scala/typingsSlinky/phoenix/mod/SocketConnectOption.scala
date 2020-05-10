package typingsSlinky.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketConnectOption extends js.Object {
  var binaryType: BinaryType = js.native
  var heartbeatIntervalMs: Double = js.native
  var longpollerTimeout: Double = js.native
  var params: js.Object | js.Function0[js.Object] = js.native
  var timeout: Double = js.native
  var transport: String = js.native
  def decode(payload: String, callback: js.Function1[/* decoded */ js.Any, Unit]): Unit = js.native
  def encode(payload: js.Object, callback: js.Function1[/* encoded */ js.Any, Unit]): Unit = js.native
  def logger(kind: String, message: String, data: js.Any): Unit = js.native
  def reconnectAfterMs(tries: Double): Double = js.native
  def rejoinAfterMs(tries: Double): Double = js.native
}

object SocketConnectOption {
  @scala.inline
  def apply(
    binaryType: BinaryType,
    decode: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit,
    encode: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit,
    heartbeatIntervalMs: Double,
    logger: (String, String, js.Any) => Unit,
    longpollerTimeout: Double,
    params: js.Object | js.Function0[js.Object],
    reconnectAfterMs: Double => Double,
    rejoinAfterMs: Double => Double,
    timeout: Double,
    transport: String
  ): SocketConnectOption = {
    val __obj = js.Dynamic.literal(binaryType = binaryType.asInstanceOf[js.Any], decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), heartbeatIntervalMs = heartbeatIntervalMs.asInstanceOf[js.Any], logger = js.Any.fromFunction3(logger), longpollerTimeout = longpollerTimeout.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reconnectAfterMs = js.Any.fromFunction1(reconnectAfterMs), rejoinAfterMs = js.Any.fromFunction1(rejoinAfterMs), timeout = timeout.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOption]
  }
  @scala.inline
  implicit class SocketConnectOptionOps[Self <: SocketConnectOption] (val x: Self) extends AnyVal {
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
    def withDecode(value: (String, js.Function1[/* decoded */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEncode(value: (js.Object, js.Function1[/* encoded */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeartbeatIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: (String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLongpollerTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longpollerTimeout")(value.asInstanceOf[js.Any])
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
    def withReconnectAfterMs(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectAfterMs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRejoinAfterMs(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejoinAfterMs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

