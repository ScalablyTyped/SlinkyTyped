package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Oral diet components
  */
@js.native
trait NutritionOrderOralDiet extends BackboneElement {
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.native
  /**
    * The required consistency of fluids and liquids provided to the patient
    */
  var fluidConsistencyType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Instructions or additional information about the oral diet
    */
  var instruction: js.UndefOr[String] = js.native
  /**
    * Required  nutrient modifications
    */
  var nutrient: js.UndefOr[js.Array[NutritionOrderOralDietNutrient]] = js.native
  /**
    * Scheduled frequency of diet
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.native
  /**
    * Required  texture modifications
    */
  var texture: js.UndefOr[js.Array[NutritionOrderOralDietTexture]] = js.native
  /**
    * Type of oral diet or diet restrictions that describe what can be consumed orally
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object NutritionOrderOralDiet {
  @scala.inline
  def apply(): NutritionOrderOralDiet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDiet]
  }
  @scala.inline
  implicit class NutritionOrderOralDietOps[Self <: NutritionOrderOralDiet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_instruction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_instruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withFluidConsistencyType(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidConsistencyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluidConsistencyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidConsistencyType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(js.undefined)
        ret
    }
    @scala.inline
    def withNutrient(value: js.Array[NutritionOrderOralDietNutrient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nutrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNutrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nutrient")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: js.Array[Timing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withTexture(value: js.Array[NutritionOrderOralDietTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

