package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulsarClient.pulsarClientStrings.Exclusive
  - typingsSlinky.pulsarClient.pulsarClientStrings.Shared
  - typingsSlinky.pulsarClient.pulsarClientStrings.Failover
*/
trait SubscriptionType extends js.Object

object SubscriptionType {
  @scala.inline
  def Exclusive: typingsSlinky.pulsarClient.pulsarClientStrings.Exclusive = this.cast("Exclusive")
  @scala.inline
  def Failover: typingsSlinky.pulsarClient.pulsarClientStrings.Failover = this.cast("Failover")
  @scala.inline
  def Shared: typingsSlinky.pulsarClient.pulsarClientStrings.Shared = this.cast("Shared")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

