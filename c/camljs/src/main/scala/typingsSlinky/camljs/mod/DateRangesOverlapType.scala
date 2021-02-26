package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangesOverlapType extends StObject
@JSImport("camljs", "DateRangesOverlapType")
@js.native
object DateRangesOverlapType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangesOverlapType with Double] = js.native
  
  /** Returns events for one day, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Day extends DateRangesOverlapType
  /* 1 */ val Day: typingsSlinky.camljs.mod.DateRangesOverlapType.Day with Double = js.native
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month extends DateRangesOverlapType
  /* 3 */ val Month: typingsSlinky.camljs.mod.DateRangesOverlapType.Month with Double = js.native
  
  /** Returns events for today */
  @js.native
  sealed trait Now extends DateRangesOverlapType
  /* 0 */ val Now: typingsSlinky.camljs.mod.DateRangesOverlapType.Now with Double = js.native
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week extends DateRangesOverlapType
  /* 2 */ val Week: typingsSlinky.camljs.mod.DateRangesOverlapType.Week with Double = js.native
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year extends DateRangesOverlapType
  /* 4 */ val Year: typingsSlinky.camljs.mod.DateRangesOverlapType.Year with Double = js.native
}
