package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintSummary extends js.Object {
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.native
}

object ConstraintSummary {
  @scala.inline
  def apply(): ConstraintSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintSummary]
  }
  @scala.inline
  implicit class ConstraintSummaryOps[Self <: ConstraintSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: ConstraintDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ConstraintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

