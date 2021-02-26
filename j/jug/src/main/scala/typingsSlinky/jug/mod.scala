package typingsSlinky.jug

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jug", JSImport.Namespace)
  @js.native
  val ^ : Graph = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jug", "vertex")
  @js.native
  class vertex () extends Vertex {
    def this(obj: VertexData) = this()
  }
  
  /**
    * Creates root node of a graph.
    */
  @js.native
  trait Graph extends StObject {
    
    def init(): Vertex = js.native
    def init(data: VertexData): Vertex = js.native
    
    var vertex: VertexConstructor = js.native
  }
  
  /**
    * Graph constructor function.
    */
  @js.native
  trait GraphConstructor extends Instantiable0[Graph]
  
  /**
    * Represents one node of a graph.
    */
  @js.native
  trait Vertex extends StObject {
    
    /**
      * Get node data.
      */
    def data(): VertexData = js.native
    /**
      * Set node data.
      * @param obj - data to be set.
      */
    def data(obj: VertexData): Vertex = js.native
    
    /**
      * Get edge count.
      */
    def edge(): Double = js.native
    /**
      * Access node.
      * @param index - edge index.
      */
    def edge(index: Double): Vertex = js.native
    
    /**
      * Find a node.
      * @param {string} type - object type.
      * @param {Object} query - _.where query object.
      */
    def find(`type`: String, query: js.Object): js.Array[VertexData] = js.native
    def find(`type`: Unit, query: js.Object): js.Array[VertexData] = js.native
    
    /**
      * Getting childs of an specified edge.
      * @param egde - target vertex;
      */
    def getChildsOf(egde: Double): js.Array[VertexData] = js.native
    
    /**
      * Getting parents of an specified level and edge.
      * @param {number} level - max level.
      * @param {number} edge - edge index.
      */
    def getParentsFrom(level: Double, edge: Double): js.Array[VertexData] = js.native
    
    /**
      * Getting the length of childs of an specified edge.
      * @param {number} edge - edge index.
      */
    def getScopeOf(edge: Double): Double = js.native
    
    /**
      * Get siblings of specified edge.
      * @param {number} index - edge index.
      */
    def getSiblingsOf(index: Double): js.Array[VertexData] = js.native
    
    /**
      * Initial vertex data.
      */
    var internal: VertexStructure = js.native
    
    /**
      * Verify if the current node is the root.
      */
    def isRoot(): Boolean = js.native
    
    /**
      * Verify the level.
      */
    def level(): Double = js.native
    
    /**
      * Get distance between nodes.
      * @param from
      * @param to
      */
    def proximity(from: String, to: String): js.Array[Double] = js.native
    
    /**
      * Seed node.
      * @param [data] - created vertex UserData.
      */
    def seed(): Vertex = js.native
    def seed(data: VertexData): Vertex = js.native
  }
  
  /**
    * Vertex constructor function.
    */
  @js.native
  trait VertexConstructor
    extends Instantiable0[Vertex]
       with Instantiable1[/* obj */ VertexData, Vertex]
  
  /**
    * User data of a vertex.
    */
  type VertexData = js.Object
  
  @js.native
  trait VertexStructure extends StObject {
    
    var data: VertexData = js.native
    
    var edge: js.Array[Vertex] = js.native
    
    var level: Double = js.native
    
    var parent: Vertex = js.native
  }
  object VertexStructure {
    
    @scala.inline
    def apply(data: VertexData, edge: js.Array[Vertex], level: Double, parent: Vertex): VertexStructure = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexStructure]
    }
    
    @scala.inline
    implicit class VertexStructureMutableBuilder[Self <: VertexStructure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: VertexData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdge(value: js.Array[Vertex]): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeVarargs(value: Vertex*): Self = StObject.set(x, "edge", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Vertex): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Graph
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Graph = ^
}
