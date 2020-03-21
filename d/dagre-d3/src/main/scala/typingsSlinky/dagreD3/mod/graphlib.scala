package typingsSlinky.dagreD3.mod

import typingsSlinky.dagre.AnonCompound
import typingsSlinky.dagre.mod.EdgeFn
import typingsSlinky.dagre.mod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph ()
    extends typingsSlinky.dagre.mod.graphlib.Graph {
    def this(opt: AnonCompound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph, source: String): js.Any = js.native
    def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph, source: String, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typingsSlinky.dagre.mod.graphlib.Graph): Boolean = js.native
    def postorder(graph: typingsSlinky.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typingsSlinky.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.mod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.mod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: typingsSlinky.dagre.mod.graphlib.Graph): typingsSlinky.dagre.mod.graphlib.Graph = js.native
    def prim(graph: typingsSlinky.dagre.mod.graphlib.Graph, weightFn: WeightFn): typingsSlinky.dagre.mod.graphlib.Graph = js.native
    def tarjam(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typingsSlinky.dagre.mod.graphlib.Graph = js.native
    def write(graph: typingsSlinky.dagre.mod.graphlib.Graph): js.Any = js.native
  }
  
}

