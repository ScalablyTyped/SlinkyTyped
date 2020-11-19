package typingsSlinky.rxDom.mod

import typingsSlinky.rx.Rx.Comparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-dom", "HistoricalSchedulerCls")
@js.native
class HistoricalSchedulerCls protected ()
  extends typingsSlinky.rx.mod.HistoricalSchedulerCls {
  /**
    * Creates a new historical scheduler with the specified initial clock value.
    * @constructor
    * @param {Number} initialClock Initial value for the clock.
    * @param {Function} comparer Comparer to determine causality of events based on absolute time.
    */
  def this(initialClock: Double, comparer: Comparer[Double, Double]) = this()
}
