package typingsSlinky.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  @js.native
  trait Options extends StObject {
    
    var edges: js.UndefOr[js.Function1[/* data */ js.Any, js.Array[_]]] = js.native
    
    var nodes: js.UndefOr[js.Function1[/* data */ js.Any, js.Array[_]]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: /* data */ js.Any => js.Array[_]): Self = StObject.set(x, "edges", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
      
      @scala.inline
      def setNodes(value: /* data */ js.Any => js.Array[_]): Self = StObject.set(x, "nodes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    }
  }
}
