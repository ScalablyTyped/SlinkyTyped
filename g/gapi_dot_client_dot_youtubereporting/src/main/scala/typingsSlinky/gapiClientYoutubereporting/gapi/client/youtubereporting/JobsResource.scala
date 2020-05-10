package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutubereporting.AnonBearertoken
import typingsSlinky.gapiClientYoutubereporting.AnonCallback
import typingsSlinky.gapiClientYoutubereporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  var reports: ReportsResource = js.native
  /** Creates a job and returns it. */
  def create(request: AnonBearertoken): Request_[Job] = js.native
  /** Deletes a job. */
  def delete(request: AnonCallback): Request_[js.Object] = js.native
  /** Gets a job. */
  def get(request: AnonCallback): Request_[Job] = js.native
  /** Lists jobs. */
  def list(request: AnonFields): Request_[ListJobsResponse] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Job],
    delete: AnonCallback => Request_[js.Object],
    get: AnonCallback => Request_[Job],
    list: AnonFields => Request_[ListJobsResponse],
    reports: ReportsResource
  ): JobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), reports = reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonCallback => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCallback => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ListJobsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReports(value: ReportsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

