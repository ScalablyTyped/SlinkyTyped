package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true,
    * the format is applied.
    */
  var condition: js.UndefOr[BooleanCondition] = js.native
  /**
    * The format to apply.
    * Conditional formatting can only apply a subset of formatting:
    * bold, italic,
    * strikethrough,
    * foreground color &
    * background color.
    */
  var format: js.UndefOr[CellFormat] = js.native
}

object BooleanRule {
  @scala.inline
  def apply(): BooleanRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanRule]
  }
  @scala.inline
  implicit class BooleanRuleOps[Self <: BooleanRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: BooleanCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

