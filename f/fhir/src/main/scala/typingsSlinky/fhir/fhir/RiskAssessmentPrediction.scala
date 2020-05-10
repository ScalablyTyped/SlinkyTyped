package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Outcome predicted
  */
@js.native
trait RiskAssessmentPrediction extends BackboneElement {
  /**
    * Contains extended information for property 'probabilityDecimal'.
    */
  var _probabilityDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'relativeRisk'.
    */
  var _relativeRisk: js.UndefOr[Element] = js.native
  /**
    * Possible outcome for the subject
    */
  var outcome: CodeableConcept = js.native
  /**
    * Likelihood of specified outcome
    */
  var probabilityDecimal: js.UndefOr[decimal] = js.native
  /**
    * Likelihood of specified outcome
    */
  var probabilityRange: js.UndefOr[Range] = js.native
  /**
    * Likelihood of specified outcome as a qualitative value
    */
  var qualitativeRisk: js.UndefOr[CodeableConcept] = js.native
  /**
    * Explanation of prediction
    */
  var rationale: js.UndefOr[String] = js.native
  /**
    * Relative likelihood
    */
  var relativeRisk: js.UndefOr[decimal] = js.native
  /**
    * Timeframe or age range
    */
  var whenPeriod: js.UndefOr[Period] = js.native
  /**
    * Timeframe or age range
    */
  var whenRange: js.UndefOr[Range] = js.native
}

object RiskAssessmentPrediction {
  @scala.inline
  def apply(outcome: CodeableConcept): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
  @scala.inline
  implicit class RiskAssessmentPredictionOps[Self <: RiskAssessmentPrediction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutcome(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_probabilityDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_probabilityDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_probabilityDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_probabilityDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_rationale(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rationale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rationale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rationale")(js.undefined)
        ret
    }
    @scala.inline
    def with_relativeRisk(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_relativeRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_relativeRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_relativeRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withProbabilityDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probabilityDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProbabilityDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probabilityDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withProbabilityRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probabilityRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProbabilityRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probabilityRange")(js.undefined)
        ret
    }
    @scala.inline
    def withQualitativeRisk(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualitativeRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualitativeRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withRationale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rationale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRationale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rationale")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeRisk(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenRange")(js.undefined)
        ret
    }
  }
  
}

