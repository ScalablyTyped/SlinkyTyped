package typingsSlinky.clndr.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClndrOptions extends js.Object {
  /**
    * when days from adjacent months are clicked, switch the current month.
    * fires nextMonth/previousMonth/onMonthChange click callbacks. defaults to false.
    */
  var adjacentDaysChangeMonth: js.UndefOr[Boolean] = js.native
  /**
    * Custom classes to avoid styling issues. pass in only the classnames that
    * you wish to override. These are the defaults.
    */
  var classes: js.UndefOr[Classes] = js.native
  /**
    * callbacks!
    */
  var clickEvents: js.UndefOr[ClickEvents] = js.native
  // If you want to prevent the user from navigating the calendar outside
  // of a certain date range (e.g. if you are making a datepicker), specify
  // either the startDate, endDate, or both in the constraints option. You
  // can change these while the calendar is on the page... See documentation
  // below for more on this!
  var constraints: js.UndefOr[Constraints] = js.native
  /**
    * if you're supplying an events array, dateParameter points to the field in your event object containing a date string. It's set to 'date' by default.
    */
  var dateParameter: js.UndefOr[String] = js.native
  /**
    * An array of day abbreviation labels. If you have moment.js set to a
    * different language, it will guess these for you! If for some reason that
    * doesn't work, use this...
    * WARNING: if you are dealing with i18n and multiple languages, you
    * probably don't want this! See the "Internationalization" section below
    * for more.
    */
  var daysOfTheWeek: js.UndefOr[js.Array[String]] = js.native
  /**
    * A callback when the calendar is done rendering. This is a good place
    * to bind custom event handlers (also see the 'ready' option above).
    */
  var doneRendering: js.UndefOr[js.Function0[Unit]] = js.native
  /** an array of event objects */
  var events: js.UndefOr[js.Array[_]] = js.native
  /**
    * Any other data variables you want access to in your template. This gets
    * passed into the template function.
    */
  var extras: js.UndefOr[js.Any] = js.native
  /**
    * Always make the calendar six rows tall (42 days) so that every month has
    * a consistent height. defaults to 'false'.
    */
  var forceSixRows: js.UndefOr[Boolean | Null] = js.native
  /**
    * Set this to true if you don't want `inactive` dates to be selectable.
    * This will only matter if you are using the `constraints` option.
    */
  var ignoreInactiveDaysInSelection: js.UndefOr[Boolean | Null] = js.native
  // CLNDR can render in any time interval!
  // You can specify if you want to render one or more months, or one ore more
  // days in the calendar, as well as the paging interval whenever forward or
  // back is triggered. If both months and days are null, CLNDR will default
  // to the standard monthly view.
  var lengthOfTime: js.UndefOr[LengthOfTime] = js.native
  /**
    * Optionally, you can pass a Moment instance to use instead of the global
    */
  var moment: js.UndefOr[Moment | Null] = js.native
  /**
    * CLNDR can accept events lasting more than one day! just pass in the
    * multiDayEvents option and specify what the start and end fields are
    * called within your event objects. See the example file for a working
    * instance of this.
    */
  var multiDayEvents: js.UndefOr[MultiDayEvents] = js.native
  /**
    * This is called only once after clndr has been initialized and rendered.
    * use this to bind custom event handlers that don't need to be re-attached
    * every time the month changes (most event handlers fall in this category).
    * Hint: this.element refers to the parent element that holds the clndr,
    * and is a great place to attach handlers that don't get tossed out every
    * time the clndr is re-rendered.
    */
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If you want to use a different templating language, here's your ticket.
    * Precompile your template (before you call clndr), pass the data from the
    * render function into your template, and return the result. The result
    * must be a string containing valid markup. The keyword 'this' is set to
    * the clndr instance in case you need access to any other properties.
    * More under 'Template Rendering Engine' below.
    */
  var render: js.UndefOr[js.Function1[/* data */ RenderData, Unit]] = js.native
  /**
    * Set this, if you want a date to be "selected" (see classes.selected)
    * after plugin init. Defualts to null, no initially selected date.
    */
  var selectedDate: js.UndefOr[js.Any] = js.native
  /**
    * show the numbers of days in months adjacent to the current month (and populate them with their events). defaults to true.
    */
  var showAdjacentMonths: js.UndefOr[Boolean] = js.native
  /**
    * determines which month to start with using either a date string or a moment object.
    */
  var startWithMonth: js.UndefOr[String | Moment] = js.native
  /**
    * the target classnames that CLNDR will look for to bind events. these are the defaults.
    */
  var targets: js.UndefOr[Targets] = js.native
  /**
    * the template: this could be stored in markup as a <script type="text/template"></script>
    * or pulled in as a string
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Set this to true, if you want the plugin to track the last clicked day.
    * If trackSelectedDate is true, "selected" class will always be applied
    * only to the most recently clicked date; otherwise - selectedDate will
    * not change.
    */
  var trackSelectedDate: js.UndefOr[Boolean] = js.native
  /**
    * Use the 'touchstart' event instead of 'click'
    */
  var useTouchEvents: js.UndefOr[Boolean] = js.native
  /**
    * Start the week off on Sunday (0), Monday (1), etc. Sunday is the default.
    * WARNING: if you are dealing with i18n and multiple languages, you
    * probably don't want this! See the "Internationalization" section below
    * for more.
    */
  var weekOffset: js.UndefOr[Double] = js.native
}

object ClndrOptions {
  @scala.inline
  def apply(): ClndrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClndrOptions]
  }
  @scala.inline
  implicit class ClndrOptionsOps[Self <: ClndrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjacentDaysChangeMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentDaysChangeMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjacentDaysChangeMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentDaysChangeMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withClickEvents(value: ClickEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: Constraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withDateParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfTheWeek(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfTheWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfTheWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfTheWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneRendering(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneRendering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDoneRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExtras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSixRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSixRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSixRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSixRows")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSixRowsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSixRows")(null)
        ret
    }
    @scala.inline
    def withIgnoreInactiveDaysInSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInactiveDaysInSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreInactiveDaysInSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInactiveDaysInSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreInactiveDaysInSelectionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreInactiveDaysInSelection")(null)
        ret
    }
    @scala.inline
    def withLengthOfTime(value: LengthOfTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthOfTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthOfTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthOfTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMoment(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(null)
        ret
    }
    @scala.inline
    def withMultiDayEvents(value: MultiDayEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDayEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiDayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* data */ RenderData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAdjacentMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAdjacentMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAdjacentMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAdjacentMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withStartWithMonth(value: String | Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartWithMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: Targets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackSelectedDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSelectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSelectedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTouchEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTouchEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTouchEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTouchEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekOffset")(js.undefined)
        ret
    }
  }
  
}

