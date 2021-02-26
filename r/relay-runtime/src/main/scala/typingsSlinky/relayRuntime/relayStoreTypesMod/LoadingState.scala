package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.aborted
import typingsSlinky.relayRuntime.relayRuntimeStrings.complete
import typingsSlinky.relayRuntime.relayRuntimeStrings.error_
import typingsSlinky.relayRuntime.relayRuntimeStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingState extends StObject {
  
  var error: js.UndefOr[js.Error] = js.native
  
  var status: aborted | complete | error_ | missing = js.native
}
object LoadingState {
  
  @scala.inline
  def apply(status: aborted | complete | error_ | missing): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
  
  @scala.inline
  implicit class LoadingStateMutableBuilder[Self <: LoadingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: aborted | complete | error_ | missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
