package typingsSlinky.eventsDotOnce

import typingsSlinky.node.eventsMod.DOMEventTarget
import typingsSlinky.node.eventsMod.NodeEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events.once", JSImport.Namespace)
@js.native
object eventsDotOnceMod extends js.Object {
  def apply(emitter: DOMEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}

