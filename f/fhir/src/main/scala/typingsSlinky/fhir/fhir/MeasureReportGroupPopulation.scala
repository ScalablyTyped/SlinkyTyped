package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The populations in the group
  */
@js.native
trait MeasureReportGroupPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.native
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Size of the population
    */
  var count: js.UndefOr[integer] = js.native
  /**
    * Population identifier as defined in the measure
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * For patient-list reports, the patients in this population
    */
  var patients: js.UndefOr[Reference] = js.native
}

object MeasureReportGroupPopulation {
  @scala.inline
  def apply(): MeasureReportGroupPopulation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupPopulation]
  }
  @scala.inline
  implicit class MeasureReportGroupPopulationOps[Self <: MeasureReportGroupPopulation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_count(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_count")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
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
    def withPatients(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patients")(js.undefined)
        ret
    }
  }
  
}

