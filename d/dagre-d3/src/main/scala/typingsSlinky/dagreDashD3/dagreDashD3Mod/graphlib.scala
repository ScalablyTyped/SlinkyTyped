package typingsSlinky.dagreDashD3.dagreDashD3Mod

import typingsSlinky.dagre.Anon_Compound
import typingsSlinky.dagre.dagreMod.EdgeFn
import typingsSlinky.dagre.dagreMod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph ()
    extends typingsSlinky.dagre.dagreMod.graphlib.Graph {
    def this(opt: Anon_Compound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, source: String): js.Any = js.native
    def dijkstra(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(
      graph: typingsSlinky.dagre.dagreMod.graphlib.Graph,
      source: String,
      weightFn: WeightFn,
      edgeFn: EdgeFn
    ): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): Boolean = js.native
    def postorder(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): typingsSlinky.dagre.dagreMod.graphlib.Graph = js.native
    def prim(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph, weightFn: WeightFn): typingsSlinky.dagre.dagreMod.graphlib.Graph = js.native
    def tarjam(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Array[js.Array[String]] = js.native
    def topsort(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typingsSlinky.dagre.dagreMod.graphlib.Graph = js.native
    def write(graph: typingsSlinky.dagre.dagreMod.graphlib.Graph): js.Any = js.native
  }
  
}

