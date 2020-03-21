package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactTable.reactTableStrings.sum
  - typingsSlinky.reactTable.reactTableStrings.average
  - typingsSlinky.reactTable.reactTableStrings.median
  - typingsSlinky.reactTable.reactTableStrings.uniqueCount
  - typingsSlinky.reactTable.reactTableStrings.count
*/
trait DefaultAggregators extends js.Object

object DefaultAggregators {
  @scala.inline
  def average: typingsSlinky.reactTable.reactTableStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typingsSlinky.reactTable.reactTableStrings.count = this.cast("count")
  @scala.inline
  def median: typingsSlinky.reactTable.reactTableStrings.median = this.cast("median")
  @scala.inline
  def sum: typingsSlinky.reactTable.reactTableStrings.sum = this.cast("sum")
  @scala.inline
  def uniqueCount: typingsSlinky.reactTable.reactTableStrings.uniqueCount = this.cast("uniqueCount")
}

