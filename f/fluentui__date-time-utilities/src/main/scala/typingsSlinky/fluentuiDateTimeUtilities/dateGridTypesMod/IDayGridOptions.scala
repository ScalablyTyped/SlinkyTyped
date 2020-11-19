package typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod

import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDayGridOptions extends IDatepickerOptions {
  
  /**
    * The currently navigated date
    */
  var navigatedDate: js.Date = js.native
  
  /**
    * The currently selected date
    */
  var selectedDate: js.Date = js.native
  
  /**
    * How many weeks to show by default. If not provided, will show enough weeks to display the current
    * month, between 4 and 6 depending
    */
  var weeksToShow: js.UndefOr[Double] = js.native
}
object IDayGridOptions {
  
  @scala.inline
  def apply(
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date,
    selectedDate: js.Date
  ): IDayGridOptions = {
    val __obj = js.Dynamic.literal(dateRangeType = dateRangeType.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDayGridOptions]
  }
  
  @scala.inline
  implicit class IDayGridOptionsOps[Self <: IDayGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNavigatedDate(value: js.Date): Self = this.set("navigatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDate(value: js.Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksToShow(value: Double): Self = this.set("weeksToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeksToShow: Self = this.set("weeksToShow", js.undefined)
  }
}
