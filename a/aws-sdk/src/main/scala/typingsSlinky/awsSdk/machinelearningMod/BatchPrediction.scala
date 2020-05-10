package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPrediction extends js.Object {
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request. 
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the BatchPrediction was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  var FinishedAt: js.UndefOr[js.Date] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  var InvalidRecordCount: js.UndefOr[LongType] = js.native
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the MLModel that generated predictions for the BatchPrediction request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * A description of the most recent details about processing the batch prediction request.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the BatchPrediction.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'.
    */
  var OutputUri: js.UndefOr[S3Url] = js.native
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The status of the BatchPrediction. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a batch of observations.  INPROGRESS - The process is underway.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  var TotalRecordCount: js.UndefOr[LongType] = js.native
}

object BatchPrediction {
  @scala.inline
  def apply(): BatchPrediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPrediction]
  }
  @scala.inline
  implicit class BatchPredictionOps[Self <: BatchPrediction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchPredictionDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchPredictionDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchPredictionDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchPredictionDataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchPredictionId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchPredictionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchPredictionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchPredictionId")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeTime(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByIamUser(value: AwsUserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByIamUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataLocationS3(value: S3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataLocationS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDataLocationS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataLocationS3")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidRecordCount(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidRecordCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withMLModelId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMLModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUri(value: S3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputUri")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EntityStatus): Self = {
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
    @scala.inline
    def withTotalRecordCount(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecordCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRecordCount")(js.undefined)
        ret
    }
  }
  
}

