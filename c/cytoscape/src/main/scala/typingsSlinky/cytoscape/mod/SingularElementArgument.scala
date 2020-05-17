package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.EdgeSingular
  - typingsSlinky.cytoscape.mod.NodeSingular
*/
trait SingularElementArgument extends CollectionArgument

object SingularElementArgument {
  @scala.inline
  implicit def apply(value: EdgeSingular): SingularElementArgument = value.asInstanceOf[SingularElementArgument]
  @scala.inline
  implicit def apply(value: NodeSingular): SingularElementArgument = value.asInstanceOf[SingularElementArgument]
}

