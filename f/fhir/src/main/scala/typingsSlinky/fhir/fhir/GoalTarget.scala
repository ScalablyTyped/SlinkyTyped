package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target outcome for the goal
  */
@js.native
trait GoalTarget extends BackboneElement {
  /**
    * Contains extended information for property 'dueDate'.
    */
  var _dueDate: js.UndefOr[Element] = js.native
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
    * Reach goal on or before
    */
  var dueDate: js.UndefOr[date] = js.native
  /**
    * Reach goal on or before
    */
  var dueDuration: js.UndefOr[Duration] = js.native
  /**
    * The parameter whose value is being tracked
    */
  var measure: js.UndefOr[CodeableConcept] = js.native
}

object GoalTarget {
  @scala.inline
  def apply(): GoalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalTarget]
  }
  @scala.inline
  implicit class GoalTargetOps[Self <: GoalTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dueDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dueDate")(js.undefined)
        ret
    }
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
    def withDueDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDueDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDueDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDuration")(js.undefined)
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

