package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkGroupConfiguration extends js.Object {
  /**
    * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.native
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * If set to true, allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. To run the query, you must specify the query results location using one of the ways: either in the workgroup using this setting, or for individual queries (client-side), using ResultConfiguration$OutputLocation. If none of them is set, Athena issues an error that no output location is provided. For more information, see Query Results.
    */
  var ResultConfiguration: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ResultConfiguration] = js.native
}

object WorkGroupConfiguration {
  @scala.inline
  def apply(): WorkGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfiguration]
  }
  @scala.inline
  implicit class WorkGroupConfigurationOps[Self <: WorkGroupConfiguration] (val x: Self) extends AnyVal {
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
    def withResultConfiguration(value: ResultConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultConfiguration")(js.undefined)
        ret
    }
  }
  
}

