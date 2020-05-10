package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetRequest extends js.Object {
  /**
    * A list of actions that create the data set contents.
    */
  var actions: DatasetActions = js.native
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  /**
    * The name of the data set.
    */
  var datasetName: DatasetName = js.native
  /**
    * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents retained is determined by the versioningConfiguration parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * Metadata which can be used to manage the data set.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when another data set's contents are created. The list of triggers can be empty or contain up to five DataSetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}

object CreateDatasetRequest {
  @scala.inline
  def apply(actions: DatasetActions, datasetName: DatasetName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  @scala.inline
  implicit class CreateDatasetRequestOps[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: DatasetActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetName(value: DatasetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDeliveryRules(value: DatasetContentDeliveryRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDeliveryRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDeliveryRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDeliveryRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: RetentionPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers(value: DatasetTriggers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioningConfiguration(value: VersioningConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioningConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioningConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioningConfiguration")(js.undefined)
        ret
    }
  }
  
}

