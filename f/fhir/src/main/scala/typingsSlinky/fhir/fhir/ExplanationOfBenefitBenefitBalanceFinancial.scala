package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Benefit Summary
  */
@js.native
trait ExplanationOfBenefitBenefitBalanceFinancial extends BackboneElement {
  /**
    * Contains extended information for property 'allowedString'.
    */
  var _allowedString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'allowedUnsignedInt'.
    */
  var _allowedUnsignedInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'usedUnsignedInt'.
    */
  var _usedUnsignedInt: js.UndefOr[Element] = js.native
  /**
    * Benefits allowed
    */
  var allowedMoney: js.UndefOr[Money] = js.native
  /**
    * Benefits allowed
    */
  var allowedString: js.UndefOr[String] = js.native
  /**
    * Benefits allowed
    */
  var allowedUnsignedInt: js.UndefOr[unsignedInt] = js.native
  /**
    * Deductable, visits, benefit amount
    */
  var `type`: CodeableConcept = js.native
  /**
    * Benefits used
    */
  var usedMoney: js.UndefOr[Money] = js.native
  /**
    * Benefits used
    */
  var usedUnsignedInt: js.UndefOr[unsignedInt] = js.native
}

object ExplanationOfBenefitBenefitBalanceFinancial {
  @scala.inline
  def apply(`type`: CodeableConcept): ExplanationOfBenefitBenefitBalanceFinancial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitBenefitBalanceFinancial]
  }
  @scala.inline
  implicit class ExplanationOfBenefitBenefitBalanceFinancialOps[Self <: ExplanationOfBenefitBenefitBalanceFinancial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_allowedString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_allowedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowedString")(js.undefined)
        ret
    }
    @scala.inline
    def with_allowedUnsignedInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowedUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_allowedUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowedUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def with_usedUnsignedInt(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_usedUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_usedUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_usedUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedMoney(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedMoney: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMoney")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedString")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedUnsignedInt(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUnsignedInt")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedMoney(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedMoney")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedMoney: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedMoney")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedUnsignedInt(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedUnsignedInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedUnsignedInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedUnsignedInt")(js.undefined)
        ret
    }
  }
  
}

