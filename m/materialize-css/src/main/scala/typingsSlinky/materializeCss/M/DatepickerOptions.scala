package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerOptions extends StObject {
  
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: Boolean = js.native
  
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: Element = js.native
  
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.Date = js.native
  
  /**
    * Custom function to disable certain days.
    */
  def disableDayFn(day: js.Date): Boolean = js.native
  
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: Boolean = js.native
  
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[String] = js.native
  
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: Double = js.native
  
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: String = js.native
  
  /**
    * Internationalization options
    */
  var i18n: Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
  ] = js.native
  
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: Boolean = js.native
  
  /**
    * The latest date that can be selected.
    */
  var maxDate: js.Date = js.native
  
  /**
    * The earliest date that can be selected.
    */
  var minDate: js.Date = js.native
  
  /**
    * Callback function when Datepicker is closed
    */
  def onClose(): Unit = js.native
  
  /**
    * Callback function when Datepicker HTML is refreshed
    */
  def onDraw(): Unit = js.native
  
  /**
    * Callback function when Datepicker is opened
    */
  def onOpen(): Unit = js.native
  
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    */
  def onSelect(selectedDate: js.Date): Unit = js.native
  
  /**
    * Used to create date object from current input string.
    */
  def parse(value: String, format: String): js.Date = js.native
  
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: Boolean = js.native
  
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: Boolean = js.native
  
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: Boolean = js.native
  
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: Boolean = js.native
  
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: Double | js.Array[Double] = js.native
}
object DatepickerOptions {
  
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: Element,
    defaultDate: js.Date,
    disableDayFn: js.Date => Boolean,
    disableWeekends: Boolean,
    events: js.Array[String],
    firstDay: Double,
    format: String,
    i18n: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ],
    isRTL: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onClose: () => Unit,
    onDraw: () => Unit,
    onOpen: () => Unit,
    onSelect: js.Date => Unit,
    parse: (String, String) => js.Date,
    setDefaultDate: Boolean,
    showClearBtn: Boolean,
    showDaysInNextAndPreviousMonths: Boolean,
    showMonthAfterYear: Boolean,
    yearRange: Double | js.Array[Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], disableDayFn = js.Any.fromFunction1(disableDayFn), disableWeekends = disableWeekends.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onDraw = js.Any.fromFunction0(onDraw), onOpen = js.Any.fromFunction0(onOpen), onSelect = js.Any.fromFunction1(onSelect), parse = js.Any.fromFunction2(parse), setDefaultDate = setDefaultDate.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths.asInstanceOf[js.Any], showMonthAfterYear = showMonthAfterYear.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  @scala.inline
  implicit class DatepickerOptionsMutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDayFn(value: js.Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
        ]
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDraw(value: () => Unit): Self = StObject.set(x, "onDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelect(value: js.Date => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: (String, String) => js.Date): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value :_*))
  }
}
