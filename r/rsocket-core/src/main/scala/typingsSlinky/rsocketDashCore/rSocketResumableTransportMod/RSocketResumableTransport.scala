package typingsSlinky.rsocketDashCore.rSocketResumableTransportMod

import typingsSlinky.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketResumableTransport extends DuplexConnection

object RSocketResumableTransport {
  @scala.inline
  def apply(
    close: () => Unit,
    connect: () => Unit,
    connectionStatus: () => Flowable[ConnectionStatus],
    receive: () => Flowable[Frame],
    send: Flowable[Frame] => Unit,
    sendOne: Frame => Unit
  ): RSocketResumableTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
  
    __obj.asInstanceOf[RSocketResumableTransport]
  }
}

