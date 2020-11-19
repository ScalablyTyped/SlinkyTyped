package typingsSlinky.camljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangesOverlapType extends js.Object
@JSImport("camljs", "DateRangesOverlapType")
@js.native
object DateRangesOverlapType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangesOverlapType with Double] = js.native
  
  /** Returns events for one day, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Day extends DateRangesOverlapType
  /* 1 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /** Returns events for one month, specified by CalendarDate in QueryOptions.
    Caution: usually also returns few days from previous and next months */
  @js.native
  sealed trait Month extends DateRangesOverlapType
  /* 3 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /** Returns events for today */
  @js.native
  sealed trait Now extends DateRangesOverlapType
  /* 0 */ @js.native
  object Now extends TopLevel[Now with Double]
  
  /** Returns events for one week, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Week extends DateRangesOverlapType
  /* 2 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /** Returns events for one year, specified by CalendarDate in QueryOptions */
  @js.native
  sealed trait Year extends DateRangesOverlapType
  /* 4 */ @js.native
  object Year extends TopLevel[Year with Double]
}
