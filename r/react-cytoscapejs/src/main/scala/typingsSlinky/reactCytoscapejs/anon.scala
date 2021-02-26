package typingsSlinky.reactCytoscapejs

import typingsSlinky.cytoscape.mod.ElementDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Edges extends StObject {
    
    var edges: js.Array[ElementDefinition] = js.native
    
    var nodes: js.Array[ElementDefinition] = js.native
  }
  object Edges {
    
    @scala.inline
    def apply(edges: js.Array[ElementDefinition], nodes: js.Array[ElementDefinition]): Edges = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edges]
    }
    
    @scala.inline
    implicit class EdgesMutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[ElementDefinition]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: ElementDefinition*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[ElementDefinition]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: ElementDefinition*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
