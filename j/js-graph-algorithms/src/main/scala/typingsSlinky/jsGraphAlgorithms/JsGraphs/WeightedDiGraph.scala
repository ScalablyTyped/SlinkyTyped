package typingsSlinky.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedDiGraph extends WeightedGraph {
  
  def toDiGraph(): DiGraph = js.native
}
object WeightedDiGraph {
  
  @scala.inline
  def apply(
    V: Double,
    addEdge: Edge => Unit,
    adj: Double => js.Array[Edge],
    adjList: js.Array[js.Array[Edge]],
    edge: (Double, Double) => Edge | Null,
    node: Double => Node,
    nodeInfo: js.Any,
    toDiGraph: () => DiGraph
  ): WeightedDiGraph = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], addEdge = js.Any.fromFunction1(addEdge), adj = js.Any.fromFunction1(adj), adjList = adjList.asInstanceOf[js.Any], edge = js.Any.fromFunction2(edge), node = js.Any.fromFunction1(node), nodeInfo = nodeInfo.asInstanceOf[js.Any], toDiGraph = js.Any.fromFunction0(toDiGraph))
    __obj.asInstanceOf[WeightedDiGraph]
  }
  
  @scala.inline
  implicit class WeightedDiGraphMutableBuilder[Self <: WeightedDiGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToDiGraph(value: () => DiGraph): Self = StObject.set(x, "toDiGraph", js.Any.fromFunction0(value))
  }
}
