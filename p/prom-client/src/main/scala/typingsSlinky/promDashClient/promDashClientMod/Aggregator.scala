package typingsSlinky.promDashClient.promDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.promDashClient.promDashClientStrings.omit
  - typings.promDashClient.promDashClientStrings.sum
  - typings.promDashClient.promDashClientStrings.first
  - typings.promDashClient.promDashClientStrings.min
  - typings.promDashClient.promDashClientStrings.max
  - typings.promDashClient.promDashClientStrings.average
*/
trait Aggregator extends js.Object

object Aggregator {
  @scala.inline
  def average: typingsSlinky.promDashClient.promDashClientStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def first: typingsSlinky.promDashClient.promDashClientStrings.first = this.cast("first")
  @scala.inline
  def max: typingsSlinky.promDashClient.promDashClientStrings.max = this.cast("max")
  @scala.inline
  def min: typingsSlinky.promDashClient.promDashClientStrings.min = this.cast("min")
  @scala.inline
  def omit: typingsSlinky.promDashClient.promDashClientStrings.omit = this.cast("omit")
  @scala.inline
  def sum: typingsSlinky.promDashClient.promDashClientStrings.sum = this.cast("sum")
}

