package typingsSlinky.jsGraphAlgorithms.global.JsGraphs

import typingsSlinky.jsGraphAlgorithms.JsGraphs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.FlowNetwork")
@js.native
class FlowNetwork protected ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowNetwork {
  def this(V: Double) = this()
  /* CompleteClass */
  override var V: Double = js.native
  /* CompleteClass */
  override var adjList: js.Any = js.native
  /* CompleteClass */
  override var nodeInfo: js.Any = js.native
  /* CompleteClass */
  override def addEdge(e: typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowEdge): Unit = js.native
  /* CompleteClass */
  override def adj(v: Double): js.Array[typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowEdge] = js.native
  /* CompleteClass */
  override def edge(v: Double, w: Double): typingsSlinky.jsGraphAlgorithms.JsGraphs.FlowEdge | Null = js.native
  /* CompleteClass */
  override def node(v: Double): Node = js.native
}

