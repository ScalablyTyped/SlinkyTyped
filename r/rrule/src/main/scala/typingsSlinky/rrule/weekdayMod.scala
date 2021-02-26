package typingsSlinky.rrule

import typingsSlinky.rrule.typesMod._ByWeekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekdayMod {
  
  @JSImport("rrule/dist/esm/src/weekday", "ALL_WEEKDAYS")
  @js.native
  val ALL_WEEKDAYS: js.Array[WeekdayStr] = js.native
  
  @JSImport("rrule/dist/esm/src/weekday", "Weekday")
  @js.native
  class Weekday protected () extends _ByWeekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
    
    def equals(other: Weekday): Boolean = js.native
    
    def getJsWeekday(): Double = js.native
    
    val n: js.UndefOr[Double] = js.native
    
    def nth(n: Double): Weekday = js.native
    
    val weekday: Double = js.native
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule/dist/esm/src/weekday", "Weekday.fromStr")
    @js.native
    def fromStr(str: WeekdayStr): Weekday = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rrule.rruleStrings.MO
    - typingsSlinky.rrule.rruleStrings.TU
    - typingsSlinky.rrule.rruleStrings.WE
    - typingsSlinky.rrule.rruleStrings.TH
    - typingsSlinky.rrule.rruleStrings.FR
    - typingsSlinky.rrule.rruleStrings.SA
    - typingsSlinky.rrule.rruleStrings.SU
  */
  trait WeekdayStr extends _ByWeekday
  object WeekdayStr {
    
    @scala.inline
    def FR: typingsSlinky.rrule.rruleStrings.FR = "FR".asInstanceOf[typingsSlinky.rrule.rruleStrings.FR]
    
    @scala.inline
    def MO: typingsSlinky.rrule.rruleStrings.MO = "MO".asInstanceOf[typingsSlinky.rrule.rruleStrings.MO]
    
    @scala.inline
    def SA: typingsSlinky.rrule.rruleStrings.SA = "SA".asInstanceOf[typingsSlinky.rrule.rruleStrings.SA]
    
    @scala.inline
    def SU: typingsSlinky.rrule.rruleStrings.SU = "SU".asInstanceOf[typingsSlinky.rrule.rruleStrings.SU]
    
    @scala.inline
    def TH: typingsSlinky.rrule.rruleStrings.TH = "TH".asInstanceOf[typingsSlinky.rrule.rruleStrings.TH]
    
    @scala.inline
    def TU: typingsSlinky.rrule.rruleStrings.TU = "TU".asInstanceOf[typingsSlinky.rrule.rruleStrings.TU]
    
    @scala.inline
    def WE: typingsSlinky.rrule.rruleStrings.WE = "WE".asInstanceOf[typingsSlinky.rrule.rruleStrings.WE]
  }
}
