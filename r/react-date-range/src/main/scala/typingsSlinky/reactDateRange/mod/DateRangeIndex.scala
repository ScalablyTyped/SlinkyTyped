package typingsSlinky.reactDateRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactDateRange.reactDateRangeStrings.Today
  - typingsSlinky.reactDateRange.reactDateRangeStrings.Yesterday
  - typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 7 Days`
  - typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 30 Days`
*/
trait DateRangeIndex extends js.Object

object DateRangeIndex {
  @scala.inline
  def `Last 30 Days`: typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 30 Days` = this.cast("Last 30 Days")
  @scala.inline
  def `Last 7 Days`: typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 7 Days` = this.cast("Last 7 Days")
  @scala.inline
  def Today: typingsSlinky.reactDateRange.reactDateRangeStrings.Today = this.cast("Today")
  @scala.inline
  def Yesterday: typingsSlinky.reactDateRange.reactDateRangeStrings.Yesterday = this.cast("Yesterday")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

