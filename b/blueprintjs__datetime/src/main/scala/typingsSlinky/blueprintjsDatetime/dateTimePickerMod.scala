package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsCore.mod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePickerMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
  @js.native
  class DateTimePicker ()
    extends AbstractPureComponent2[IDateTimePickerProps, IDateTimePickerState, js.Object] {
    def this(props: IDateTimePickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateTimePicker(prevProps: IDatePickerProps): Unit = js.native
    
    def handleDateChange(dateValue: js.Date, isUserChange: Boolean): Unit = js.native
    
    def handleTimeChange(timeValue: js.Date): Unit = js.native
  }
  /* static members */
  object DateTimePicker {
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.defaultProps")
    @js.native
    def defaultProps: IDateTimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateTimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime/lib/esm/dateTimePicker", "DateTimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDateTimePickerProps extends IProps {
    
    /**
      * Allows the user to clear the selection by clicking the currently selected day.
      * @default true
      */
    var canClearSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var datePickerProps: js.UndefOr[IDatePickerProps] = js.native
    
    /**
      * The initial date and time value that will be set.
      * This will be ignored if `value` is set.
      * @default Date.now()
      */
    var defaultValue: js.UndefOr[js.Date] = js.native
    
    /**
      * Callback invoked when the user changes the date or time.
      */
    var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.native
    
    /**
      * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
      * from the `DateTimePicker` props.
      */
    var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
    
    /**
      * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
      */
    var value: js.UndefOr[js.Date | Null] = js.native
  }
  object IDateTimePickerProps {
    
    @scala.inline
    def apply(): IDateTimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerProps]
    }
    
    @scala.inline
    implicit class IDateTimePickerPropsMutableBuilder[Self <: IDateTimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanClearSelection(value: Boolean): Self = StObject.set(x, "canClearSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanClearSelectionUndefined: Self = StObject.set(x, "canClearSelection", js.undefined)
      
      @scala.inline
      def setDatePickerProps(value: IDatePickerProps): Self = StObject.set(x, "datePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerPropsUndefined: Self = StObject.set(x, "datePickerProps", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTimePickerProps(value: ITimePickerProps): Self = StObject.set(x, "timePickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPropsUndefined: Self = StObject.set(x, "timePickerProps", js.undefined)
      
      @scala.inline
      def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IDateTimePickerState extends StObject {
    
    var dateValue: js.UndefOr[js.Date] = js.native
    
    var timeValue: js.UndefOr[js.Date] = js.native
  }
  object IDateTimePickerState {
    
    @scala.inline
    def apply(): IDateTimePickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDateTimePickerState]
    }
    
    @scala.inline
    implicit class IDateTimePickerStateMutableBuilder[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateValue(value: js.Date): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
      
      @scala.inline
      def setTimeValue(value: js.Date): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    }
  }
}
