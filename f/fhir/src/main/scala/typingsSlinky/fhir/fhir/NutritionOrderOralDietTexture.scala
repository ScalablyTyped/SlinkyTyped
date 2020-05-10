package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required  texture modifications
  */
@js.native
trait NutritionOrderOralDietTexture extends BackboneElement {
  /**
    * Concepts that are used to identify an entity that is ingested for nutritional purposes
    */
  var foodType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Code to indicate how to alter the texture of the foods, e.g. pureed
    */
  var modifier: js.UndefOr[CodeableConcept] = js.native
}

object NutritionOrderOralDietTexture {
  @scala.inline
  def apply(): NutritionOrderOralDietTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietTexture]
  }
  @scala.inline
  implicit class NutritionOrderOralDietTextureOps[Self <: NutritionOrderOralDietTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoodType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoodType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodType")(js.undefined)
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

