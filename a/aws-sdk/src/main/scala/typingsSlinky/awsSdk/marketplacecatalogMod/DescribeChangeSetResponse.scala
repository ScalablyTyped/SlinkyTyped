package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetResponse extends js.Object {
  /**
    * An array of ChangeSummary objects.
    */
  var ChangeSet: js.UndefOr[ChangeSetDescription] = js.native
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * Required. The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The optional name provided in the StartChangeSet request. If you do not provide a name, one is set by default.
    */
  var ChangeSetName: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. 
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.
    */
  var FailureDescription: js.UndefOr[StringValue] = js.native
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. 
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * The status of the change request.
    */
  var Status: js.UndefOr[ChangeStatus] = js.native
}

object DescribeChangeSetResponse {
  @scala.inline
  def apply(): DescribeChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetResponse]
  }
  @scala.inline
  implicit class DescribeChangeSetResponseOps[Self <: DescribeChangeSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSet(value: ChangeSetDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSet")(js.undefined)
        ret
    }
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
    def withFailureDescription(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(js.undefined)
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

