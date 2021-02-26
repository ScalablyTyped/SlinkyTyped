package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirstOptions1
  extends SearchFirstOptionsBase
     with SearchFirstOptions {
  
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var root: Selector | CollectionArgument = js.native
}
object SearchFirstOptions1 {
  
  @scala.inline
  def apply(root: Selector | CollectionArgument): SearchFirstOptions1 = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions1]
  }
  
  @scala.inline
  implicit class SearchFirstOptions1MutableBuilder[Self <: SearchFirstOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
