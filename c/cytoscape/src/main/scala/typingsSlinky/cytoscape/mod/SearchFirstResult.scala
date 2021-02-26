package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirstResult extends StObject {
  
  /**
    * The node found by the search
    * - If no node was found, then found is empty.
    * - If your handler function returns false, then the only the path up to that point is returned.
    */
  var found: NodeCollection = js.native
  
  /**
    * The path of the search.
    * - The path returned includes edges such that if path[i] is a node, then path[i - 1] is the edge used to get to that node.
    */
  var path: CollectionArgument = js.native
}
object SearchFirstResult {
  
  @scala.inline
  def apply(found: NodeCollection, path: CollectionArgument): SearchFirstResult = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstResult]
  }
  
  @scala.inline
  implicit class SearchFirstResultMutableBuilder[Self <: SearchFirstResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFound(value: NodeCollection): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: CollectionArgument): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
