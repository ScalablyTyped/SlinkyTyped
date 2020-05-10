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
    TransformResources: TransformResources
  ): DescribeTransformJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], TransformInput = TransformInput.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobResponse]
  }
  @scala.inline
  implicit class DescribeTransformJobResponseOps[Self <: DescribeTransformJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: ModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformInput(value: TransformInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformJobArn(value: TransformJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformJobName(value: TransformJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformJobStatus(value: TransformJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformResources(value: TransformResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobArn(value: AutoMLJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchStrategy(value: BatchStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withDataProcessing(value: DataProcessing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: TransformEnvironmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentConfig(value: ExperimentConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelingJobArn(value: LabelingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPayloadInMB(value: MaxPayloadInMB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPayloadInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPayloadInMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPayloadInMB")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOutput(value: TransformOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformStartTime")(js.undefined)
        ret
    }
  }
  
}

