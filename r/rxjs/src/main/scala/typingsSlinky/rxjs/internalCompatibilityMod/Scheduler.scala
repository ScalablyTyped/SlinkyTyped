package typingsSlinky.rxjs.internalCompatibilityMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rxjs.actionMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "Scheduler")
@js.native
class Scheduler protected ()
  extends typingsSlinky.rxjs.schedulerMod.Scheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ typingsSlinky.rxjs.schedulerMod.Scheduler, 
        /* work */ js.ThisFunction1[
          /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        Action[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ typingsSlinky.rxjs.schedulerMod.Scheduler, 
        /* work */ js.ThisFunction1[
          /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        Action[js.Object]
      ],
    now: js.Function0[Double]
  ) = this()
}
/* static members */
@JSImport("rxjs/internal-compatibility", "Scheduler")
@js.native
object Scheduler extends js.Object {
  
  /**
    * Note: the extra arrow function wrapper is to make testing by overriding
    * Date.now easier.
    * @nocollapse
    */
  def now(): Double = js.native
}
