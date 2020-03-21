package typingsSlinky.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.routeNode.routeNodeStrings.default
  - typingsSlinky.routeNode.routeNodeStrings.never
  - typingsSlinky.routeNode.routeNodeStrings.always
*/
trait TrailingSlashMode extends js.Object

object TrailingSlashMode {
  @scala.inline
  def always: typingsSlinky.routeNode.routeNodeStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.routeNode.routeNodeStrings.default = this.cast("default")
  @scala.inline
  def never: typingsSlinky.routeNode.routeNodeStrings.never = this.cast("never")
}

