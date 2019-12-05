package typingsSlinky.rxDashLite.rxDashLiteMod

import typingsSlinky.rxDashCore.Rx.IDisposable
import typingsSlinky.rxDashLite.Anon_GetDisposable
import typingsSlinky.rxDashLite.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "internals")
@js.native
object internals extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends typingsSlinky.rxDashLite.Rx.internals.PriorityQueue[TTime] {
    def this(capacity: Double) = this()
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends typingsSlinky.rxDashLite.Rx.internals.ScheduledItem[TTime] {
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime
    ) = this()
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime,
      comparer: js.Function2[/* x */ TTime, /* y */ TTime, Double]
    ) = this()
  }
  
  def addRef[T](xs: typingsSlinky.rxDashLite.Rx.Observable[T], r: Anon_GetDisposable): typingsSlinky.rxDashLite.Rx.Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    var count: Double = js.native
  }
  
}

