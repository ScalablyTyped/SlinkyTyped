package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsSet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * ID of the debuggee where the breakpoint is to be set.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBreakpoint] = js.native
}

