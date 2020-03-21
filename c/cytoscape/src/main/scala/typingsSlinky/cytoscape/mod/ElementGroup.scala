package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#ele.group
  * http://js.cytoscape.org/#notation/elements-json
  *
  * 'nodes'
  * 'edges'
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.cytoscapeStrings.nodes
  - typingsSlinky.cytoscape.cytoscapeStrings.edges
*/
trait ElementGroup extends js.Object

object ElementGroup {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def edges: typingsSlinky.cytoscape.cytoscapeStrings.edges = this.cast("edges")
  @scala.inline
  def nodes: typingsSlinky.cytoscape.cytoscapeStrings.nodes = this.cast("nodes")
}

