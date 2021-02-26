package typingsSlinky.naverWhale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chrome {
  
  object downloads {
    
    @js.native
    trait StateType extends StObject {
      
      val COMPLETE: String = js.native
      
      val INTERRUPTED: String = js.native
      
      val IN_PROGRESS: String = js.native
    }
    object StateType {
      
      @scala.inline
      def apply(COMPLETE: String, INTERRUPTED: String, IN_PROGRESS: String): StateType = {
        val __obj = js.Dynamic.literal(COMPLETE = COMPLETE.asInstanceOf[js.Any], INTERRUPTED = INTERRUPTED.asInstanceOf[js.Any], IN_PROGRESS = IN_PROGRESS.asInstanceOf[js.Any])
        __obj.asInstanceOf[StateType]
      }
      
      @scala.inline
      implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCOMPLETE(value: String): Self = StObject.set(x, "COMPLETE", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setINTERRUPTED(value: String): Self = StObject.set(x, "INTERRUPTED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIN_PROGRESS(value: String): Self = StObject.set(x, "IN_PROGRESS", value.asInstanceOf[js.Any])
      }
    }
  }
}
