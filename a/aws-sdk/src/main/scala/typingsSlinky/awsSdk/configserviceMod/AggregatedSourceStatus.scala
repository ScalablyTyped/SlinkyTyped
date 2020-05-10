package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedSourceStatus extends js.Object {
  /**
    * The region authorized to collect aggregated data.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * The error code that AWS Config returned when the source account aggregation last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  /**
    * The message indicating that the source account aggregation failed due to an error.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The source account ID or an organization.
    */
  var SourceId: js.UndefOr[String] = js.native
  /**
    * The source account or an organization.
    */
  var SourceType: js.UndefOr[AggregatedSourceType] = js.native
}

object AggregatedSourceStatus {
  @scala.inline
  def apply(): AggregatedSourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedSourceStatus]
  }
  @scala.inline
  implicit class AggregatedSourceStatusOps[Self <: AggregatedSourceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateStatus(value: AggregatedSourceStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: AggregatedSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
  }
  
}

