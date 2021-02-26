package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.available
import typingsSlinky.relayRuntime.relayRuntimeStrings.missing
import typingsSlinky.relayRuntime.relayRuntimeStrings.stale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.anon.FetchTime
  - typingsSlinky.relayRuntime.anon.Status
  - typingsSlinky.relayRuntime.anon.`0`
*/
trait OperationAvailability extends StObject
object OperationAvailability {
  
  @scala.inline
  def `0`(status: missing): typingsSlinky.relayRuntime.anon.`0` = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.`0`]
  }
  
  @scala.inline
  def FetchTime(status: available): typingsSlinky.relayRuntime.anon.FetchTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.FetchTime]
  }
  
  @scala.inline
  def Status(status: stale): typingsSlinky.relayRuntime.anon.Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.relayRuntime.anon.Status]
  }
}
