package typingsSlinky.gapiClientBigquery

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.ErrorProto
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JobConfiguration
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JobReference
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JobStatistics
import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfiguration extends js.Object {
  /** [Full-projection-only] Specifies the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.native
  /** A result object that will be present only if the job has failed. */
  var errorResult: js.UndefOr[ErrorProto] = js.native
  /** Unique opaque ID of the job. */
  var id: js.UndefOr[String] = js.native
  /** Job reference uniquely identifying the job. */
  var jobReference: js.UndefOr[JobReference] = js.native
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  /** Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed. */
  var state: js.UndefOr[String] = js.native
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.native
  /** [Full-projection-only] Describes the state of the job. */
  var status: js.UndefOr[JobStatus] = js.native
  /** [Full-projection-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.native
}

object AnonConfiguration {
  @scala.inline
  def apply(): AnonConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConfiguration]
  }
  @scala.inline
  implicit class AnonConfigurationOps[Self <: AnonConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: JobConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorResult(value: ErrorProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorResult")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withJobReference(value: JobReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobReference")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: JobStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_email")(js.undefined)
        ret
    }
  }
  
}

