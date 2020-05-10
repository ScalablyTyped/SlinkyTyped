package typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobResourceMod.ExportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobResponse extends js.Object {
  /**
    * The unique ID of the application associated with the export job.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The number of pieces that have successfully completed as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[Double] = js.native
  /**
    * The date the job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[String] = js.native
  /**
    * The date the job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The export job settings.
    */
  var Definition: js.UndefOr[ExportJobResource] = js.native
  /**
    * The number of pieces that failed to be processed as of the time of the request.
    */
  var FailedPieces: js.UndefOr[Double] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * The unique ID of the job.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The status of the job.
    * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    *
    * The job status is FAILED if one or more pieces failed.
    */
  var JobStatus: js.UndefOr[
    CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
  ] = js.native
  /**
    * The number of endpoints that were not processed; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[Double] = js.native
  /**
    * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
    */
  var TotalPieces: js.UndefOr[Double] = js.native
  /**
    * The number of endpoints that were processed by the job.
    */
  var TotalProcessed: js.UndefOr[Double] = js.native
  /**
    * The job type. Will be 'EXPORT'.
    */
  var Type: js.UndefOr[String] = js.native
}

object ExportJobResponse {
  @scala.inline
  def apply(): ExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJobResponse]
  }
  @scala.inline
  implicit class ExportJobResponseOps[Self <: ExportJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedPieces(value: Double): Self = {
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
    def withCompletionDate(value: String): Self = {
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
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: ExportJobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedPieces(value: Double): Self = {
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
    def withFailuresIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[String] | js.Iterable[String]): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStatus(value: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFailures(value: Double): Self = {
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
    def withTotalPieces(value: Double): Self = {
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
    def withTotalProcessed(value: Double): Self = {
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

