package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerOptions extends StObject {
  
  /**
    * Automatically close picker when minute is selected.
    * @default false;
    */
  var autoClose: Boolean = js.native
  
  /**
    * Specify a selector for a DOM element to render the calendar in, by default it will be placed before the input.
    */
  var container: String = js.native
  
  /**
    * Default time to set on the timepicker 'now' or '13:14'
    * @default 'now';
    */
  var defaultTime: String = js.native
  
  /**
    * Duration of the transition from/to the hours/minutes view.
    * @default 350
    */
  var duration: Double = js.native
  
  /**
    * Millisecond offset from the defaultTime.
    * @default 0
    */
  var fromNow: Double = js.native
  
  /**
    * Internationalization options
    */
  var i18n: Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
  ] = js.native
  
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
  
  /**
    * Callback function when a time is selected
    * @default null
    */
  def onSelect(hour: Double, minute: Double): Unit = js.native
  
  /**
    * Show the clear button in the Timepicker
    * @default false
    */
  var showClearBtn: Boolean = js.native
  
  /**
    * Use 12 hour AM/PM clock instead of 24 hour clock.
    * @default true
    */
  var twelveHour: Boolean = js.native
  
  /**
    * Vibrate device when dragging clock hand.
    * @default true
    */
  var vibrate: Boolean = js.native
}
object TimepickerOptions {
  
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: String,
    defaultTime: String,
    duration: Double,
    fromNow: Double,
    i18n: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ],
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    onSelect: (Double, Double) => Unit,
    showClearBtn: Boolean,
    twelveHour: Boolean,
    vibrate: Boolean
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultTime = defaultTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fromNow = fromNow.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), onSelect = js.Any.fromFunction2(onSelect), showClearBtn = showClearBtn.asInstanceOf[js.Any], twelveHour = twelveHour.asInstanceOf[js.Any], vibrate = vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
  
  @scala.inline
  implicit class TimepickerOptionsMutableBuilder[Self <: TimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNow(value: Double): Self = StObject.set(x, "fromNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
        ]
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelect(value: (Double, Double) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwelveHour(value: Boolean): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
  }
}
