package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJob extends js.Object {
  /**
    * [Required] Describes the job configuration.
    */
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.native
  /**
    * [Output-only] A hash of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * [Output-only] Opaque ID field of the job
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Optional] Reference describing the unique-per-user name of the job.
    */
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  /**
    * [Output-only] The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output-only] A URL that can be used to access this resource again.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output-only] Information about the job, including starting time and
    * ending time of the job.
    */
  var statistics: js.UndefOr[SchemaJobStatistics] = js.native
  /**
    * [Output-only] The status of this job. Examine this value when polling an
    * asynchronous job to see if the job is complete.
    */
  var status: js.UndefOr[SchemaJobStatus] = js.native
  /**
    * [Output-only] Email address of the user who ran the job.
    */
  var user_email: js.UndefOr[String] = js.native
}

object SchemaJob {
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  @scala.inline
  implicit class SchemaJobOps[Self <: SchemaJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: SchemaJobConfiguration): Self = {
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withJobReference(value: SchemaJobReference): Self = {
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
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: SchemaJobStatistics): Self = {
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
    def withStatus(value: SchemaJobStatus): Self = {
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

