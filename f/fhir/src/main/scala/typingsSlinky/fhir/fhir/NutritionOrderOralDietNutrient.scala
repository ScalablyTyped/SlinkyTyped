package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required  nutrient modifications
  */
@js.native
trait NutritionOrderOralDietNutrient extends BackboneElement {
  /**
    * Quantity of the specified nutrient
    */
  var amount: js.UndefOr[Quantity] = js.native
  /**
    * Type of nutrient that is being modified
    */
  var modifier: js.UndefOr[CodeableConcept] = js.native
}

object NutritionOrderOralDietNutrient {
  @scala.inline
  def apply(): NutritionOrderOralDietNutrient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietNutrient]
  }
  @scala.inline
  implicit class NutritionOrderOralDietNutrientOps[Self <: NutritionOrderOralDietNutrient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Quantity): Self = {
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
    def withModifier(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
  }
  
}

