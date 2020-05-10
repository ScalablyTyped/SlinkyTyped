package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The value of the condition.
  */
@js.native
trait SchemaConditionValue extends js.Object {
  /**
    * A relative date (based on the current date). Valid only if the type is
    * DATE_BEFORE, DATE_AFTER, DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER.  Relative
    * dates are not supported in data validation. They are supported only in
    * conditional formatting and conditional filters.
    */
  var relativeDate: js.UndefOr[String] = js.native
  /**
    * A value the condition is based on. The value is parsed as if the user
    * typed into a cell. Formulas are supported (and must begin with an `=` or
    * a &#39;+&#39;).
    */
  var userEnteredValue: js.UndefOr[String] = js.native
}

object SchemaConditionValue {
  @scala.inline
  def apply(): SchemaConditionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionValue]
  }
  @scala.inline
  implicit class SchemaConditionValueOps[Self <: SchemaConditionValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelativeDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnteredValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnteredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(js.undefined)
        ret
    }
  }
  
}

