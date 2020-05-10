package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobResponse extends js.Object {
  /**
    * The unique identifier for the application that's associated with the export job.
    */
  var ApplicationId: string = js.native
  /**
    * The number of pieces that were processed successfully (completed) by the export job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[integer] = js.native
  /**
    * The date, in ISO 8601 format, when the export job was completed.
    */
  var CompletionDate: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the export job was created.
    */
  var CreationDate: string = js.native
  /**
    * The resource settings that apply to the export job.
    */
  var Definition: ExportJobResource = js.native
  /**
    * The number of pieces that weren't processed successfully (failed) by the export job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[integer] = js.native
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the export job, if any.
    */
  var Failures: js.UndefOr[ListOfString] = js.native
  /**
    * The unique identifier for the export job.
    */
  var Id: string = js.native
  /**
    * The status of the export job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typingsSlinky.awsSdk.pinpointMod.JobStatus = js.native
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the export job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[integer] = js.native
  /**
    * The total number of pieces that must be processed to complete the export job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the export job.
    */
  var TotalPieces: js.UndefOr[integer] = js.native
  /**
    * The total number of endpoint definitions that were processed by the export job.
    */
  var TotalProcessed: js.UndefOr[integer] = js.native
  /**
    * The job type. This value is EXPORT for export jobs.
    */
  var Type: string = js.native
}

object ExportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: string,
    CreationDate: string,
    Definition: ExportJobResource,
    Id: string,
    JobStatus: JobStatus,
    Type: string
  ): ExportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobResponse]
  }
  @scala.inline
  implicit class ExportJobResponseOps[Self <: ExportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: ExportJobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedPieces(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedPieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedPieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedPieces")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionDate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedPieces(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedPieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedPieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedPieces")(js.undefined)
        ret
    }
    @scala.inline
    def withFailures(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFailures(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPieces(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPieces")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalProcessed(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalProcessed")(js.undefined)
        ret
    }
  }
  
}

