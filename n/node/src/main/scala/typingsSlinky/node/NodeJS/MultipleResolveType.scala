package typingsSlinky.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.resolve
  - typingsSlinky.node.nodeStrings.reject
*/
trait MultipleResolveType extends js.Object

object MultipleResolveType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reject: typingsSlinky.node.nodeStrings.reject = this.cast("reject")
  @scala.inline
  def resolve: typingsSlinky.node.nodeStrings.resolve = this.cast("resolve")
}

