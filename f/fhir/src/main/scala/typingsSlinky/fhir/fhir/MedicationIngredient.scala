package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Active or inactive ingredient
  */
@js.native
trait MedicationIngredient extends BackboneElement {
  /**
    * Contains extended information for property 'isActive'.
    */
  var _isActive: js.UndefOr[Element] = js.native
  /**
    * Quantity of ingredient present
    */
  var amount: js.UndefOr[Ratio] = js.native
  /**
    * Active ingredient indicator
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The product contained
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * The product contained
    */
  var itemReference: js.UndefOr[Reference] = js.native
}

object MedicationIngredient {
  @scala.inline
  def apply(): MedicationIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationIngredient]
  }
  @scala.inline
  implicit class MedicationIngredientOps[Self <: MedicationIngredient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_isActive(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_isActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withItemReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(js.undefined)
        ret
    }
  }
  
}

