package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Diet, formula or nutritional supplement request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait NutritionOrder extends DomainResource {
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * List of the patient's food and nutrition-related allergies and intolerances
    */
  var allergyIntolerance: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Date and time the nutrition order was requested
    */
  var dateTime: typingsSlinky.fhir.fhir.dateTime = js.native
  /**
    * The encounter associated with this nutrition order
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Enteral formula components
    */
  var enteralFormula: js.UndefOr[NutritionOrderEnteralFormula] = js.native
  /**
    * Order-specific modifier about the type of food that should not be given
    */
  var excludeFoodModifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Order-specific modifier about the type of food that should be given
    */
  var foodPreferenceModifier: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Oral diet components
    */
  var oralDiet: js.UndefOr[NutritionOrderOralDiet] = js.native
  /**
    * Who ordered the diet, formula or nutritional supplement
    */
  var orderer: js.UndefOr[Reference] = js.native
  /**
    * The person who requires the diet, formula or nutritional supplement
    */
  var patient: Reference = js.native
  /**
    * proposed | draft | planned | requested | active | on-hold | completed | cancelled | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Supplement components
    */
  var supplement: js.UndefOr[js.Array[NutritionOrderSupplement]] = js.native
}

object NutritionOrder {
  @scala.inline
  def apply(dateTime: dateTime, patient: Reference): NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionOrder]
  }
  @scala.inline
  implicit class NutritionOrderOps[Self <: NutritionOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withAllergyIntolerance(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allergyIntolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllergyIntolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allergyIntolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withEncounter(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnteralFormula(value: NutritionOrderEnteralFormula): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteralFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnteralFormula: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteralFormula")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFoodModifier(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFoodModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFoodModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFoodModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFoodPreferenceModifier(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodPreferenceModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoodPreferenceModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodPreferenceModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOralDiet(value: NutritionOrderOralDiet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oralDiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOralDiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oralDiet")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplement(value: js.Array[NutritionOrderSupplement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplement")(js.undefined)
        ret
    }
  }
  
}

