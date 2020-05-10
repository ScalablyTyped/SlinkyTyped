package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationsAccessReportResponse extends js.Object {
  /**
    * An object that contains details about the most recent attempt to access the service.
    */
  var AccessDetails: js.UndefOr[typingsSlinky.awsSdk.iamMod.AccessDetails] = js.native
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.iamMod.ErrorDetails] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: js.Date = js.native
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[markerType] = js.native
  /**
    * The number of services that the applicable SCPs allow account principals to access.
    */
  var NumberOfServicesAccessible: js.UndefOr[integerType] = js.native
  /**
    * The number of services that account principals are allowed but did not attempt to access.
    */
  var NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.native
}

object GetOrganizationsAccessReportResponse {
  @scala.inline
  def apply(JobCreationDate: js.Date, JobStatus: jobStatusType): GetOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal(JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
  }
  @scala.inline
  implicit class GetOrganizationsAccessReportResponseOps[Self <: GetOrganizationsAccessReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobCreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobStatus(value: jobStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessDetails(value: AccessDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetails(value: ErrorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTruncated(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withJobCompletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobCompletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobCompletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobCompletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: markerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfServicesAccessible(value: integerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfServicesAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfServicesAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfServicesAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfServicesNotAccessed(value: integerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfServicesNotAccessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfServicesNotAccessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfServicesNotAccessed")(js.undefined)
        ret
    }
  }
  
}

