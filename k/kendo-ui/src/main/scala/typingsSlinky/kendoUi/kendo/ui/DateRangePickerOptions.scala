package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerOptions extends StObject {
  
  var ARIATemplate: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ DateRangePickerChangeEvent, Unit]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ DateRangePickerCloseEvent, Unit]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var dates: js.UndefOr[js.Any] = js.native
  
  var depth: js.UndefOr[String] = js.native
  
  var disableDates: js.UndefOr[js.Any | js.Function] = js.native
  
  var footer: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[js.Date] = js.native
  
  var messages: js.UndefOr[DateRangePickerMessages] = js.native
  
  var min: js.UndefOr[js.Date] = js.native
  
  var month: js.UndefOr[DateRangePickerMonth] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ DateRangePickerOpenEvent, Unit]] = js.native
  
  var range: js.UndefOr[DateRangePickerRange] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var weekNumber: js.UndefOr[Boolean] = js.native
}
object DateRangePickerOptions {
  
  @scala.inline
  def apply(): DateRangePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerOptions]
  }
  
  @scala.inline
  implicit class DateRangePickerOptionsMutableBuilder[Self <: DateRangePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARIATemplate(value: String): Self = StObject.set(x, "ARIATemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIATemplateUndefined: Self = StObject.set(x, "ARIATemplate", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DateRangePickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ DateRangePickerCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDates(value: js.Any): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    @scala.inline
    def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDisableDates(value: js.Any | js.Function): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
    
    @scala.inline
    def setFooter(value: String | js.Function): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessages(value: DateRangePickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMonth(value: DateRangePickerMonth): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ DateRangePickerOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setRange(value: DateRangePickerRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
