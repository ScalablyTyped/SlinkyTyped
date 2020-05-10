package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationOverview extends js.Object {
  /**
    * Returns the number of targets for the association status. For example, if you created an association with two instances, and one of them was successful, this would return the count of instances by status.
    */
  var AssociationStatusAggregatedCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationStatusAggregatedCount] = js.native
  /**
    * A detailed status of the association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The status of the association. Status can be: Pending, Success, or Failed.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationOverview {
  @scala.inline
  def apply(): AssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOverview]
  }
  @scala.inline
  implicit class AssociationOverviewOps[Self <: AssociationOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationStatusAggregatedCount(value: AssociationStatusAggregatedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationStatusAggregatedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationStatusAggregatedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationStatusAggregatedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailedStatus(value: StatusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StatusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

