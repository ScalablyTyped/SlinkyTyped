package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
@js.native
trait PlanDefinitionGoalTarget extends BackboneElement {
  /**
    * The target value to be achieved
    */
  var detailCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * The target value to be achieved
    */
  var detailQuantity: js.UndefOr[Quantity] = js.native
  /**
    * The target value to be achieved
    */
  var detailRange: js.UndefOr[Range] = js.native
  /**
    * Reach goal within
    */
  var due: js.UndefOr[Duration] = js.native
  /**
    * The parameter whose value is to be tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}

object PlanDefinitionGoalTarget {
  @scala.inline
  def apply(): PlanDefinitionGoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionGoalTarget]
  }
  @scala.inline
  implicit class PlanDefinitionGoalTargetOps[Self <: PlanDefinitionGoalTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDue(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasure(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
  }
  
}

