package typingsSlinky.freedom.freedom.UdpSocket

import typingsSlinky.freedom.freedom.Method3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  @JSName("sendTo")
  var sendTo_Original: Method3[js.typedarray.ArrayBuffer, String, Double, Double] = js.native
  def bind(address: String, port: Double): js.Promise[Unit] = js.native
  def destroy(): js.Promise[Unit] = js.native
  def getInfo(): js.Promise[SocketInfo] = js.native
  def on(name: String, listener: js.Function): Unit = js.native
  def sendTo(a: js.typedarray.ArrayBuffer, b: String, c: Double): js.Promise[Double] = js.native
}

