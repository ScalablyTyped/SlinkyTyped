package typingsSlinky.plottable

import typingsSlinky.d3Time.mod.CountableTimeInterval
import typingsSlinky.plottable.quantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/scales/timeScale", JSImport.Namespace)
@js.native
object timeScaleMod extends js.Object {
  
  @js.native
  /**
    * A Time Scale maps Date objects to numbers.
    *
    * @constructor
    */
  class Time ()
    extends QuantitativeScale[js.Date] {
    
    var _d3Scale: js.Any = js.native
    
    /**
      * Returns an array of ticks values separated by the specified interval.
      *
      * @param {string} interval A string specifying the interval unit.
      * @param {number?} [step] The number of multiples of the interval between consecutive ticks.
      * @return {Date[]}
      */
    def tickInterval(interval: String): js.Array[js.Date] = js.native
    def tickInterval(interval: String, step: js.UndefOr[scala.Nothing], useUTC: Boolean): js.Array[js.Date] = js.native
    def tickInterval(interval: String, step: Double): js.Array[js.Date] = js.native
    def tickInterval(interval: String, step: Double, useUTC: Boolean): js.Array[js.Date] = js.native
  }
  /* static members */
  @js.native
  object Time extends js.Object {
    
    /**
      * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
      * If the provided TimeInterval is incorrect, the default is d3.timeYear
      */
    def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = js.native
  }
}
