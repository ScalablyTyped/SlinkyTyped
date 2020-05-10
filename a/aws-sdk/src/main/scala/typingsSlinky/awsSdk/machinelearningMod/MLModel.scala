package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MLModel extends js.Object {
  /**
    * The algorithm used to train the MLModel. The following algorithm is supported:   SGD -- Stochastic gradient descent. The goal of SGD is to minimize the gradient of the loss function.  
    */
  var Algorithm: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Algorithm] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the MLModel was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The current endpoint of the MLModel.
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.native
  var FinishedAt: js.UndefOr[js.Date] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * Identifies the MLModel category. The following are the available types:   REGRESSION - Produces a numeric result. For example, "What price should a house be listed at?"  BINARY - Produces one of two possible results. For example, "Is this a child-friendly web site?".  MULTICLASS - Produces one of several possible results. For example, "Is this a HIGH-, LOW-, or MEDIUM-risk trade?". 
    */
  var MLModelType: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.MLModelType] = js.native
  /**
    * A description of the most recent details about accessing the MLModel.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the MLModel.
    */
  var Name: js.UndefOr[MLModelName] = js.native
  var ScoreThreshold: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.ScoreThreshold] = js.native
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[js.Date] = js.native
  var SizeInBytes: js.UndefOr[LongType] = js.native
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The current status of an MLModel. This element can have one of the following values:    PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create an MLModel.  INPROGRESS - The creation process is underway.  FAILED - The request to create an MLModel didn't run to completion. The model isn't usable.  COMPLETED - The creation process completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  /**
    * The ID of the training DataSource. The CreateMLModel operation uses the TrainingDataSourceId.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm, which controls overfitting the data by penalizing large coefficients. This parameter tends to drive coefficients to zero, resulting in sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm, which controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.TrainingParameters] = js.native
}

object MLModel {
  @scala.inline
  def apply(): MLModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLModel]
  }
  @scala.inline
  implicit class MLModelOps[Self <: MLModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algorithm")(js.undefined)
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
    def withEndpointInfo(value: RealtimeEndpointInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointInfo")(js.undefined)
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
    def withMLModelType(value: MLModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMLModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelType")(js.undefined)
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
    def withName(value: MLModelName): Self = {
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
    def withScoreThreshold(value: ScoreThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScoreThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScoreThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreThresholdLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScoreThresholdLastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreThresholdLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScoreThresholdLastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInBytes(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(js.undefined)
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
    def withTrainingDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingDataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingParameters(value: TrainingParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingParameters")(js.undefined)
        ret
    }
  }
  
}

