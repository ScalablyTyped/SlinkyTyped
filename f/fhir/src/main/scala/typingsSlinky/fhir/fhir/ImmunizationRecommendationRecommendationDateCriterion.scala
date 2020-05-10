package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dates governing proposed immunization
  */
@js.native
trait ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Type of date
    */
  var code: CodeableConcept = js.native
  /**
    * Recommended date
    */
  var value: dateTime = js.native
}

object ImmunizationRecommendationRecommendationDateCriterion {
  @scala.inline
  def apply(code: CodeableConcept, value: dateTime): ImmunizationRecommendationRecommendationDateCriterion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationDateCriterion]
  }
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationDateCriterionOps[Self <: ImmunizationRecommendationRecommendationDateCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
  }
  
}

