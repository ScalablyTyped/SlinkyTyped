package typingsSlinky.rx.rxBindingMod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.rx.Rx.Comparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.binding", "HistoricalScheduler")
@js.native
object HistoricalScheduler
  extends /**
  * Creates a new historical scheduler with the specified initial clock value.
  * @constructor
  * @param {Number} initialClock Initial value for the clock.
  * @param {Function} comparer Comparer to determine causality of events based on absolute time.
  */
Instantiable2[
      /* initialClock */ Double, 
      /* comparer */ Comparer[Double, Double], 
      typingsSlinky.rx.Rx.HistoricalScheduler
    ]

