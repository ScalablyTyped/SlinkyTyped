package typingsSlinky.freedom.freedom.UdpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Implementation extends js.Object {
  def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit = js.native
  def destroy(continuation: js.Function0[Unit]): Unit = js.native
  def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
  def sendTo(
    data: js.typedarray.ArrayBuffer,
    address: String,
    port: Double,
    continuation: js.Function1[/* bytesWritten */ Double, Unit]
  ): Unit = js.native
}

object Implementation {
  @scala.inline
  def apply(
    bind: (String, Double, js.Function0[Unit]) => Unit,
    destroy: js.Function0[Unit] => Unit,
    getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit,
    sendTo: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
  ): Implementation = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), destroy = js.Any.fromFunction1(destroy), getInfo = js.Any.fromFunction1(getInfo), sendTo = js.Any.fromFunction4(sendTo))
    __obj.asInstanceOf[Implementation]
  }
  @scala.inline
  implicit class ImplementationOps[Self <: Implementation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (String, Double, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDestroy(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInfo(value: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendTo(
      value: (js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTo")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

