package typingsSlinky.rxjs

import typingsSlinky.rxjs.animationFrameSchedulerMod.AnimationFrameScheduler
import typingsSlinky.rxjs.asyncActionMod.AsyncAction
import typingsSlinky.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduler/AnimationFrameAction", JSImport.Namespace)
@js.native
object animationFrameActionMod extends js.Object {
  
  @js.native
  class AnimationFrameAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AnimationFrameScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AnimationFrameScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_AnimationFrameAction: AnimationFrameScheduler = js.native
  }
}
