package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDataflow.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsResource extends js.Object {
  var jobs: JobsResource = js.native
  var templates: TemplatesResource = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: QuotaUser): Request[SendWorkerMessagesResponse] = js.native
}

object LocationsResource {
  @scala.inline
  def apply(
    jobs: JobsResource,
    templates: TemplatesResource,
    workerMessages: QuotaUser => Request[SendWorkerMessagesResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], workerMessages = js.Any.fromFunction1(workerMessages))
    __obj.asInstanceOf[LocationsResource]
  }
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobs(value: JobsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplates(value: TemplatesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerMessages(value: QuotaUser => Request[SendWorkerMessagesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerMessages")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

