package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoMLJobResponse extends js.Object {
  /**
    * Returns the job's ARN.
    */
  var AutoMLJobArn: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  /**
    * Returns information on the job's artifacts found in AutoMLJobArtifacts.
    */
  var AutoMLJobArtifacts: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobArtifacts] = js.native
  /**
    * Returns the job's config.
    */
  var AutoMLJobConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  /**
    * Returns the name of a job.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * Returns the job's objective.
    */
  var AutoMLJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  /**
    * Returns the job's AutoMLJobSecondaryStatus.
    */
  var AutoMLJobSecondaryStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  /**
    * Returns the job's AutoMLJobStatus.
    */
  var AutoMLJobStatus: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  /**
    * Returns the job's BestCandidate.
    */
  var BestCandidate: js.UndefOr[AutoMLCandidate] = js.native
  /**
    * Returns the job's creation time.
    */
  var CreationTime: js.Date = js.native
  /**
    * Returns the job's end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Returns the job's FailureReason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  /**
    * Returns the job's output from GenerateCandidateDefinitionsOnly.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  /**
    * Returns the job's input data config.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  /**
    * Returns the job's last modified time.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * Returns the job's output data config.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  /**
    * Returns the job's problem type.
    */
  var ProblemType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProblemType] = js.native
  /**
    * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not provided by you. If you do provide them, then they'll be the same as provided.
    */
  var ResolvedAttributes: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResolvedAttributes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
}

object DescribeAutoMLJobResponse {
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: js.Date,
    InputDataConfig: AutoMLInputDataConfig,
    LastModifiedTime: js.Date,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): DescribeAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobResponse]
  }
  @scala.inline
  implicit class DescribeAutoMLJobResponseOps[Self <: DescribeAutoMLJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLJobArn(value: AutoMLJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobName(value: AutoMLJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobSecondaryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobStatus(value: AutoMLJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDataConfig(value: AutoMLInputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDataConfig(value: AutoMLOutputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoMLJobArtifacts(value: AutoMLJobArtifacts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLJobConfig(value: AutoMLJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLJobObjective(value: AutoMLJobObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withBestCandidate(value: AutoMLCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BestCandidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestCandidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BestCandidate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: AutoMLFailureReason): Self = {
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
    def withGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateCandidateDefinitionsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateCandidateDefinitionsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerateCandidateDefinitionsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withProblemType(value: ProblemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedAttributes(value: ResolvedAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvedAttributes")(js.undefined)
        ret
    }
  }
  
}

