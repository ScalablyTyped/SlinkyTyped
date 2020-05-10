package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobDefinition extends js.Object {
  /**
    * The hyperparameters used for the training job.
    */
  var HyperParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameters] = js.native
  /**
    * An array of Channel objects, each of which specifies an input source.
    */
  var InputDataConfig: typingsSlinky.awsSdk.sagemakerMod.InputDataConfig = js.native
  /**
    * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
    */
  var OutputDataConfig: typingsSlinky.awsSdk.sagemakerMod.OutputDataConfig = js.native
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.
    */
  var ResourceConfig: typingsSlinky.awsSdk.sagemakerMod.ResourceConfig = js.native
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts.
    */
  var StoppingCondition: typingsSlinky.awsSdk.sagemakerMod.StoppingCondition = js.native
  /**
    * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
    */
  var TrainingInputMode: typingsSlinky.awsSdk.sagemakerMod.TrainingInputMode = js.native
}

object TrainingJobDefinition {
  @scala.inline
  def apply(
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    StoppingCondition: StoppingCondition,
    TrainingInputMode: TrainingInputMode
  ): TrainingJobDefinition = {
    val __obj = js.Dynamic.literal(InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any], TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobDefinition]
  }
  @scala.inline
  implicit class TrainingJobDefinitionOps[Self <: TrainingJobDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: OutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceConfig(value: ResourceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppingCondition(value: StoppingCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingInputMode(value: TrainingInputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingInputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperParameters(value: HyperParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HyperParameters")(js.undefined)
        ret
    }
  }
  
}

