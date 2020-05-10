package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composition information about the substance
  */
@js.native
trait SubstanceIngredient extends BackboneElement {
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.native
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.native
}

object SubstanceIngredient {
  @scala.inline
  def apply(): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceIngredient]
  }
  @scala.inline
  implicit class SubstanceIngredientOps[Self <: SubstanceIngredient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstanceCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substanceCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstanceCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substanceCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstanceReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substanceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstanceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substanceReference")(js.undefined)
        ret
    }
  }
  
}

