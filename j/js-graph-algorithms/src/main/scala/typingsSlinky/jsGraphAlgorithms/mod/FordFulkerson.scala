package typingsSlinky.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "FordFulkerson")
@js.native
class FordFulkerson protected ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.FordFulkerson {
  def this(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowNetwork, s: Double, t: Double) = this()
  /* CompleteClass */
  override var edgeTo: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var s: js.Any = js.native
  /* CompleteClass */
  override var t: js.Any = js.native
  /* CompleteClass */
  override var value: Double = js.native
  /* CompleteClass */
  override def hasAugmentedPath(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowNetwork): Boolean = js.native
  /* CompleteClass */
  override def minCut(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowNetwork): js.Array[typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowEdge] = js.native
}

