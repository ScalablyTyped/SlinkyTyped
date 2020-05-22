package typingsSlinky.jsGraphAlgorithms.mod

import typingsSlinky.jsGraphAlgorithms.JsGraphs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "WeightedDiGraph")
@js.native
class WeightedDiGraph ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.WeightedDiGraph {
  /* CompleteClass */
  override var V: Double = js.native
  /* CompleteClass */
  override var adjList: js.Array[js.Array[typingsSlinky.jsGraphAlgorithms.JsGraphs.Edge]] = js.native
  /* CompleteClass */
  override var nodeInfo: js.Any = js.native
  /* CompleteClass */
  override def addEdge(e: typingsSlinky.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
  /* CompleteClass */
  override def adj(v: Double): js.Array[typingsSlinky.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  /* CompleteClass */
  override def edge(v: Double, w: Double): typingsSlinky.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
  /* CompleteClass */
  override def node(v: Double): Node = js.native
  /* CompleteClass */
  override def toDiGraph(): typingsSlinky.jsGraphAlgorithms.JsGraphs.DiGraph = js.native
}

