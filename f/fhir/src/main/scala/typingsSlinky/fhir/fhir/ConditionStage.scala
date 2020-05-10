package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stage/grade, usually assessed formally
  */
@js.native
trait ConditionStage extends BackboneElement {
  /**
    * Formal record of assessment
    */
  var assessment: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Simple summary (disease specific)
    */
  var summary: js.UndefOr[CodeableConcept] = js.native
}

object ConditionStage {
  @scala.inline
  def apply(): ConditionStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionStage]
  }
  @scala.inline
  implicit class ConditionStageOps[Self <: ConditionStage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessment(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssessment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessment")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

