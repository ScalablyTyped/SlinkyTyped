package typingsSlinky.gestaltDatepicker.mod

import slinky.core.facade.ReactRef
import typingsSlinky.dateFns.mod.Locale
import typingsSlinky.gestaltDatepicker.anon.Event
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.down
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.end
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.left
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.right
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.start
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.up
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var excludeDates: js.UndefOr[js.Array[js.Date]] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var idealDirection: js.UndefOr[up | right | down | left] = js.native
  
  var includeDates: js.UndefOr[js.Array[js.Date]] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var localeData: js.UndefOr[Locale] = js.native
  
  var maxDate: js.UndefOr[js.Date] = js.native
  
  var minDate: js.UndefOr[js.Date] = js.native
  
  var nextRef: js.UndefOr[Ref[_]] = js.native
  
  def onChange(args: Event): Unit = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rangeEndDate: js.UndefOr[js.Date] = js.native
  
  var rangeSelector: js.UndefOr[start | end] = js.native
  
  var rangeStartDate: js.UndefOr[js.Date] = js.native
  
  var ref: js.UndefOr[Ref[_]] = js.native
  
  var value: js.UndefOr[js.Date] = js.native
}
object DatePickerProps {
  
  @scala.inline
  def apply(id: String, onChange: Event => Unit): DatePickerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[DatePickerProps]
  }
  
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Event => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setExcludeDatesVarargs(value: js.Date*): Self = this.set("excludeDates", js.Array(value :_*))
    
    @scala.inline
    def setExcludeDates(value: js.Array[js.Date]): Self = this.set("excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDates: Self = this.set("excludeDates", js.undefined)
    
    @scala.inline
    def setHelperText(value: String): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    
    @scala.inline
    def setIdealDirection(value: up | right | down | left): Self = this.set("idealDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdealDirection: Self = this.set("idealDirection", js.undefined)
    
    @scala.inline
    def setIncludeDatesVarargs(value: js.Date*): Self = this.set("includeDates", js.Array(value :_*))
    
    @scala.inline
    def setIncludeDates(value: js.Array[js.Date]): Self = this.set("includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDates: Self = this.set("includeDates", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLocaleData(value: Locale): Self = this.set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleData: Self = this.set("localeData", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setNextRefRefObject(value: ReactRef[_]): Self = this.set("nextRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("nextRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextRef(value: Ref[_]): Self = this.set("nextRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRef: Self = this.set("nextRef", js.undefined)
    
    @scala.inline
    def setNextRefNull: Self = this.set("nextRef", null)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRangeEndDate(value: js.Date): Self = this.set("rangeEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEndDate: Self = this.set("rangeEndDate", js.undefined)
    
    @scala.inline
    def setRangeSelector(value: start | end): Self = this.set("rangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSelector: Self = this.set("rangeSelector", js.undefined)
    
    @scala.inline
    def setRangeStartDate(value: js.Date): Self = this.set("rangeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStartDate: Self = this.set("rangeStartDate", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setValue(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
