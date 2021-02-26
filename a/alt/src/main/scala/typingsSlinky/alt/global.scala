package typingsSlinky.alt

import typingsSlinky.alt.AltJS.AltConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AltJS {
    
    @JSGlobal("AltJS.Alt")
    @js.native
    class Alt ()
      extends typingsSlinky.alt.AltJS.Alt {
      def this(config: AltConfig) = this()
    }
    
    @JSGlobal("AltJS.lifeCycleEvents")
    @js.native
    object lifeCycleEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.alt.AltJS.lifeCycleEvents with Double] = js.native
      
      /* 0 */ val bootstrap: typingsSlinky.alt.AltJS.lifeCycleEvents.bootstrap with Double = js.native
      
      /* 4 */ val error: typingsSlinky.alt.AltJS.lifeCycleEvents.error with Double = js.native
      
      /* 2 */ val init: typingsSlinky.alt.AltJS.lifeCycleEvents.init with Double = js.native
      
      /* 3 */ val rollback: typingsSlinky.alt.AltJS.lifeCycleEvents.rollback with Double = js.native
      
      /* 1 */ val snapshot: typingsSlinky.alt.AltJS.lifeCycleEvents.snapshot with Double = js.native
    }
  }
}
