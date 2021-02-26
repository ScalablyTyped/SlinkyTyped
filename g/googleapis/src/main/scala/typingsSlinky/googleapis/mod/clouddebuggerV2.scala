package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clouddebuggerV2 {
  
  /**
    * Stackdriver Debugger API
    *
    * Examines the call stack and variables of a running application without
    * stopping or slowing it down.
    *
    * @example
    * const {google} = require('googleapis');
    * const clouddebugger = google.clouddebugger('v2');
    *
    * @namespace clouddebugger
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Clouddebugger
    */
  @JSImport("googleapis", "clouddebugger_v2.Clouddebugger")
  @js.native
  class Clouddebugger protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.Clouddebugger {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Controller")
  @js.native
  class ResourceController protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceController {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Controller$Debuggees")
  @js.native
  class ResourceControllerDebuggees protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceControllerDebuggees {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Controller$Debuggees$Breakpoints")
  @js.native
  class ResourceControllerDebuggeesBreakpoints protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceControllerDebuggeesBreakpoints {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Debugger")
  @js.native
  class ResourceDebugger protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceDebugger {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Debugger$Debuggees")
  @js.native
  class ResourceDebuggerDebuggees protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceDebuggerDebuggees {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "clouddebugger_v2.Resource$Debugger$Debuggees$Breakpoints")
  @js.native
  class ResourceDebuggerDebuggeesBreakpoints protected ()
    extends typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2.ResourceDebuggerDebuggeesBreakpoints {
    def this(context: APIRequestContext) = this()
  }
}
