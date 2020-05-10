package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicate extends js.Object {
  /**
    * A list of the conditions that determine when the trigger will fire.
    */
  var Conditions: js.UndefOr[ConditionList] = js.native
  /**
    * An optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
    */
  var Logical: js.UndefOr[typingsSlinky.awsSdk.glueMod.Logical] = js.native
}

object Predicate {
  @scala.inline
  def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  @scala.inline
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: ConditionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogical(value: Logical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logical")(js.undefined)
        ret
    }
  }
  
}

