package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.available
import typingsSlinky.relayRuntime.relayRuntimeStrings.missing
import typingsSlinky.relayRuntime.relayRuntimeStrings.stale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.anon.FetchTime
  - typingsSlinky.relayRuntime.anon.Status
  - typingsSlinky.relayRuntime.anon.`0`
*/
trait OperationAvailability extends js.Object

object OperationAvailability {
  @scala.inline
  def FetchTime(status: available): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
  @scala.inline
  def Status(status: stale): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
  @scala.inline
  def `0`(status: missing): OperationAvailability = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationAvailability]
  }
}

