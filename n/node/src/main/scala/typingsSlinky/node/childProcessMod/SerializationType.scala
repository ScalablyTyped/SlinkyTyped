package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.json
  - typingsSlinky.node.nodeStrings.advanced
*/
trait SerializationType extends js.Object

object SerializationType {
  @scala.inline
  def advanced: typingsSlinky.node.nodeStrings.advanced = this.cast("advanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typingsSlinky.node.nodeStrings.json = this.cast("json")
}

