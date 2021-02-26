package typingsSlinky.gestaltDatepicker

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.dateFns.mod.Locale
import typingsSlinky.gestaltDatepicker.anon.Event
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.down
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.end
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.left
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.right
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.start
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.up
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gestalt-datepicker", JSImport.Default)
  @js.native
  class default ()
    extends Component[DatePickerProps, js.Any, js.Any]
  
  type DatePicker = ReactComponentClass[DatePickerProps]
  
  @js.native
  trait DatePickerProps extends StObject {
    
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
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setExcludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "excludeDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDatesUndefined: Self = StObject.set(x, "excludeDates", js.undefined)
      
      @scala.inline
      def setExcludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "excludeDates", js.Array(value :_*))
      
      @scala.inline
      def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
      
      @scala.inline
      def setIncludeDates(value: js.Array[js.Date]): Self = StObject.set(x, "includeDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDatesUndefined: Self = StObject.set(x, "includeDates", js.undefined)
      
      @scala.inline
      def setIncludeDatesVarargs(value: js.Date*): Self = StObject.set(x, "includeDates", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLocaleData(value: Locale): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleDataUndefined: Self = StObject.set(x, "localeData", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setNextRef(value: Ref[_]): Self = StObject.set(x, "nextRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "nextRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextRefNull: Self = StObject.set(x, "nextRef", null)
      
      @scala.inline
      def setNextRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "nextRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRefUndefined: Self = StObject.set(x, "nextRef", js.undefined)
      
      @scala.inline
      def setOnChange(value: Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRangeEndDate(value: js.Date): Self = StObject.set(x, "rangeEndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeEndDateUndefined: Self = StObject.set(x, "rangeEndDate", js.undefined)
      
      @scala.inline
      def setRangeSelector(value: start | end): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
      
      @scala.inline
      def setRangeStartDate(value: js.Date): Self = StObject.set(x, "rangeStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeStartDateUndefined: Self = StObject.set(x, "rangeStartDate", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
