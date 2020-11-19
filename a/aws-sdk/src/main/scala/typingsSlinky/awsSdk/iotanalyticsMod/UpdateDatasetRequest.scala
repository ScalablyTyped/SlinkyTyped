package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatasetRequest extends js.Object {
  
  /**
    * A list of "DatasetAction" objects.
    */
  var actions: DatasetActions = js.native
  
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.native
  
  /**
    * The name of the data set to update.
    */
  var datasetName: DatasetName = js.native
  
  /**
    * How long, in days, data set contents are kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  
  /**
    * A list of "DatasetTrigger" objects. The list can be empty or can contain up to five DataSetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.native
  
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.native
}
object UpdateDatasetRequest {
  
  @scala.inline
  def apply(actions: DatasetActions, datasetName: DatasetName): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  @scala.inline
  implicit class UpdateDatasetRequestOps[Self <: UpdateDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: DatasetAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: DatasetActions): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = this.set("contentDeliveryRules", js.Array(value :_*))
    
    @scala.inline
    def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = this.set("contentDeliveryRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDeliveryRules: Self = this.set("contentDeliveryRules", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: DatasetTrigger*): Self = this.set("triggers", js.Array(value :_*))
    
    @scala.inline
    def setTriggers(value: DatasetTriggers): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    
    @scala.inline
    def setVersioningConfiguration(value: VersioningConfiguration): Self = this.set("versioningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersioningConfiguration: Self = this.set("versioningConfiguration", js.undefined)
  }
}
