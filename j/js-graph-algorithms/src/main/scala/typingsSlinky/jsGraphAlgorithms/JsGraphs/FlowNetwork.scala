package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowNetwork extends js.Object {
  var V: Double = js.native
  var adjList: js.Any = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(e: FlowEdge): Unit = js.native
  def adj(v: Double): js.Array[FlowEdge] = js.native
  def edge(v: Double, w: Double): FlowEdge | Null = js.native
  def node(v: Double): Node = js.native
}

object FlowNetwork {
  @scala.inline
  def apply(
    V: Double,
    addEdge: FlowEdge => Unit,
    adj: Double => js.Array[FlowEdge],
    adjList: js.Any,
    edge: (Double, Double) => FlowEdge | Null,
    node: Double => Node,
    nodeInfo: js.Any
  ): FlowNetwork = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNetwork]
  }
  @scala.inline
  implicit class FlowNetworkOps[Self <: FlowNetwork] (val x: Self) extends AnyVal {
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
    def withAddEdge(value: FlowEdge => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdj(value: Double => js.Array[FlowEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adj")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdjList(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge(value: (Double, Double) => FlowEdge | Null): Self = {
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

