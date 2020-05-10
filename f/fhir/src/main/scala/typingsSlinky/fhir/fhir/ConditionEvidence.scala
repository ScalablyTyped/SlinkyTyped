package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supporting evidence
  */
@js.native
trait ConditionEvidence extends BackboneElement {
  /**
    * Manifestation/symptom
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Supporting information found elsewhere
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.native
}

object ConditionEvidence {
  @scala.inline
  def apply(): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvidence]
  }
  @scala.inline
  implicit class ConditionEvidenceOps[Self <: ConditionEvidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: js.Array[CodeableConcept]): Self = {
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
    def withDetail(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
  }
  
}

