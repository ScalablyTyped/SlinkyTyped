package typingsSlinky.rx.rxLiteMod.internals

import typingsSlinky.rx.Rx.Comparer
import typingsSlinky.rx.Rx.IDisposable
import typingsSlinky.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.lite", "internals.ScheduledItem")
@js.native
class ScheduledItemCls[TTime] protected ()
  extends typingsSlinky.rx.Rx.internals.ScheduledItem[TTime] {
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
