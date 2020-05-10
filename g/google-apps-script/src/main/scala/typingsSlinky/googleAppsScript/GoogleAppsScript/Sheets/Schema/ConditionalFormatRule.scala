package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalFormatRule extends js.Object {
  var booleanRule: js.UndefOr[BooleanRule] = js.native
  var gradientRule: js.UndefOr[GradientRule] = js.native
  var ranges: js.UndefOr[js.Array[GridRange]] = js.native
}

object ConditionalFormatRule {
  @scala.inline
  def apply(): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  @scala.inline
  implicit class ConditionalFormatRuleOps[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanRule(value: BooleanRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanRule")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientRule(value: GradientRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientRule")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[GridRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

