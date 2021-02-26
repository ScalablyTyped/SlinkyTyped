package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateActiveBreakpointRequest extends StObject {
  
  /** Required. Updated breakpoint information. The field `id` must be set. The agent must echo all Breakpoint specification fields in the update. */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}
object UpdateActiveBreakpointRequest {
  
  @scala.inline
  def apply(): UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActiveBreakpointRequest]
  }
  
  @scala.inline
  implicit class UpdateActiveBreakpointRequestMutableBuilder[Self <: UpdateActiveBreakpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
