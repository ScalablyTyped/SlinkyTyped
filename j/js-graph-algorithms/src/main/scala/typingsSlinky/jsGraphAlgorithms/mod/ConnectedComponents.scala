package typingsSlinky.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "ConnectedComponents")
@js.native
class ConnectedComponents protected ()
  extends typingsSlinky.jsGraphAlgorithms.JsGraphs.ConnectedComponents {
  def this(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.Graph) = this()
  /* CompleteClass */
  override var count: js.Any = js.native
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override def componentCount(): Double = js.native
  /* CompleteClass */
  override def componentId(v: Double): Double = js.native
  /* CompleteClass */
  override def dfs(G: typingsSlinky.jsGraphAlgorithms.JsGraphs.Graph, v: Double): Unit = js.native
}

