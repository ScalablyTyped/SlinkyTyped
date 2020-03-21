package typingsSlinky.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.promClient.promClientStrings.omit
  - typingsSlinky.promClient.promClientStrings.sum
  - typingsSlinky.promClient.promClientStrings.first
  - typingsSlinky.promClient.promClientStrings.min
  - typingsSlinky.promClient.promClientStrings.max
  - typingsSlinky.promClient.promClientStrings.average
*/
trait Aggregator extends js.Object

object Aggregator {
  @scala.inline
  def average: typingsSlinky.promClient.promClientStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def first: typingsSlinky.promClient.promClientStrings.first = this.cast("first")
  @scala.inline
  def max: typingsSlinky.promClient.promClientStrings.max = this.cast("max")
  @scala.inline
  def min: typingsSlinky.promClient.promClientStrings.min = this.cast("min")
  @scala.inline
  def omit: typingsSlinky.promClient.promClientStrings.omit = this.cast("omit")
  @scala.inline
  def sum: typingsSlinky.promClient.promClientStrings.sum = this.cast("sum")
}

