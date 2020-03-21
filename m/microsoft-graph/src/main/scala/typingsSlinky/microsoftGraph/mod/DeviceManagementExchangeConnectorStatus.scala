package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.connectionPending
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.connected
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disconnected
*/
trait DeviceManagementExchangeConnectorStatus extends js.Object

object DeviceManagementExchangeConnectorStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.microsoftGraph.microsoftGraphStrings.connected = this.cast("connected")
  @scala.inline
  def connectionPending: typingsSlinky.microsoftGraph.microsoftGraphStrings.connectionPending = this.cast("connectionPending")
  @scala.inline
  def disconnected: typingsSlinky.microsoftGraph.microsoftGraphStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def none: none_ = this.cast("none")
}

