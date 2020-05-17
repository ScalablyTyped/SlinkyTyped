package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The output is a collection of node and edge elements OR single element.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.Collection[
typingsSlinky.cytoscape.mod.SingularElementReturnValue, 
typingsSlinky.cytoscape.mod.SingularElementArgument]
  - typingsSlinky.cytoscape.mod.EdgeCollection
  - typingsSlinky.cytoscape.mod.NodeCollection
  - typingsSlinky.cytoscape.mod.SingularElementArgument
*/
trait CollectionArgument extends js.Object

object CollectionArgument {
  @scala.inline
  implicit def apply(value: Collection[SingularElementReturnValue, SingularElementArgument]): CollectionArgument = value.asInstanceOf[CollectionArgument]
  @scala.inline
  implicit def apply(value: EdgeCollection): CollectionArgument = value.asInstanceOf[CollectionArgument]
  @scala.inline
  implicit def apply(value: NodeCollection): CollectionArgument = value.asInstanceOf[CollectionArgument]
  @scala.inline
  implicit def apply(value: SingularElementArgument): CollectionArgument = value.asInstanceOf[CollectionArgument]
}

