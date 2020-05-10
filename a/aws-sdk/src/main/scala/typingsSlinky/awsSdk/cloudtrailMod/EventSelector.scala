package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSelector extends js.Object {
  /**
    * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250 resources for an individual event selector, but the total number of data resources cannot exceed 250 across all event selectors in a trail. This limit does not apply if you configure resource logging for all data events.  For more information, see Data Events and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
    */
  var DataResources: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.DataResources] = js.native
  /**
    * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing "kms.amazonaws.com". By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail. 
    */
  var ExcludeManagementEventSources: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.ExcludeManagementEventSources] = js.native
  /**
    * Specify if you want your event selector to include management events for your trail.  For more information, see Management Events in the AWS CloudTrail User Guide. By default, the value is true.
    */
  var IncludeManagementEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.  By default, the value is All.
    */
  var ReadWriteType: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.ReadWriteType] = js.native
}

object EventSelector {
  @scala.inline
  def apply(): EventSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSelector]
  }
  @scala.inline
  implicit class EventSelectorOps[Self <: EventSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataResources(value: DataResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataResources")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeManagementEventSources(value: ExcludeManagementEventSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeManagementEventSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeManagementEventSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludeManagementEventSources")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeManagementEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeManagementEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeManagementEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeManagementEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withReadWriteType(value: ReadWriteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadWriteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadWriteType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadWriteType")(js.undefined)
        ret
    }
  }
  
}

