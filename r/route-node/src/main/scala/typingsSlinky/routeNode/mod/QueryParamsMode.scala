package typingsSlinky.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.routeNode.routeNodeStrings.default
  - typingsSlinky.routeNode.routeNodeStrings.strict
  - typingsSlinky.routeNode.routeNodeStrings.loose
*/
trait QueryParamsMode extends js.Object

object QueryParamsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.routeNode.routeNodeStrings.default = this.cast("default")
  @scala.inline
  def loose: typingsSlinky.routeNode.routeNodeStrings.loose = this.cast("loose")
  @scala.inline
  def strict: typingsSlinky.routeNode.routeNodeStrings.strict = this.cast("strict")
}

