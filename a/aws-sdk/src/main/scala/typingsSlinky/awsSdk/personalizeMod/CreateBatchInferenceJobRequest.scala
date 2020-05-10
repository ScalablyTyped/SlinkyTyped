package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBatchInferenceJobRequest extends js.Object {
  /**
    * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in JSON format.
    */
  var jobInput: BatchInferenceJobInput = js.native
  /**
    * The name of the batch inference job to create.
    */
  var jobName: Name = js.native
  /**
    * The path to the Amazon S3 bucket where the job's output will be stored.
    */
  var jobOutput: BatchInferenceJobOutput = js.native
  /**
    * The number of recommendations to retreive.
    */
  var numResults: js.UndefOr[NumBatchResults] = js.native
  /**
    * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input and out Amazon S3 buckets respectively.
    */
  var roleArn: RoleArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference recommendations.
    */
  var solutionVersionArn: Arn = js.native
}

object CreateBatchInferenceJobRequest {
  @scala.inline
  def apply(
    jobInput: BatchInferenceJobInput,
    jobName: Name,
    jobOutput: BatchInferenceJobOutput,
    roleArn: RoleArn,
    solutionVersionArn: Arn
  ): CreateBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(jobInput = jobInput.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobOutput = jobOutput.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchInferenceJobRequest]
  }
  @scala.inline
  implicit class CreateBatchInferenceJobRequestOps[Self <: CreateBatchInferenceJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobInput(value: BatchInferenceJobInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobOutput(value: BatchInferenceJobOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumResults(value: NumBatchResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numResults")(js.undefined)
        ret
    }
  }
  
}

