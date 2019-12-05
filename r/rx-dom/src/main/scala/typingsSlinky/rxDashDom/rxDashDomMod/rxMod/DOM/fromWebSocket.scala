package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromWebSocket")
@js.native
object fromWebSocket extends js.Object {
  // Web Sockets
  def apply(url: String, protocol: String): typingsSlinky.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def apply(url: String, protocol: String, openObserver: typingsSlinky.rxDashCore.Rx.Observer[Event]): typingsSlinky.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: typingsSlinky.rxDashCore.Rx.Observer[Event],
    closingObserver: typingsSlinky.rxDashCore.Rx.Observer[CloseEvent]
  ): typingsSlinky.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
}

