package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible or likely findings and diagnoses
  */
@js.native
trait ClinicalImpressionFinding extends BackboneElement {
  /**
    * Contains extended information for property 'basis'.
    */
  var _basis: js.UndefOr[Element] = js.native
  /**
    * Which investigations support finding
    */
  var basis: js.UndefOr[String] = js.native
  /**
    * What was found
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What was found
    */
  var itemReference: js.UndefOr[Reference] = js.native
}

object ClinicalImpressionFinding {
  @scala.inline
  def apply(): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
  @scala.inline
  implicit class ClinicalImpressionFindingOps[Self <: ClinicalImpressionFinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_basis(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_basis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_basis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_basis")(js.undefined)
        ret
    }
    @scala.inline
    def withBasis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basis")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withItemReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemReference")(js.undefined)
        ret
    }
  }
  
}

