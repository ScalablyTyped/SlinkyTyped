package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vaccine administration recommendations
  */
@js.native
trait ImmunizationRecommendationRecommendation extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'doseNumber'.
    */
  var _doseNumber: js.UndefOr[Element] = js.native
  /**
    * Date recommendation created
    */
  var date: dateTime = js.native
  /**
    * Dates governing proposed immunization
    */
  var dateCriterion: js.UndefOr[js.Array[ImmunizationRecommendationRecommendationDateCriterion]] = js.native
  /**
    * Recommended dose number
    */
  var doseNumber: js.UndefOr[positiveInt] = js.native
  /**
    * Vaccine administration status
    */
  var forecastStatus: CodeableConcept = js.native
  /**
    * Protocol used by recommendation
    */
  var protocol: js.UndefOr[ImmunizationRecommendationRecommendationProtocol] = js.native
  /**
    * Past immunizations supporting recommendation
    */
  var supportingImmunization: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Patient observations supporting recommendation
    */
  var supportingPatientInformation: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Disease to be immunized against
    */
  var targetDisease: js.UndefOr[CodeableConcept] = js.native
  /**
    * Vaccine recommendation applies to
    */
  var vaccineCode: js.UndefOr[CodeableConcept] = js.native
}

object ImmunizationRecommendationRecommendation {
  @scala.inline
  def apply(date: dateTime, forecastStatus: CodeableConcept): ImmunizationRecommendationRecommendation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], forecastStatus = forecastStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendation]
  }
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationOps[Self <: ImmunizationRecommendationRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecastStatus(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forecastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_date(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(js.undefined)
        ret
    }
    @scala.inline
    def with_doseNumber(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_doseNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doseNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCriterion(value: js.Array[ImmunizationRecommendationRecommendationDateCriterion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCriterion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCriterion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCriterion")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseNumber(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: ImmunizationRecommendationRecommendationProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingImmunization(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingImmunization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingImmunization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingImmunization")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingPatientInformation(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingPatientInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingPatientInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingPatientInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDisease(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDisease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDisease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDisease")(js.undefined)
        ret
    }
    @scala.inline
    def withVaccineCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaccineCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaccineCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaccineCode")(js.undefined)
        ret
    }
  }
  
}

