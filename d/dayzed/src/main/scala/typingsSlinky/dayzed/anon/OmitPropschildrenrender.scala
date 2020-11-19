package typingsSlinky.dayzed.anon

import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<dayzed.dayzed.Props, 'children' | 'render'> */
@js.native
trait OmitPropschildrenrender extends js.Object {
  
  var date: js.UndefOr[js.Date] = js.native
  
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  var maxDate: js.UndefOr[js.Date] = js.native
  
  var minDate: js.UndefOr[js.Date] = js.native
  
  var monthsToDisplay: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onDateSelected: js.Function1[/* selectedDate */ typingsSlinky.dayzed.mod.DateObj, Unit] = js.native
  
  var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
  
  var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
  
  var showOutsideDays: js.UndefOr[Boolean] = js.native
}
object OmitPropschildrenrender {
  
  @scala.inline
  def apply(onDateSelected: /* selectedDate */ typingsSlinky.dayzed.mod.DateObj => Unit): OmitPropschildrenrender = {
    val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
    __obj.asInstanceOf[OmitPropschildrenrender]
  }
  
  @scala.inline
  implicit class OmitPropschildrenrenderOps[Self <: OmitPropschildrenrender] (val x: Self) extends AnyVal {
    
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
    def setOnDateSelected(value: /* selectedDate */ typingsSlinky.dayzed.mod.DateObj => Unit): Self = this.set("onDateSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthsToDisplay(value: Double): Self = this.set("monthsToDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthsToDisplay: Self = this.set("monthsToDisplay", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnOffsetChanged(value: /* offset */ Double => Unit): Self = this.set("onOffsetChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOffsetChanged: Self = this.set("onOffsetChanged", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: js.Date*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelectedDate(value: js.Date): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: js.Date | js.Array[js.Date]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShowOutsideDays(value: Boolean): Self = this.set("showOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOutsideDays: Self = this.set("showOutsideDays", js.undefined)
  }
}
