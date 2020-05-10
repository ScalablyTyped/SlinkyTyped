package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilationJobRequest extends js.Object {
  /**
    * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account. 
    */
  var CompilationJobName: EntityName = js.native
  /**
    * Provides information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: typingsSlinky.awsSdk.sagemakerMod.InputConfig = js.native
  /**
    * Provides information about the output location for the compiled model and the target device the model runs on.
    */
  var OutputConfig: typingsSlinky.awsSdk.sagemakerMod.OutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.  During model compilation, Amazon SageMaker needs your permission to:   Read input data from an S3 bucket   Write model artifacts to an S3 bucket   Write logs to Amazon CloudWatch Logs   Publish metrics to Amazon CloudWatch   You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. For more information, see Amazon SageMaker Roles. 
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Specifies a limit to how long a model compilation job can run. When the job reaches the time limit, Amazon SageMaker ends the compilation job. Use this API to cap model training costs.
    */
  var StoppingCondition: typingsSlinky.awsSdk.sagemakerMod.StoppingCondition = js.native
}

object CreateCompilationJobRequest {
  @scala.inline
  def apply(
    CompilationJobName: EntityName,
    InputConfig: InputConfig,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): CreateCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilationJobRequest]
  }
  @scala.inline
  implicit class CreateCompilationJobRequestOps[Self <: CreateCompilationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilationJobName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputConfig(value: InputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputConfig(value: OutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoppingCondition(value: StoppingCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppingCondition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

