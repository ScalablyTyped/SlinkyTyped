package typingsSlinky.emberRunloop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait EmberRunTimer extends StObject {
    
    var __ember_run_timer_brand__ : Boolean = js.native
  }
  object EmberRunTimer {
    
    @scala.inline
    def apply(__ember_run_timer_brand__ : Boolean): EmberRunTimer = {
      val __obj = js.Dynamic.literal(__ember_run_timer_brand__ = __ember_run_timer_brand__.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmberRunTimer]
    }
    
    @scala.inline
    implicit class EmberRunTimerMutableBuilder[Self <: EmberRunTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__ember_run_timer_brand__(value: Boolean): Self = StObject.set(x, "__ember_run_timer_brand__", value.asInstanceOf[js.Any])
    }
  }
}
