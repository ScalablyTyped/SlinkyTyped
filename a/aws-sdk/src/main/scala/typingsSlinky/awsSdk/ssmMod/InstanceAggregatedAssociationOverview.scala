package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAggregatedAssociationOverview extends js.Object {
  /**
    * Detailed status information about the aggregated associations.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The number of associations for the instance(s).
    */
  var InstanceAssociationStatusAggregatedCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceAssociationStatusAggregatedCount] = js.native
}

object InstanceAggregatedAssociationOverview {
  @scala.inline
  def apply(): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
  @scala.inline
  implicit class InstanceAggregatedAssociationOverviewOps[Self <: InstanceAggregatedAssociationOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withInstanceAssociationStatusAggregatedCount(value: InstanceAssociationStatusAggregatedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAssociationStatusAggregatedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceAssociationStatusAggregatedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAssociationStatusAggregatedCount")(js.undefined)
        ret
    }
  }
  
}

