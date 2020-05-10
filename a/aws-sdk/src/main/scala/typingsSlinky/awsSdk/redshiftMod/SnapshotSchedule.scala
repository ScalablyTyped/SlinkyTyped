package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSchedule extends js.Object {
  /**
    * The number of clusters associated with the schedule.
    */
  var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
    */
  var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.native
  /**
    * 
    */
  var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.native
  /**
    * A list of ScheduleDefinitions.
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  /**
    * The description of the schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the schedule.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional set of tags describing the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SnapshotSchedule {
  @scala.inline
  def apply(): SnapshotSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotSchedule]
  }
  @scala.inline
  implicit class SnapshotScheduleOps[Self <: SnapshotSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedClusterCount(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedClusterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedClusterCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedClusterCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedClusters(value: AssociatedClusterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withNextInvocations(value: ScheduledSnapshotTimeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextInvocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleDefinitions(value: ScheduleDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

