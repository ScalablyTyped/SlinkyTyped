package typingsSlinky.rxDom.mod

import typingsSlinky.rx.Rx.Comparer
import typingsSlinky.rx.Rx.IDisposable
import typingsSlinky.rx.Rx.IScheduler
import typingsSlinky.rx.Rx.internals.AbstractObserverStatic
import typingsSlinky.rx.Rx.internals.PriorityQueueStatic
import typingsSlinky.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typingsSlinky.rx.Rx.internals.ScheduledItemStatic
import typingsSlinky.rx.anon.GetDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  @JSImport("rx-dom", "internals")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rx-dom", "internals.AbstractObserver")
  @js.native
  def AbstractObserver: AbstractObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-dom", "internals.AbstractObserverCls")
  @js.native
  class AbstractObserverCls[T] ()
    extends typingsSlinky.rx.mod.internals.AbstractObserverCls[T]
  
  @scala.inline
  def AbstractObserver_=(x: AbstractObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbstractObserver")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.PriorityQueue")
  @js.native
  def PriorityQueue: PriorityQueueStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-dom", "internals.PriorityQueueCls")
  @js.native
  class PriorityQueueCls[T] protected ()
    extends typingsSlinky.rx.mod.internals.PriorityQueueCls[T] {
    def this(capacity: Double) = this()
  }
  
  @scala.inline
  def PriorityQueue_=(x: PriorityQueueStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PriorityQueue")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.SchedulePeriodicRecursive")
  @js.native
  def SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-dom", "internals.SchedulePeriodicRecursiveCls")
  @js.native
  class SchedulePeriodicRecursiveCls protected ()
    extends typingsSlinky.rx.mod.internals.SchedulePeriodicRecursiveCls {
    def this(scheduler: js.Any, state: js.Any, period: js.Any, action: js.Any) = this()
  }
  
  @scala.inline
  def SchedulePeriodicRecursive_=(x: SchedulePeriodicRecursiveStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SchedulePeriodicRecursive")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.ScheduledItem")
  @js.native
  def ScheduledItem: ScheduledItemStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-dom", "internals.ScheduledItemCls")
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
  
  @scala.inline
  def ScheduledItem_=(x: ScheduledItemStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScheduledItem")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.addProperties")
  @js.native
  def addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  @scala.inline
  def addProperties_=(x: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addProperties")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.addRef")
  @js.native
  def addRef: js.Function2[
    /* xs */ typingsSlinky.rx.Rx.Observable[js.Any], 
    /* r */ GetDisposable, 
    typingsSlinky.rx.Rx.Observable[js.Any]
  ] = js.native
  @scala.inline
  def addRef_=(
    x: js.Function2[
      /* xs */ typingsSlinky.rx.Rx.Observable[js.Any], 
      /* r */ GetDisposable, 
      typingsSlinky.rx.Rx.Observable[js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addRef")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.bindCallback")
  @js.native
  def bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
  @scala.inline
  def bindCallback_=(x: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindCallback")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.inherits")
  @js.native
  def inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
  @scala.inline
  def inherits_=(x: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inherits")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "internals.isEqual")
  @js.native
  def isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
  @scala.inline
  def isEqual_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(x.asInstanceOf[js.Any])
}
