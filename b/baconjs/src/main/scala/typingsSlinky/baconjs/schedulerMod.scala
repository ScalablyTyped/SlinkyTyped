package typingsSlinky.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  object default {
    
    @JSImport("baconjs/types/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/scheduler", "default.scheduler")
    @js.native
    def scheduler: Scheduler = js.native
    @scala.inline
    def scheduler_=(x: Scheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baconjs/types/scheduler", "defaultScheduler")
  @js.native
  val defaultScheduler: Scheduler = js.native
  
  @JSImport("baconjs/types/scheduler", "getScheduler")
  @js.native
  def getScheduler(): Scheduler = js.native
  
  @JSImport("baconjs/types/scheduler", "setScheduler")
  @js.native
  def setScheduler(newScheduler: Scheduler): Unit = js.native
  
  @js.native
  trait Scheduler extends StObject {
    
    def clearInterval(id: Double): js.Any = js.native
    
    def clearTimeout(id: Double): js.Any = js.native
    
    def now(): Double = js.native
    
    def setInterval(f: js.Function, i: Double): Double = js.native
    
    def setTimeout(f: js.Function, d: Double): Double = js.native
  }
  object Scheduler {
    
    @scala.inline
    def apply(
      clearInterval: Double => js.Any,
      clearTimeout: Double => js.Any,
      now: () => Double,
      setInterval: (js.Function, Double) => Double,
      setTimeout: (js.Function, Double) => Double
    ): Scheduler = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), now = js.Any.fromFunction0(now), setInterval = js.Any.fromFunction2(setInterval), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[Scheduler]
    }
    
    @scala.inline
    implicit class SchedulerMutableBuilder[Self <: Scheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearInterval(value: Double => js.Any): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearTimeout(value: Double => js.Any): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetInterval(value: (js.Function, Double) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetTimeout(value: (js.Function, Double) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
