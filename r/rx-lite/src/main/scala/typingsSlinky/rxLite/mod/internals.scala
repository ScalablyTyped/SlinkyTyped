package typingsSlinky.rxLite.mod

import typingsSlinky.rxCore.Rx.IDisposable
import typingsSlinky.rxLite.Rx.IScheduler
import typingsSlinky.rxLite.anon.GetDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-lite", "internals")
@js.native
object internals extends js.Object {
  
  def addRef[T](xs: typingsSlinky.rxLite.Rx.Observable[T], r: GetDisposable): typingsSlinky.rxLite.Rx.Observable[T] = js.native
  
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends typingsSlinky.rxLite.Rx.internals.PriorityQueue[TTime] {
    def this(capacity: Double) = this()
  }
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    
    var count: Double = js.native
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends typingsSlinky.rxLite.Rx.internals.ScheduledItem[TTime] {
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
}
