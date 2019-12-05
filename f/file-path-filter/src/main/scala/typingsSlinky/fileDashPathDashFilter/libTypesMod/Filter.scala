package typingsSlinky.fileDashPathDashFilter.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fileDashPathDashFilter.fileDashPathDashFilterStrings.include
  - typings.fileDashPathDashFilter.fileDashPathDashFilterStrings.exclude
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typingsSlinky.fileDashPathDashFilter.fileDashPathDashFilterStrings.exclude = this.cast("exclude")
  @scala.inline
  def include: typingsSlinky.fileDashPathDashFilter.fileDashPathDashFilterStrings.include = this.cast("include")
}

