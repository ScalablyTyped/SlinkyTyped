package typingsSlinky.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "EagerPrimMST")
@js.native
class EagerPrimMST protected ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.EagerPrimMST {
  def this(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var mst: js.Array[typingsSlinky.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  /* CompleteClass */
  override var pq: js.Any = js.native
  /* CompleteClass */
  override def visit(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.WeightedGraph, v: Double): Unit = js.native
}

