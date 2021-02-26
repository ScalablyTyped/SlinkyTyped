package typingsSlinky.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
  - typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends StObject
object OptimisticUpdate {
  
  @scala.inline
  def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Unit): typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction]
  }
  
  @scala.inline
  def OptimisticUpdateRelayPayload(operation: OperationDescriptor, payload: RelayResponsePayload): typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload]
  }
}
