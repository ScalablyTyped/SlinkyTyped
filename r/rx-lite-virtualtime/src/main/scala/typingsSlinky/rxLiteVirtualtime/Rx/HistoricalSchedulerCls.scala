package typingsSlinky.rxLiteVirtualtime.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.HistoricalScheduler")
@js.native
class HistoricalSchedulerCls protected () extends VirtualTimeScheduler[Double, Double] {
  def this(initialClock: Double, comparer: js.Function2[/* first */ Double, /* second */ Double, Double]) = this()
}

