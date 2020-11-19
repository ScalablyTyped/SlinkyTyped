package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object debugger {
  
  type DebuggerDetachedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* source */ typingsSlinky.chrome.chrome.debugger.Debuggee, 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ]
  
  type DebuggerEventEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* source */ typingsSlinky.chrome.chrome.debugger.Debuggee, 
      /* method */ java.lang.String, 
      /* params */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ]
}
