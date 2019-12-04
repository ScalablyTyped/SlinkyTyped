package typingsSlinky.rxjs.internalRxMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rxjs.internalSchedulerAsyncActionMod.AsyncAction
import typingsSlinky.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typingsSlinky.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "VirtualTimeScheduler")
@js.native
class VirtualTimeScheduler ()
  extends typingsSlinky.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ AsyncScheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
          Unit
        ], 
        AsyncAction[js.Object]
      ],
    maxFrames: Double
  ) = this()
}

/* static members */
@JSImport("rxjs/internal/Rx", "VirtualTimeScheduler")
@js.native
object VirtualTimeScheduler extends js.Object {
  var frameTimeFactor: Double = js.native
}

