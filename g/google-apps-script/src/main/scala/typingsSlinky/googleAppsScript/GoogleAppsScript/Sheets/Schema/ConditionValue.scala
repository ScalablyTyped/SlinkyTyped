package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionValue extends js.Object {
  var relativeDate: js.UndefOr[String] = js.native
  var userEnteredValue: js.UndefOr[String] = js.native
}

object ConditionValue {
  @scala.inline
  def apply(): ConditionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionValue]
  }
  @scala.inline
  implicit class ConditionValueOps[Self <: ConditionValue] (val x: Self) extends AnyVal {
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

