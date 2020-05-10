package typingsSlinky.amcharts.periodSelectorMod

import typingsSlinky.amcharts.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeriodSelector extends js.Object {
  /**
    * Date format of date input fields.
    * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
    * @default "DD-MM-YYYY"
    */
  var dateFormat: String = js.native
  /**
    * Text displayed next to "from" date input field. From:
    */
  var fromText: String = js.native
  /**
    * Specifies if period buttons with date range bigger than available data should be hidden.
    * @default true
    */
  var hideOutOfScopePeriods: Boolean = js.native
  /**
    * Width of date input fields, in pixels. Works only if period selector is horizontal.
    * @default 100
    */
  var inputFieldWidth: Double = js.native
  /**
    * Specifies whether period selector displays "from" and "to" date input fields.
    * @default true
    */
  var inputFieldsEnabled: Boolean = js.native
  /**
    * Array of predefined period objects. Period object has 4 properties - period, count, label and selected.
    * Possible period values are:
    * "ss" - seconds,
    * "mm" - minutes,
    * "hh" - hours,
    * "DD" - days,
    * "MM" - months,
    * "YYYY" - years.
    * Property "count" specifies how many periods this button will select.
    * "label" will be displayed on a button.
    * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
    * Example: {period:"DD", count:10, label:"10 days", selected:false}.
    */
  var periods: js.Array[_] = js.native
  /**
    * Text displayed next to predefined period buttons. Zoom:
    */
  var periodsText: String = js.native
  /**
    * Possible values: "right", "left", "top", "bottom". bottom
    */
  var position: String = js.native
  /**
    * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
    */
  var selectFromStart: Boolean = js.native
  /**
    * Text displayed next to "to" date input field. To:
    */
  var toText: String = js.native
  /**
    * Width of a period selector, when position is "left" or "right".
    * @default 180
    */
  var width: Double = js.native
  /**
    * Adds event listener to the object.
    * @param handler - Dispatched when dates in period selector input fields are changed or
    * user clicks on one of the predefined period buttons.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ AnonCount, Unit]): Unit = js.native
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typingsSlinky.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
}

object PeriodSelector {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ AnonCount, Unit]) => Unit,
    dateFormat: String,
    fromText: String,
    hideOutOfScopePeriods: Boolean,
    inputFieldWidth: Double,
    inputFieldsEnabled: Boolean,
    periods: js.Array[_],
    periodsText: String,
    position: String,
    removeListener: (typingsSlinky.amcharts.amChartMod.default, String, js.Any) => Unit,
    selectFromStart: Boolean,
    toText: String,
    width: Double
  ): PeriodSelector = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), dateFormat = dateFormat.asInstanceOf[js.Any], fromText = fromText.asInstanceOf[js.Any], hideOutOfScopePeriods = hideOutOfScopePeriods.asInstanceOf[js.Any], inputFieldWidth = inputFieldWidth.asInstanceOf[js.Any], inputFieldsEnabled = inputFieldsEnabled.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], periodsText = periodsText.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), selectFromStart = selectFromStart.asInstanceOf[js.Any], toText = toText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodSelector]
  }
  @scala.inline
  implicit class PeriodSelectorOps[Self <: PeriodSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddListener(value: (String, js.Function1[/* e */ AnonCount, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideOutOfScopePeriods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOutOfScopePeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFieldWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFieldsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriods(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriodsText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveListener(value: (typingsSlinky.amcharts.amChartMod.default, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSelectFromStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

