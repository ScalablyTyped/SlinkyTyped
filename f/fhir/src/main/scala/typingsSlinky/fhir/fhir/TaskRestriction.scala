package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constraints on fulfillment tasks
  */
@js.native
trait TaskRestriction extends BackboneElement {
  /**
    * Contains extended information for property 'repetitions'.
    */
  var _repetitions: js.UndefOr[Element] = js.native
  /**
    * When fulfillment sought
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * For whom is fulfillment sought?
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * How many times to repeat
    */
  var repetitions: js.UndefOr[positiveInt] = js.native
}

object TaskRestriction {
  @scala.inline
  def apply(): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRestriction]
  }
  @scala.inline
  implicit class TaskRestrictionOps[Self <: TaskRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_repetitions(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_repetitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_repetitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_repetitions")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withRepetitions(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repetitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepetitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repetitions")(js.undefined)
        ret
    }
  }
  
}

