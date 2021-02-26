package typingsSlinky.rxjs

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rxjs.asyncActionMod.AsyncAction
import typingsSlinky.rxjs.asyncSchedulerMod.AsyncScheduler
import typingsSlinky.rxjs.rxjsNumbers.`-1`
import typingsSlinky.rxjs.rxjsNumbers.`0`
import typingsSlinky.rxjs.rxjsNumbers.`1`
import typingsSlinky.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualTimeSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
  @js.native
  class VirtualAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
    
    var active: Boolean = js.native
    
    var index: Double = js.native
    
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_VirtualAction: VirtualTimeScheduler = js.native
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction.sortActions")
    @js.native
    def sortActions[T](a: VirtualAction[T], b: VirtualAction[T]): `1` | `0` | `-1` = js.native
  }
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
  @js.native
  class VirtualTimeScheduler () extends AsyncScheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(SchedulerAction: js.UndefOr[scala.Nothing], maxFrames: Double) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    
    /**
      * Prompt the Scheduler to execute all of its queued actions, therefore
      * clearing its queue.
      * @return {void}
      */
    def flush(): Unit = js.native
    
    var frame: Double = js.native
    
    var index: Double = js.native
    
    var maxFrames: Double = js.native
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    @scala.inline
    def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
}
