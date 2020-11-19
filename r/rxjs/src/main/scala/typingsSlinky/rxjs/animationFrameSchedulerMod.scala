package typingsSlinky.rxjs

import typingsSlinky.rxjs.asyncSchedulerMod.AsyncScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduler/AnimationFrameScheduler", JSImport.Namespace)
@js.native
object animationFrameSchedulerMod extends js.Object {
  
  @js.native
  class AnimationFrameScheduler () extends AsyncScheduler {
    
    def flush(): Unit = js.native
  }
}
