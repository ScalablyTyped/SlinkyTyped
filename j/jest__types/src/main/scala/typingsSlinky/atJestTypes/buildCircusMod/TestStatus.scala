package typingsSlinky.atJestTypes.buildCircusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJestTypes.atJestTypesStrings.skip
  - typings.atJestTypes.atJestTypesStrings.done
  - typings.atJestTypes.atJestTypesStrings.todo
*/
trait TestStatus extends js.Object

object TestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsSlinky.atJestTypes.atJestTypesStrings.done = this.cast("done")
  @scala.inline
  def skip: typingsSlinky.atJestTypes.atJestTypesStrings.skip = this.cast("skip")
  @scala.inline
  def todo: typingsSlinky.atJestTypes.atJestTypesStrings.todo = this.cast("todo")
}

