package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action to occur as part of plan
  */
@js.native
trait CarePlanActivity extends BackboneElement {
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.native
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.native
}

object CarePlanActivity {
  @scala.inline
  def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  @scala.inline
  implicit class CarePlanActivityOps[Self <: CarePlanActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: CarePlanActivityDetail): Self = {
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
    @scala.inline
    def withOutcomeCodeableConcept(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomeCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcomeReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomeReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeReference")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
  }
  
}

