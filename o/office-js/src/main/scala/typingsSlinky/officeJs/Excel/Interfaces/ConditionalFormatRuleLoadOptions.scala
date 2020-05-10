package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule, for all traditional rule/format pairings.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalFormatRuleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[Boolean] = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[Boolean] = js.native
}

object ConditionalFormatRuleLoadOptions {
  @scala.inline
  def apply(): ConditionalFormatRuleLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRuleLoadOptions]
  }
  @scala.inline
  implicit class ConditionalFormatRuleLoadOptionsOps[Self <: ConditionalFormatRuleLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withFormula(value: Boolean): Self = {
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
    @scala.inline
    def withFormulaLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withFormulaR1C1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaR1C1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaR1C1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaR1C1")(js.undefined)
        ret
    }
  }
  
}

