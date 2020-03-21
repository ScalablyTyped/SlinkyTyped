package typingsSlinky.filePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.filePathFilter.filePathFilterStrings.include
  - typingsSlinky.filePathFilter.filePathFilterStrings.exclude
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typingsSlinky.filePathFilter.filePathFilterStrings.exclude = this.cast("exclude")
  @scala.inline
  def include: typingsSlinky.filePathFilter.filePathFilterStrings.include = this.cast("include")
}

