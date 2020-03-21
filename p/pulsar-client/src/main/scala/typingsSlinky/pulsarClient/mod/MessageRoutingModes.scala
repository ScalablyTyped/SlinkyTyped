package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulsarClient.pulsarClientStrings.RoundRobinPartition
  - typingsSlinky.pulsarClient.pulsarClientStrings.SinglePartition
  - typingsSlinky.pulsarClient.pulsarClientStrings.CustomPartition
*/
trait MessageRoutingModes extends js.Object

object MessageRoutingModes {
  @scala.inline
  def CustomPartition: typingsSlinky.pulsarClient.pulsarClientStrings.CustomPartition = this.cast("CustomPartition")
  @scala.inline
  def RoundRobinPartition: typingsSlinky.pulsarClient.pulsarClientStrings.RoundRobinPartition = this.cast("RoundRobinPartition")
  @scala.inline
  def SinglePartition: typingsSlinky.pulsarClient.pulsarClientStrings.SinglePartition = this.cast("SinglePartition")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

