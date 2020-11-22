package typingsSlinky.dagreD3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.dagre.anon.Compound
import typingsSlinky.dagre.mod.Edge
import typingsSlinky.dagre.mod.EdgeConfig
import typingsSlinky.dagre.mod.EdgeFn
import typingsSlinky.dagre.mod.GraphLabel
import typingsSlinky.dagre.mod.NodeConfig
import typingsSlinky.dagre.mod.WeightFn
import typingsSlinky.dagre.mod.graphlib.Graph
import typingsSlinky.dagreD3.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dagre-d3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def layout(graph: Graph[js.Object]): Unit = js.native
  def layout(graph: Graph[js.Object], layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
  
  @js.native
  trait Render_ extends js.Object {
    
    // see https://dagrejs.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
    def apply(selection: Selection_[_, _, _, _], g: typingsSlinky.graphlib.mod.Graph): Unit = js.native
    
    def arrows(): StringDictionary[
        js.Function4[
          /* parent */ Selection_[_, _, _, _], 
          /* id */ String, 
          /* edge */ Edge, 
          /* type */ String, 
          Unit
        ]
      ] = js.native
    
    def shapes(): StringDictionary[
        js.Function3[/* parent */ Selection_[_, _, _, _], /* bbox */ js.Any, /* node */ Node, Unit]
      ] = js.native
  }
  
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
      def dijkstra(
        graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object],
        source: String,
        weightFn: js.UndefOr[scala.Nothing],
        edgeFn: EdgeFn
      ): js.Any = js.native
      def dijkstra(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): js.Any = js.native
      def dijkstra(
        graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object],
        source: String,
        weightFn: WeightFn,
        edgeFn: EdgeFn
      ): js.Any = js.native
      
      def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
      def dijkstraAll(
        graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object],
        weightFn: js.UndefOr[scala.Nothing],
        edgeFn: EdgeFn
      ): js.Any = js.native
      def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): js.Any = js.native
      def dijkstraAll(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): js.Any = js.native
      
      def findCycles(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = js.native
      
      def floydWarchall(graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object]): js.Any = js.native
      def floydWarchall(
        graph: typingsSlinky.dagre.mod.graphlib.Graph[js.Object],
        weightFn: js.UndefOr[scala.Nothing],
        edgeFn: EdgeFn
      ): js.Any = js.native
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
  
  @js.native
  object intersect
    extends /* shapeName */ StringDictionary[
          js.Function3[/* node */ Node, /* points */ js.Array[js.Object], /* point */ js.Any, Unit]
        ]
  
  @js.native
  class render () extends Render_
  @js.native
  object render extends Instantiable0[Render_]
}
