package typingsSlinky.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeEntryOptions extends ITimeEntryRegionalOptions {
  /**
    * Add content to display after each time field. This may contain HTML markup.
    *
    * default: ''
    */
  var appendText: js.UndefOr[String] = js.native
  /**
    * A function that accepts the old and new times, and minimum and maximum times, and returns an updated time.
    * This refers to the associated input field. This call is made just before the time is updated into the field
    * allowing for additional restrictions to be applied. Leave as null for no additional restrictions.
    *
    * default: null
    */
  var beforeSetTime: js.UndefOr[js.Function] = js.native
  /**
    * A function that accepts an input field and returns a settings object containing new settings for the time
    * entry for this field. For example, you can use it to set up a time range wherein both fields restrict the
    * possible values of the other field. this refers to the input field as well. Leave as null for no per-field
    * customisation.
    *
    * default: null
    */
  var beforeShow: js.UndefOr[js.Function] = js.native
  /**
    * The default time to show when no other value has been entered. This may be a Date object
    * (but the year/month/day values are ignored), a string in the current time format, a numeric
    * value as seconds offset from now, or a string value indicating a number and units, e.g. '+2h'.
    * In the latter case, use 'h' for hours, 'm' for minutes, or 's' for seconds. Letters may be upper
    * or lower case. Multiple offsets may be combined into one setting, e.g. '-2h -20m'. Prefix with '!'
    * to prevent a wrap around into another day. Leave as null to default to the current time.
    *
    * default: null
    */
  var defaultTime: js.UndefOr[js.Date | Double | String] = js.native
  /**
    * The number of the portion of the time field to highlight initially.
    * Use 0 for hours, 1 for minutes, etc., or null for the user selection.
    *
    * default: null
    */
  var initialField: js.UndefOr[Double] = js.native
  /**
    * The maximum time that may be selected, or null for no limit. See defaultTime for a description of the possible
    * formats. Use an array of number for hours, minutes, seconds in conjunction with unlimitedHours.
    *
    * Note that the maxTime may be set to less than the minTime in which case the entered time is restricted to
    * the period between the minimum and the maximum on the "next day".
    *
    * default: null
    */
  var maxTime: js.UndefOr[js.Date | Double | js.Array[Double] | String] = js.native
  /**
    * The minimum time that may be selected, or null for no limit. See defaultTime for a description
    * of the possible formats. Use an array of number for hours, minutes, seconds in conjunction with unlimitedHours.
    *
    * default: null
    */
  var minTime: js.UndefOr[js.Date | Double | js.Array[Double] | String] = js.native
  /**
    * Set to true to allow direct entry of a time from the keyboard without needing to type separators,
    * i.e. the field moves on after two digits.
    *
    * default: false
    */
  var noSeparatorEntry: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether or not the seconds part of the time should be displayed.
    *
    * default: False
    */
  var showSeconds: js.UndefOr[Boolean] = js.native
  /**
    * The URL for an expanded spinner image to use, or '' for no expansion. The layout is the same as for
    * spinnerImage but should be a larger size. The expanded spinner appears when the user hovers over the
    * original spinner and disappears when they move off it.
    *
    * default: ''
    */
  var spinnerBigImage: js.UndefOr[String] = js.native
  /**
    * The dimensions of the expanded spinner image for determining which "button" was clicked. The first two values
    * are the width and height of the individual images, the third is the size of the central button for setting the
    * current time, or 0 for no central button.
    *
    * default: [40, 40, 16]
    */
  var spinnerBigSize: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The URL for the spinner images to use, or '' for no spinner. The file must contain seven images horizontally
    * for the normal view, then for each "button" pressed (now, previous, next, increment, and decrement), and,
    * finally, the disabled view.
    *
    * default: 'spinnerDefault.png'
    */
  var spinnerImage: js.UndefOr[String] = js.native
  /**
    * Set to true to have only the increment and decrement buttons on the spinner, or false for all the buttons.
    *
    * default: false
    */
  var spinnerIncDecOnly: js.UndefOr[Boolean] = js.native
  /**
    * The times in milliseconds for the auto-repeat feature on the increment and decrement spinner buttons.
    * The first value is the initial delay and the second one is the subsequent delay. Hold the mouse button down
    * on these spinner buttons to trigger this feature. Use [0, 0] to disable the auto-repeat.
    *
    * default: [500, 250]
    */
  var spinnerRepeat: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The dimensions of the spinner image for determining which "button" was clicked. The first two values are the
    * width and height of the individual images, the third is the size of the central button for setting the current
    * time, or 0 for no central button.
    *
    * default: [20, 20, 8]
    */
  var spinnerSize: js.UndefOr[js.Array[Double]] = js.native
  /**
    * true to have the tab key exit this field and move to the next one, or false to have the tab key step
    * through the date subfields.
    *
    * default: false
    */
  var tabToExit: js.UndefOr[Boolean] = js.native
  /**
    * The increment/decrement values for each of the time portions - hours, minutes, and seconds.
    * Use this to constrain the portions, e.g. [1, 15, 0] restricts the times to quarter hours.
    *
    * default: [1,1,1]
    */
  var timeSteps: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Indicate whether to restrict hours to just those in one day (false) or to allow for any value for hours (true).
    *
    * default: false
    */
  var unlimitedHours: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to use the mouse wheel for increment/decrement if possible, or false to never use it.
    *
    * default: true
    */
  var useMouseWheel: js.UndefOr[Boolean] = js.native
}

object ITimeEntryOptions {
  @scala.inline
  def apply(): ITimeEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeEntryOptions]
  }
  @scala.inline
  implicit class ITimeEntryOptionsOps[Self <: ITimeEntryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetTime(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSetTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTime(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialField")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTime(value: js.Date | Double | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinTime(value: js.Date | Double | js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSeparatorEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSeparatorEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSeparatorEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSeparatorEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerBigImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerBigImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerBigImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerBigImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerBigSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerBigSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerBigSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerBigSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerIncDecOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerIncDecOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerIncDecOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerIncDecOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerRepeat(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTabToExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabToExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabToExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabToExit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSteps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlimitedHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimitedHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlimitedHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimitedHours")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMouseWheel")(js.undefined)
        ret
    }
  }
  
}

