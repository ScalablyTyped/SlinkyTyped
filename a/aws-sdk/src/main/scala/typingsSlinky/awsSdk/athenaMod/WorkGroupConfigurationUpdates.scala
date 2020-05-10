package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkGroupConfigurationUpdates extends js.Object {
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.native
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.native
  /**
    * If set to true, allows members assigned to a workgroup to specify Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultConfigurationUpdates] = js.native
}

object WorkGroupConfigurationUpdates {
  @scala.inline
  def apply(): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
  @scala.inline
  implicit class WorkGroupConfigurationUpdatesOps[Self <: WorkGroupConfigurationUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesScannedCutoffPerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesScannedCutoffPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesScannedCutoffPerQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceWorkGroupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceWorkGroupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceWorkGroupConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishCloudWatchMetricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishCloudWatchMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishCloudWatchMetricsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveBytesScannedCutoffPerQuery(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveBytesScannedCutoffPerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveBytesScannedCutoffPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveBytesScannedCutoffPerQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterPaysEnabled(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPaysEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPaysEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterPaysEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResultConfigurationUpdates(value: ResultConfigurationUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfigurationUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultConfigurationUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfigurationUpdates")(js.undefined)
        ret
    }
  }
  
}

