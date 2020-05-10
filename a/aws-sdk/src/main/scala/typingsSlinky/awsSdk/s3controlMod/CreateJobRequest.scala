package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  /**
    * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.
    */
  var ClientRequestToken: NonEmptyMaxLength64String = js.native
  /**
    * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typingsSlinky.awsSdk.s3controlMod.ConfirmationRequired] = js.native
  /**
    * A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  /**
    * Configuration parameters for the manifest.
    */
  var Manifest: JobManifest = js.native
  /**
    * The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see Available Operations in the Amazon Simple Storage Service Developer Guide.
    */
  var Operation: JobOperation = js.native
  /**
    * The numerical priority for this job. Higher numbers indicate higher priority.
    */
  var Priority: JobPriority = js.native
  /**
    * Configuration parameters for the optional job-completion report.
    */
  var Report: JobReport = js.native
  /**
    * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use to execute this job's operation on each object in the manifest.
    */
  var RoleArn: IAMRoleArn = js.native
  /**
    * An optional set of tags to associate with the job when it is created.
    */
  var Tags: js.UndefOr[S3TagSet] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    ClientRequestToken: NonEmptyMaxLength64String,
    Manifest: JobManifest,
    Operation: JobOperation,
    Priority: JobPriority,
    Report: JobReport,
    RoleArn: IAMRoleArn
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: NonEmptyMaxLength64String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: JobManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: JobOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: JobPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: JobReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmationRequired(value: ConfirmationRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmationRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfirmationRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyMaxLength256String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: S3TagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

