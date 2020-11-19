package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/date-time-utilities/lib/dateGrid", JSImport.Namespace)
@js.native
object dateGridMod extends js.Object {
  
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[js.Date] = js.native
  
  def getBoundedDateRange(dateRange: js.Array[js.Date]): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.UndefOr[scala.Nothing], maxDate: js.Date): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date, maxDate: js.Date): js.Array[js.Date] = js.native
  
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.UndefOr[scala.Nothing], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = js.native
  
  def isAfterMaxDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isBeforeMinDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = js.native
  
  def isRestrictedDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
}
