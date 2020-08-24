package typingsSlinky.rxDom.mod

import typingsSlinky.rx.Rx.Comparer
import typingsSlinky.rx.Rx.IDisposable
import typingsSlinky.rx.Rx.IScheduler
import typingsSlinky.rx.Rx.internals.AbstractObserverStatic
import typingsSlinky.rx.Rx.internals.PriorityQueueStatic
import typingsSlinky.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typingsSlinky.rx.Rx.internals.ScheduledItemStatic
import typingsSlinky.rx.anon.GetDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "internals")
@js.native
object internals extends js.Object {
  @js.native
  class AbstractObserverCls[T] ()
    extends typingsSlinky.rx.mod.internals.AbstractObserverCls[T]
  
  @js.native
  class PriorityQueueCls[T] protected ()
    extends typingsSlinky.rx.mod.internals.PriorityQueueCls[T] {
    def this(capacity: Double) = this()
  }
  
  @js.native
  class SchedulePeriodicRecursiveCls protected ()
    extends typingsSlinky.rx.mod.internals.SchedulePeriodicRecursiveCls {
    def this(scheduler: js.Any, state: js.Any, period: js.Any, action: js.Any) = this()
  }
  
  @js.native
  class ScheduledItemCls[TTime] protected ()
    extends typingsSlinky.rx.mod.internals.ScheduledItemCls[TTime] {
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
      comparer: Comparer[TTime, Double]
    ) = this()
  }
  
  var AbstractObserver: AbstractObserverStatic = js.native
  var PriorityQueue: PriorityQueueStatic = js.native
  var SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
  var ScheduledItem: ScheduledItemStatic = js.native
  var addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  var addRef: js.Function2[
    /* xs */ typingsSlinky.rx.Rx.Observable[js.Any], 
    /* r */ GetDisposable, 
    typingsSlinky.rx.Rx.Observable[js.Any]
  ] = js.native
  var bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
  var inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
  var isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
}

