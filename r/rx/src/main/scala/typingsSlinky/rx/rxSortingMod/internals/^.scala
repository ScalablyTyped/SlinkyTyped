package typingsSlinky.rx.rxSortingMod.internals

import typingsSlinky.rx.Rx.Observable
import typingsSlinky.rx.Rx.internals.AbstractObserverStatic
import typingsSlinky.rx.Rx.internals.PriorityQueueStatic
import typingsSlinky.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typingsSlinky.rx.Rx.internals.ScheduledItemStatic
import typingsSlinky.rx.anon.GetDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.sorting", "internals")
@js.native
object ^ extends js.Object {
  
  var AbstractObserver: AbstractObserverStatic = js.native
  
  var PriorityQueue: PriorityQueueStatic = js.native
  
  var SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
  
  var ScheduledItem: ScheduledItemStatic = js.native
  
  var addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  var addRef: js.Function2[/* xs */ Observable[js.Any], /* r */ GetDisposable, Observable[js.Any]] = js.native
  
  var bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
  
  var inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
  
  var isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
}
