package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePicker extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Allows you to disable the TimePicker.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Allows you to enable the TimePicker.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** It returns the current time value.
    * @returns {string}
    */
  def getValue(): String = js.native
  
  /** This method will hide the TimePicker control popup.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_TimePicker: Model = js.native
  
  /** Updates the current system time in TimePicker.
    * @returns {void}
    */
  def setCurrentTime(): Unit = js.native
  
  /** This method will show the TimePicker control popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object TimePicker {
  
  @js.native
  trait BeforeChangeEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the modified time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object BeforeChangeEventArgs {
    
    @scala.inline
    def apply(): BeforeChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeChangeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeChangeEventArgsMutableBuilder[Self <: BeforeChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait BeforeOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object BeforeOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeOpenEventArgsMutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** returns true when the value changed by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the modified time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FocusInEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the current time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object FocusInEventArgs {
    
    @scala.inline
    def apply(): FocusInEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusInEventArgs]
    }
    
    @scala.inline
    implicit class FocusInEventArgsMutableBuilder[Self <: FocusInEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait FocusOutEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the current time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object FocusOutEventArgs {
    
    @scala.inline
    def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit class FocusOutEventArgsMutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires when the time value changed in the TimePicker.
      */
    var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.native
    
    /** Fires when the TimePicker popup before opened.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
    
    /** Fires when the time value changed in the TimePicker.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
    
    /** Fires when the TimePicker popup closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
    
    /** Fires when create TimePicker successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Sets the root CSS class for the TimePicker theme, which is used to customize.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when the TimePicker is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Specifies the list of time range to be disabled.
      * @Default {{}}
      */
    var disableTimeRanges: js.UndefOr[js.Any] = js.native
    
    /** Specifies the animation behavior in TimePicker.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Save current model value to browser cookies for maintaining states. When refreshing the TimePicker control page, the model value is applied from browser cookies or HTML 5local
      * storage.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Displays the TimePicker as right to left alignment.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** When the enableStrictMode is set as true it allows the value outside of the range and also indicate with red color border, otherwise it internally changed to the min or max range
      * value based an input value.
      * @Default {false}
      */
    var enableStrictMode: js.UndefOr[Boolean] = js.native
    
    /** When this property is set to false, it disables the TimePicker control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Fires when the TimePicker control gets focus.
      */
    var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
    
    /** Fires when the TimePicker control get lost focus.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
    
    /** Defines the height of the TimePicker textbox.
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Sets the step value for increment an hour value through arrow keys or mouse scroll.
      * @Default {1}
      */
    var hourInterval: js.UndefOr[Double] = js.native
    
    /** It allows to define the characteristics of the TimePicker control. It will helps to extend the capability of an HTML element.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Sets the time interval between the two adjacent time values in the popup.
      * @Default {30}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Defines the localization info used by the TimePicker.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Sets the maximum time value to the TimePicker.
      * @Default {11:59:59 PM}
      */
    var maxTime: js.UndefOr[String] = js.native
    
    /** Sets the minimum time value to the TimePicker.
      * @Default {12:00:00 AM}
      */
    var minTime: js.UndefOr[String] = js.native
    
    /** Sets the step value for increment the minute value through arrow keys or mouse scroll.
      * @Default {1}
      */
    var minutesInterval: js.UndefOr[Double] = js.native
    
    /** Fires when the TimePicker popup opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Defines the height of the TimePicker popup.
      * @Default {191px}
      */
    var popupHeight: js.UndefOr[String | Double] = js.native
    
    /** Defines the width of the TimePicker popup.
      * @Default {auto}
      */
    var popupWidth: js.UndefOr[String | Double] = js.native
    
    /** Toggles the readonly state of the TimePicker. When the widget is readOnly, it doesnâ€™t allow your input.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Sets the step value for increment the seconds value through arrow keys or mouse scroll.
      * @Default {1}
      */
    var secondsInterval: js.UndefOr[Double] = js.native
    
    /** Fires when the value is selected from the TimePicker dropdown list.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
    
    /** shows or hides the drop down button in TimePicker.
      * @Default {true}
      */
    var showPopupButton: js.UndefOr[Boolean] = js.native
    
    /** TimePicker is displayed with rounded corner when this property is set to true.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Defines the time format displayed in the TimePicker.
      * @Default {h:mm tt}
      */
    var timeFormat: js.UndefOr[String] = js.native
    
    /** Set the jQuery validation error message in TimePicker.
      * @Default {null}
      */
    var validationMessages: js.UndefOr[js.Any] = js.native
    
    /** Set the jQuery validation rules in TimePicker.
      * @Default {null}
      */
    var validationRules: js.UndefOr[js.Any] = js.native
    
    /** Sets a specified time value on the TimePicker.
      * @Default {null}
      */
    var value: js.UndefOr[String | js.Date] = js.native
    
    /** Specifies the water mark text to be displayed in input text.
      * @Default {select a time}
      */
    var watermarkText: js.UndefOr[String] = js.native
    
    /** Defines the width of the TimePicker textbox.
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.TimePicker.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.TimePicker.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.TimePicker.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeChange(value: /* e */ BeforeChangeEventArgs => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDisableTimeRanges(value: js.Any): Self = StObject.set(x, "disableTimeRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTimeRangesUndefined: Self = StObject.set(x, "disableTimeRanges", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableStrictMode(value: Boolean): Self = StObject.set(x, "enableStrictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableStrictModeUndefined: Self = StObject.set(x, "enableStrictMode", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      @scala.inline
      def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHourInterval(value: Double): Self = StObject.set(x, "hourInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourIntervalUndefined: Self = StObject.set(x, "hourInterval", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      @scala.inline
      def setMinutesInterval(value: Double): Self = StObject.set(x, "minutesInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesIntervalUndefined: Self = StObject.set(x, "minutesInterval", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPopupHeight(value: String | Double): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      @scala.inline
      def setPopupWidth(value: String | Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSecondsInterval(value: Double): Self = StObject.set(x, "secondsInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsIntervalUndefined: Self = StObject.set(x, "secondsInterval", js.undefined)
      
      @scala.inline
      def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setShowPopupButton(value: Boolean): Self = StObject.set(x, "showPopupButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopupButtonUndefined: Self = StObject.set(x, "showPopupButton", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setValidationMessages(value: js.Any): Self = StObject.set(x, "validationMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessagesUndefined: Self = StObject.set(x, "validationMessages", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SelectEventArgs extends StObject {
    
    /** returns the TimePicker model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the previously selected time value
      */
    var prevTime: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the selected time value
      */
    var value: js.UndefOr[String] = js.native
  }
  object SelectEventArgs {
    
    @scala.inline
    def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit class SelectEventArgsMutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrevTime(value: String): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTimeUndefined: Self = StObject.set(x, "prevTime", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
