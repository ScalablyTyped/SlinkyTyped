package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransformJobResponse extends js.Object {
  /**
    * 
    */
  var AutoMLJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn] = js.native
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set SplitType to Line, RecordIO, or TFRecord.
    */
  var BatchStrategy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.BatchStrategy] = js.native
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.Date = js.native
  var DataProcessing: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DataProcessing] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  var ExperimentConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentConfig] = js.native
  /**
    * If the transform job failed, FailureReason describes why it failed. A transform job creates a log file, which includes error messages, and stores it as an Amazon S3 object. For more information, see Log Amazon SageMaker Events with Amazon CloudWatch.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
    */
  var LabelingJobArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobArn] = js.native
  /**
    * The maximum number of parallel requests on each instance node that can be launched in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum payload size, in MB, used in the transform job.
    */
  var MaxPayloadInMB: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  /**
    * The name of the model used in the transform job.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
  /**
    * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time interval between this time and the value of TransformStartTime.
    */
  var TransformEndTime: js.UndefOr[js.Date] = js.native
  /**
    * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
    */
  var TransformInput: typingsSlinky.awsSdk.sagemakerMod.TransformInput = js.native
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typingsSlinky.awsSdk.sagemakerMod.TransformJobArn = js.native
  /**
    * The name of the transform job.
    */
  var TransformJobName: typingsSlinky.awsSdk.sagemakerMod.TransformJobName = js.native
  /**
    * The status of the transform job. If the transform job failed, the reason is returned in the FailureReason field.
    */
  var TransformJobStatus: typingsSlinky.awsSdk.sagemakerMod.TransformJobStatus = js.native
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TransformOutput] = js.native
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typingsSlinky.awsSdk.sagemakerMod.TransformResources = js.native
  /**
    * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
    */
  var TransformStartTime: js.UndefOr[js.Date] = js.native
}

object DescribeTransformJobResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus,
    TransformResources: TransformResources,
    AutoMLJobArn: AutoMLJobArn = null,
    BatchStrategy: BatchStrategy = null,
    DataProcessing: DataProcessing = null,
    Environment: TransformEnvironmentMap = null,
    ExperimentConfig: ExperimentConfig = null,
    FailureReason: FailureReason = null,
    LabelingJobArn: LabelingJobArn = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
    TransformEndTime: js.Date = null,
    TransformOutput: TransformOutput = null,
    TransformStartTime: js.Date = null
  ): DescribeTransformJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], TransformInput = TransformInput.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    if (AutoMLJobArn != null) __obj.updateDynamic("AutoMLJobArn")(AutoMLJobArn.asInstanceOf[js.Any])
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (DataProcessing != null) __obj.updateDynamic("DataProcessing")(DataProcessing.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExperimentConfig != null) __obj.updateDynamic("ExperimentConfig")(ExperimentConfig.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LabelingJobArn != null) __obj.updateDynamic("LabelingJobArn")(LabelingJobArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB.get.asInstanceOf[js.Any])
    if (TransformEndTime != null) __obj.updateDynamic("TransformEndTime")(TransformEndTime.asInstanceOf[js.Any])
    if (TransformOutput != null) __obj.updateDynamic("TransformOutput")(TransformOutput.asInstanceOf[js.Any])
    if (TransformStartTime != null) __obj.updateDynamic("TransformStartTime")(TransformStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobResponse]
  }
}

