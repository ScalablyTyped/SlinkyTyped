package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalFormatRule extends js.Object {
  /** The formatting is either "on" or "off" according to the rule. */
  var booleanRule: js.UndefOr[BooleanRule] = js.native
  /** The formatting will vary based on the gradients in the rule. */
  var gradientRule: js.UndefOr[GradientRule] = js.native
  /**
    * The ranges that are formatted if the condition is true.
    * All the ranges must be on the same grid.
    */
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

