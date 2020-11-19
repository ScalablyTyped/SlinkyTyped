package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.rx.Rx.Observer
import typingsSlinky.rx.Rx.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.fromWebSocket")
@js.native
object fromWebSocket extends js.Object {
  
  // Web Sockets
  def apply(url: String, protocol: String): Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: js.UndefOr[scala.Nothing],
    closingObserver: Observer[CloseEvent]
  ): Subject[MessageEvent] = js.native
  def apply(url: String, protocol: String, openObserver: Observer[Event]): Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: Observer[Event],
    closingObserver: Observer[CloseEvent]
  ): Subject[MessageEvent] = js.native
}
