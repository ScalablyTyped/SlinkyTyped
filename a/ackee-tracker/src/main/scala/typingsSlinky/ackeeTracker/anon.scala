package typingsSlinky.ackeeTracker

import typingsSlinky.ackeeTracker.ackeeTrackerBooleans.`false`
import typingsSlinky.ackeeTracker.ackeeTrackerBooleans.`true`
import typingsSlinky.ackeeTracker.mod.DefaultData
import typingsSlinky.ackeeTracker.mod.DetailedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): DefaultData = js.native
    def apply(detailed: `false`): DefaultData = js.native
    def apply(detailed: `true`): DefaultData with DetailedData = js.native
  }
  
  @js.native
  trait Stop extends StObject {
    
    def stop(): Unit = js.native
  }
  object Stop {
    
    @scala.inline
    def apply(stop: () => Unit): Stop = {
      val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Stop]
    }
    
    @scala.inline
    implicit class StopMutableBuilder[Self <: Stop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
