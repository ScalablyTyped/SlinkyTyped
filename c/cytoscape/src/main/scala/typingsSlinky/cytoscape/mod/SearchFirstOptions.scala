package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.SearchFirstOptions1
  - typingsSlinky.cytoscape.mod.SearchFirstOptions2
*/
trait SearchFirstOptions extends js.Object

object SearchFirstOptions {
  @scala.inline
  def SearchFirstOptions1(root: Selector | CollectionArgument): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions]
  }
  @scala.inline
  def SearchFirstOptions2(roots: Selector | CollectionArgument): SearchFirstOptions = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions]
  }
}

