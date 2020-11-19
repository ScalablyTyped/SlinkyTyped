package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouddebugger.anon.Accesstoken
import typingsSlinky.gapiClientClouddebugger.anon.Actionvalue
import typingsSlinky.gapiClientClouddebugger.anon.Alt
import typingsSlinky.gapiClientClouddebugger.anon.Bearertoken
import typingsSlinky.gapiClientClouddebugger.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsResource extends js.Object {
  
  /** Deletes the breakpoint from the debuggee. */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  
  /** Gets breakpoint information. */
  def get(request: Bearertoken): Request[GetBreakpointResponse] = js.native
  
  /**
    * Returns the list of all active breakpoints for the debuggee.
    *
    * The breakpoint specification (`location`, `condition`, and `expressions`
    * fields) is semantically immutable, although the field values may
    * change. For example, an agent may update the location line number
    * to reflect the actual line where the breakpoint was set, but this
    * doesn't change the breakpoint semantics.
    *
    * This means that an agent does not need to check if a breakpoint has changed
    * when it encounters the same breakpoint on a successive call.
    * Moreover, an agent should remember the breakpoints that are completed
    * until the controller removes them from the active list to avoid
    * setting those breakpoints again.
    */
  def list(request: Accesstoken): Request[ListActiveBreakpointsResponse] = js.native
  /** Lists all breakpoints for the debuggee. */
  def list(request: Actionvalue): Request[ListBreakpointsResponse] = js.native
  
  /** Sets the breakpoint to the debuggee. */
  def set(request: Callback): Request[SetBreakpointResponse] = js.native
  
  /**
    * Updates the breakpoint state or mutable fields.
    * The entire Breakpoint message must be sent back to the controller service.
    *
    * Updates to active breakpoint fields are only allowed if the new value
    * does not change the breakpoint specification. Updates to the `location`,
    * `condition` and `expressions` fields should not alter the breakpoint
    * semantics. These may only make changes such as canonicalizing a value
    * or snapping the location to the correct line of code.
    */
  def update(request: Alt): Request[js.Object] = js.native
}
