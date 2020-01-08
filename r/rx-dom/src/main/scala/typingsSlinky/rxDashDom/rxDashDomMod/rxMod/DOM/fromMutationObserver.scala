package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.MutationEvent
import org.scalajs.dom.raw.MutationObserverInit
import org.scalajs.dom.raw.Node
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromMutationObserver")
@js.native
object fromMutationObserver extends js.Object {
  // Mutation Observers
  def apply(target: Node, options: MutationObserverInit): Observable[MutationEvent] = js.native
}

