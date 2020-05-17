package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedGraph extends js.Object {
  var V: Double = js.native
  var adjList: js.Array[js.Array[Edge]] = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(e: Edge): Unit = js.native
  def adj(v: Double): js.Array[Edge] = js.native
  def edge(v: Double, w: Double): Edge | Null = js.native
  def node(v: Double): Node = js.native
}

object WeightedGraph {
  @scala.inline
  def apply(
    V: Double,
    addEdge: Edge => Unit,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: js.Any
  ): WeightedGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedGraph]
  }
  @scala.inline
  implicit class WeightedGraphOps[Self <: WeightedGraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("V")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddEdge(value: Edge => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdj(value: Double => js.Array[Edge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adj")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdjList(value: js.Array[js.Array[Edge]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: (Double, Double) => Edge | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNode(value: Double => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNodeInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

