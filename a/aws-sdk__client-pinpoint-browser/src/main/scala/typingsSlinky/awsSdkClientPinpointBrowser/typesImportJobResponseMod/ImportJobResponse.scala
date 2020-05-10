package typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobResourceMod.ImportJobResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportJobResponse extends js.Object {
  /**
    * The unique ID of the application to which the import job applies.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The number of pieces that have successfully imported as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[Double] = js.native
  /**
    * The date the import job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[String] = js.native
  /**
    * The date the import job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The import job settings.
    */
  var Definition: js.UndefOr[ImportJobResource] = js.native
  /**
    * The number of pieces that have failed to import as of the time of the request.
    */
  var FailedPieces: js.UndefOr[Double] = js.native
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * The unique ID of the import job.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The status of the import job.
    * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
    *
    * The job status is FAILED if one or more pieces failed to import.
    */
  var JobStatus: js.UndefOr[
    CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
  ] = js.native
  /**
    * The number of endpoints that failed to import; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[Double] = js.native
  /**
    * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion of the endpoints to import.
    */
  var TotalPieces: js.UndefOr[Double] = js.native
  /**
    * The number of endpoints that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[Double] = js.native
  /**
    * The job type. Will be Import.
    */
  var Type: js.UndefOr[String] = js.native
}

object ImportJobResponse {
  @scala.inline
  def apply(): ImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobResponse]
  }
  @scala.inline
  implicit class ImportJobResponseOps[Self <: ImportJobResponse] (val x: Self) extends AnyVal {
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
    def withDefinition(value: ImportJobResource): Self = {
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

