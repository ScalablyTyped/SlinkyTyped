package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enteral formula components
  */
@js.native
trait NutritionOrderEnteralFormula extends BackboneElement {
  /**
    * Contains extended information for property 'additiveProductName'.
    */
  var _additiveProductName: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'administrationInstruction'.
    */
  var _administrationInstruction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'baseFormulaProductName'.
    */
  var _baseFormulaProductName: js.UndefOr[Element] = js.native
  /**
    * Product or brand name of the modular additive
    */
  var additiveProductName: js.UndefOr[String] = js.native
  /**
    * Type of modular component to add to the feeding
    */
  var additiveType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Formula feeding instruction as structured data
    */
  var administration: js.UndefOr[js.Array[NutritionOrderEnteralFormulaAdministration]] = js.native
  /**
    * Formula feeding instructions expressed as text
    */
  var administrationInstruction: js.UndefOr[String] = js.native
  /**
    * Product or brand name of the enteral or infant formula
    */
  var baseFormulaProductName: js.UndefOr[String] = js.native
  /**
    * Type of enteral or infant formula
    */
  var baseFormulaType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Amount of energy per specified volume that is required
    */
  var caloricDensity: js.UndefOr[Quantity] = js.native
  /**
    * Upper limit on formula volume per unit of time
    */
  var maxVolumeToDeliver: js.UndefOr[Quantity] = js.native
  /**
    * How the formula should enter the patient's gastrointestinal tract
    */
  var routeofAdministration: js.UndefOr[CodeableConcept] = js.native
}

object NutritionOrderEnteralFormula {
  @scala.inline
  def apply(): NutritionOrderEnteralFormula = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormula]
  }
  @scala.inline
  implicit class NutritionOrderEnteralFormulaOps[Self <: NutritionOrderEnteralFormula] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_additiveProductName(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_additiveProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_additiveProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_additiveProductName")(js.undefined)
        ret
    }
    @scala.inline
    def with_administrationInstruction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_administrationInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_administrationInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_administrationInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def with_baseFormulaProductName(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_baseFormulaProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_baseFormulaProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_baseFormulaProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditiveProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditiveProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditiveType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditiveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additiveType")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministration(value: js.Array[NutritionOrderEnteralFormulaAdministration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administration")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministrationInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrationInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrationInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrationInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFormulaProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFormulaProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFormulaProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFormulaProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseFormulaType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFormulaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFormulaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFormulaType")(js.undefined)
        ret
    }
    @scala.inline
    def withCaloricDensity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caloricDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaloricDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caloricDensity")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVolumeToDeliver(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVolumeToDeliver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVolumeToDeliver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVolumeToDeliver")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteofAdministration(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeofAdministration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteofAdministration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeofAdministration")(js.undefined)
        ret
    }
  }
  
}

