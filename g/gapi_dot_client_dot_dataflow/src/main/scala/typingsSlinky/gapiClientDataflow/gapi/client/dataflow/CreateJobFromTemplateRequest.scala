package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobFromTemplateRequest extends js.Object {
  /** The runtime environment for the job. */
  var environment: js.UndefOr[RuntimeEnvironment] = js.native
  /**
    * Required. A Cloud Storage path to the template from which to
    * create the job.
    * Must be a valid Cloud Storage URL, beginning with `gs://`.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /** Required. The job name to use for the created job. */
  var jobName: js.UndefOr[String] = js.native
  /** The location to which to direct the request. */
  var location: js.UndefOr[String] = js.native
  /** The runtime parameters to pass to the job. */
  var parameters: js.UndefOr[Record[String, String]] = js.native
}

object CreateJobFromTemplateRequest {
  @scala.inline
  def apply(): CreateJobFromTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobFromTemplateRequest]
  }
  @scala.inline
  implicit class CreateJobFromTemplateRequestOps[Self <: CreateJobFromTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: RuntimeEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withGcsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

