package typingsSlinky.rxDom.mod

import typingsSlinky.rxCore.Rx.IDisposable
import typingsSlinky.rxLite.AnonGetDisposable
import typingsSlinky.rxLite.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "internals")
@js.native
object internals extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends typingsSlinky.rx.mod.internals.PriorityQueue[TTime] {
    def this(capacity: Double) = this()
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends typingsSlinky.rx.mod.internals.ScheduledItem[TTime] {
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
  
  def addRef[T](xs: typingsSlinky.rxLite.Rx.Observable[T], r: AnonGetDisposable): typingsSlinky.rxLite.Rx.Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    var count: Double = js.native
  }
  
}

