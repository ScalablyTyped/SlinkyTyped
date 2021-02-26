package typingsSlinky.rcSteps

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait Icons extends StObject {
    
    var error: ReactElement = js.native
    
    var finish: ReactElement = js.native
  }
  object Icons {
    
    @scala.inline
    def apply(): Icons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icons]
    }
    
    @scala.inline
    implicit class IconsMutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFinish(value: ReactElement): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcSteps.rcStepsStrings.error
    - typingsSlinky.rcSteps.rcStepsStrings.process
    - typingsSlinky.rcSteps.rcStepsStrings.finish
    - typingsSlinky.rcSteps.rcStepsStrings.wait
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def error: typingsSlinky.rcSteps.rcStepsStrings.error = "error".asInstanceOf[typingsSlinky.rcSteps.rcStepsStrings.error]
    
    @scala.inline
    def finish: typingsSlinky.rcSteps.rcStepsStrings.finish = "finish".asInstanceOf[typingsSlinky.rcSteps.rcStepsStrings.finish]
    
    @scala.inline
    def process: typingsSlinky.rcSteps.rcStepsStrings.process = "process".asInstanceOf[typingsSlinky.rcSteps.rcStepsStrings.process]
  }
}
