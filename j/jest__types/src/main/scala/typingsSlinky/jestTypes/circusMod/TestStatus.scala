package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTypes.jestTypesStrings.skip
  - typingsSlinky.jestTypes.jestTypesStrings.done
  - typingsSlinky.jestTypes.jestTypesStrings.todo
*/
trait TestStatus extends js.Object

object TestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsSlinky.jestTypes.jestTypesStrings.done = this.cast("done")
  @scala.inline
  def skip: typingsSlinky.jestTypes.jestTypesStrings.skip = this.cast("skip")
  @scala.inline
  def todo: typingsSlinky.jestTypes.jestTypesStrings.todo = this.cast("todo")
}

