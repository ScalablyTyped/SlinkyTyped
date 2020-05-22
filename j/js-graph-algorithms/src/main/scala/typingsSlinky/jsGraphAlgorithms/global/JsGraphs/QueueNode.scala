package typingsSlinky.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.QueueNode")
@js.native
class QueueNode[T] protected ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.QueueNode[T] {
  def this(a: T) = this()
  /* CompleteClass */
  override var next: typingsSlinky.jsGraphAlgorithms.JsGraphs.QueueNode[T] | Null = js.native
  /* CompleteClass */
  override var value: T = js.native
}

