package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDegreeCentralityResultDirected extends StObject {
  
  /* the indegree centrality of the root node */
  var indegree: Double = js.native
  
  /* the outdegree centrality of the root node */
  var outdegree: Double = js.native
}
object SearchDegreeCentralityResultDirected {
  
  @scala.inline
  def apply(indegree: Double, outdegree: Double): SearchDegreeCentralityResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree.asInstanceOf[js.Any], outdegree = outdegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultDirected]
  }
  
  @scala.inline
  implicit class SearchDegreeCentralityResultDirectedMutableBuilder[Self <: SearchDegreeCentralityResultDirected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndegree(value: Double): Self = StObject.set(x, "indegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutdegree(value: Double): Self = StObject.set(x, "outdegree", value.asInstanceOf[js.Any])
  }
}
