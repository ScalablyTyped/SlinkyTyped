package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import typingsSlinky.rxDashCore.Rx.Observer
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromEventSource")
@js.native
object fromEventSource extends js.Object {
  // Server-Sent Events
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, openObservable: Observer[T]): Observable[T] = js.native
}

