package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more sets of investigations (signs, symptions, etc.)
  */
@js.native
trait ClinicalImpressionInvestigation extends BackboneElement {
  /**
    * A name/code for the set
    */
  var code: CodeableConcept = js.native
  /**
    * Record of a specific investigation
    */
  var item: js.UndefOr[js.Array[Reference]] = js.native
}

object ClinicalImpressionInvestigation {
  @scala.inline
  def apply(code: CodeableConcept): ClinicalImpressionInvestigation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionInvestigation]
  }
  @scala.inline
  implicit class ClinicalImpressionInvestigationOps[Self <: ClinicalImpressionInvestigation] (val x: Self) extends AnyVal {
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
    def withItem(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
  }
  
}

