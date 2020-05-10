package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Formula
import typingsSlinky.officeJs.officeJsStrings.HighestValue
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.LowestValue
import typingsSlinky.officeJs.officeJsStrings.Number
import typingsSlinky.officeJs.officeJsStrings.Percent
import typingsSlinky.officeJs.officeJsStrings.Percentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Color Scale Criterion which contains a type, value, and a color.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalColorScaleCriterion extends js.Object {
  /**
    *
    * HTML color code representation of the color scale color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * A number, a formula, or null (if Type is LowestValue).
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  /**
    *
    * What the criterion conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile = js.native
}

object ConditionalColorScaleCriterion {
  @scala.inline
  def apply(
    `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
  @scala.inline
  implicit class ConditionalColorScaleCriterionOps[Self <: ConditionalColorScaleCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formula")(js.undefined)
        ret
    }
  }
  
}

