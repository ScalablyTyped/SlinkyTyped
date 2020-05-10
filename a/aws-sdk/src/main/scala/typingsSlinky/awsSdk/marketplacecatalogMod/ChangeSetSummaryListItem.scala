package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSetSummaryListItem extends js.Object {
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for a change set.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The non-unique name for the change set.
    */
  var ChangeSetName: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.
    */
  var EntityIdList: js.UndefOr[ResourceIdList] = js.native
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * The current status of the change set.
    */
  var Status: js.UndefOr[ChangeStatus] = js.native
}

object ChangeSetSummaryListItem {
  @scala.inline
  def apply(): ChangeSetSummaryListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetSummaryListItem]
  }
  @scala.inline
  implicit class ChangeSetSummaryListItemOps[Self <: ChangeSetSummaryListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeSetName(value: ChangeSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: DateTimeISO8601): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityIdList(value: ResourceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityIdList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityIdList")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: DateTimeISO8601): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ChangeStatus): Self = {
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

