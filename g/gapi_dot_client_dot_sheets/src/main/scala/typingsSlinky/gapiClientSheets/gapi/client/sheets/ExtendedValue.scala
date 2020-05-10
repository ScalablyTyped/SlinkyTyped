package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedValue extends js.Object {
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * Represents an error.
    * This field is read-only.
    */
  var errorValue: js.UndefOr[ErrorValue] = js.native
  /** Represents a formula. */
  var formulaValue: js.UndefOr[String] = js.native
  /**
    * Represents a double value.
    * Note: Dates, Times and DateTimes are represented as doubles in
    * "serial number" format.
    */
  var numberValue: js.UndefOr[Double] = js.native
  /**
    * Represents a string value.
    * Leading single quotes are not included. For example, if the user typed
    * `'123` into the UI, this would be represented as a `stringValue` of
    * `"123"`.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object ExtendedValue {
  @scala.inline
  def apply(): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedValue]
  }
  @scala.inline
  implicit class ExtendedValueOps[Self <: ExtendedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorValue(value: ErrorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulaValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
  }
  
}

