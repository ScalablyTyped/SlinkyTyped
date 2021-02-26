package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.eventEmitterMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMonitorMod {
  
  @JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", "VisibilityMonitor")
  @js.native
  class VisibilityMonitor () extends EventEmitter {
    
    var visible_ : js.Any = js.native
  }
  /* static members */
  object VisibilityMonitor {
    
    @JSImport("@firebase/database/dist/src/core/util/VisibilityMonitor", "VisibilityMonitor.getInstance")
    @js.native
    def getInstance(): VisibilityMonitor = js.native
  }
}
