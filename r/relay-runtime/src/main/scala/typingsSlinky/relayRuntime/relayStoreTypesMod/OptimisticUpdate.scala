package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
  - typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends js.Object

object OptimisticUpdate {
  @scala.inline
  implicit def apply(value: OptimisticUpdateFunction): OptimisticUpdate = value.asInstanceOf[OptimisticUpdate]
  @scala.inline
  implicit def apply(value: OptimisticUpdateRelayPayload): OptimisticUpdate = value.asInstanceOf[OptimisticUpdate]
}

