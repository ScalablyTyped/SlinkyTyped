package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for listing breakpoints.
  */
@js.native
trait SchemaListBreakpointsResponse extends StObject {
  
  /**
    * List of breakpoints matching the request. The fields `id` and `location`
    * are guaranteed to be set on each breakpoint. The fields: `stack_frames`,
    * `evaluated_expressions` and `variable_table` are cleared on each
    * breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.native
  
  /**
    * A wait token that can be used in the next call to `list` (REST) or
    * `ListBreakpoints` (RPC) to block until the list of breakpoints has
    * changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
}
object SchemaListBreakpointsResponse {
  
  @scala.inline
  def apply(): SchemaListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBreakpointsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBreakpointsResponseMutableBuilder[Self <: SchemaListBreakpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: js.Array[SchemaBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setBreakpointsVarargs(value: SchemaBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextWaitToken(value: String): Self = StObject.set(x, "nextWaitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextWaitTokenUndefined: Self = StObject.set(x, "nextWaitToken", js.undefined)
  }
}
