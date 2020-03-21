package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.fullSync
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deltaSync
*/
trait DeviceManagementExchangeConnectorSyncType extends js.Object

object DeviceManagementExchangeConnectorSyncType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deltaSync: typingsSlinky.microsoftGraph.microsoftGraphStrings.deltaSync = this.cast("deltaSync")
  @scala.inline
  def fullSync: typingsSlinky.microsoftGraph.microsoftGraphStrings.fullSync = this.cast("fullSync")
}

