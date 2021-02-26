package typingsSlinky.nanoscheduler

import typingsSlinky.nanoscheduler.mod.scheduler.NanoScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanoscheduler", JSImport.Namespace)
  @js.native
  def apply(): NanoScheduler = js.native
  
  object scheduler {
    
    /**
      * Schedule work to be completed when the user agent is idle. Weighs 270 bytes compressed.
      */
    @js.native
    trait NanoScheduler extends StObject {
      
      /**
        * Push a callback into the scheduler, to be executed when the user agent is idle.
        */
      def push(cb: js.Function0[Unit]): Unit = js.native
      
      def schedule(): Unit = js.native
      
      def setTimeout(cb: js.Function0[Unit]): Unit = js.native
    }
    object NanoScheduler {
      
      @scala.inline
      def apply(push: js.Function0[Unit] => Unit, schedule: () => Unit, setTimeout: js.Function0[Unit] => Unit): NanoScheduler = {
        val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push), schedule = js.Any.fromFunction0(schedule), setTimeout = js.Any.fromFunction1(setTimeout))
        __obj.asInstanceOf[NanoScheduler]
      }
      
      @scala.inline
      implicit class NanoSchedulerMutableBuilder[Self <: NanoScheduler] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPush(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSchedule(value: () => Unit): Self = StObject.set(x, "schedule", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetTimeout(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      }
    }
  }
}
