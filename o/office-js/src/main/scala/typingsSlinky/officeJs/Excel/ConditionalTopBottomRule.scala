package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.BottomItems
import typingsSlinky.officeJs.officeJsStrings.BottomPercent
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.TopItems
import typingsSlinky.officeJs.officeJsStrings.TopPercent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the rule of the top/bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalTopBottomRule extends js.Object {
  /**
    *
    * The rank between 1 and 1000 for numeric ranks or 1 and 100 for percent ranks.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rank: Double = js.native
  /**
    *
    * Format values based on the top or bottom rank.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent = js.native
}

object ConditionalTopBottomRule {
  @scala.inline
  def apply(
    rank: Double,
    `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
  ): ConditionalTopBottomRule = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTopBottomRule]
  }
  @scala.inline
  implicit class ConditionalTopBottomRuleOps[Self <: ConditionalTopBottomRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(
      value: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

