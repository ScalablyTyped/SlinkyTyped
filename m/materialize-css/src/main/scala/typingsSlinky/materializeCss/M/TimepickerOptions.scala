package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.PartialInternationalizati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimepickerOptions extends js.Object {
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
  var i18n: PartialInternationalizati = js.native
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
}

object TimepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: String,
    defaultTime: String,
    duration: Double,
    fromNow: Double,
    i18n: PartialInternationalizati,
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
  implicit class TimepickerOptionsOps[Self <: TimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromNow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n(value: PartialInternationalizati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCloseStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpenStart(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelect(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwelveHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twelveHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVibrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

