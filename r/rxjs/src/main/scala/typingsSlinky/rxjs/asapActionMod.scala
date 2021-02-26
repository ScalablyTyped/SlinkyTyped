package typingsSlinky.rxjs

import typingsSlinky.rxjs.asapSchedulerMod.AsapScheduler
import typingsSlinky.rxjs.asyncActionMod.AsyncAction
import typingsSlinky.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asapActionMod {
  
  @JSImport("rxjs/internal/scheduler/AsapAction", "AsapAction")
  @js.native
  class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
  }
}
