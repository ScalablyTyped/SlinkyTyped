package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.queueInbound
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.queueOutbound
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.queueBoth
*/
trait FirewallPacketQueueingMethodType extends js.Object

object FirewallPacketQueueingMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def disabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def queueBoth: typingsSlinky.microsoftGraph.microsoftGraphStrings.queueBoth = this.cast("queueBoth")
  @scala.inline
  def queueInbound: typingsSlinky.microsoftGraph.microsoftGraphStrings.queueInbound = this.cast("queueInbound")
  @scala.inline
  def queueOutbound: typingsSlinky.microsoftGraph.microsoftGraphStrings.queueOutbound = this.cast("queueOutbound")
}

