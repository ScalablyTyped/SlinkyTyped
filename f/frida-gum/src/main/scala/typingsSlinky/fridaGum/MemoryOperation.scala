package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.read
  - typingsSlinky.fridaGum.fridaGumStrings.write
  - typingsSlinky.fridaGum.fridaGumStrings.execute
*/
trait MemoryOperation extends js.Object

object MemoryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute: typingsSlinky.fridaGum.fridaGumStrings.execute = this.cast("execute")
  @scala.inline
  def read: typingsSlinky.fridaGum.fridaGumStrings.read = this.cast("read")
  @scala.inline
  def write: typingsSlinky.fridaGum.fridaGumStrings.write = this.cast("write")
}

