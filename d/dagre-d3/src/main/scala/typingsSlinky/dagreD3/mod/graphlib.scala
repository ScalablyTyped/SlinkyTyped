package typingsSlinky.dagreD3.mod

import typingsSlinky.dagre.anon.Compound
import typingsSlinky.dagre.mod.EdgeFn
import typingsSlinky.dagre.mod.WeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "graphlib")
@js.native
object graphlib extends js.Object {
  @js.native
  class Graph[T] ()
    extends typingsSlinky.dagre.mod.graphlib.Graph[T] {
    def this(opt: Compound) = this()
  }
  
  @js.native
  object alg extends js.Object {
    def components(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], source: String): js.Any = js.native
    def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): js.Any = js.native
    def dijkstra(
      graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object],
      source: String,
      weightFn: WeightFn,
      edgeFn: EdgeFn
    ): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def findCycles(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = js.native
    def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
    def isAcyclic(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): Boolean = js.native
    def postorder(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def postorder(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = js.native
    def preorder(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = js.native
    def prim[T](graph: typingsSlinky.dagre.mod.graphlib.Graph[T]): typingsSlinky.dagre.mod.graphlib.Graph[T] = js.native
    def prim[T](graph: typingsSlinky.dagre.mod.graphlib.Graph[T], weightFn: WeightFn): typingsSlinky.dagre.mod.graphlib.Graph[T] = js.native
    def tarjam(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
    def topsort(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Array[String] = js.native
  }
  
  @js.native
  object json extends js.Object {
    def read(graph: js.Any): typingsSlinky.dagre.mod.graphlib.Graph[js.Object] = js.native
    def write(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
  }
  
}

