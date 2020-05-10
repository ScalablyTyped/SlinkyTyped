package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDataproc.AnonAccesstoken
import typingsSlinky.gapiClientDataproc.AnonClusterName
import typingsSlinky.gapiClientDataproc.AnonFields
import typingsSlinky.gapiClientDataproc.AnonJobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsResource extends js.Object {
  /** Starts a job cancellation request. To access the job resource after cancellation, call regions/{region}/jobs.list or regions/{region}/jobs.get. */
  def cancel(request: AnonFields): Request_[Job] = js.native
  /** Deletes the job from the project. If the job is active, the delete fails, and the response returns FAILED_PRECONDITION. */
  def delete(request: AnonFields): Request_[js.Object] = js.native
  /** Gets the resource representation for a job in a project. */
  def get(request: AnonFields): Request_[Job] = js.native
  /** Lists regions/{region}/jobs in a project. */
  def list(request: AnonClusterName): Request_[ListJobsResponse] = js.native
  /** Updates a job in a project. */
  def patch(request: AnonJobId): Request_[Job] = js.native
  /** Submits a job to a cluster. */
  def submit(request: AnonAccesstoken): Request_[Job] = js.native
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonFields => Request_[Job],
    delete: AnonFields => Request_[js.Object],
    get: AnonFields => Request_[Job],
    list: AnonClusterName => Request_[ListJobsResponse],
    patch: AnonJobId => Request_[Job],
    submit: AnonAccesstoken => Request_[Job]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[JobsResource]
  }
  @scala.inline
  implicit class JobsResourceOps[Self <: JobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonFields => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonClusterName => Request_[ListJobsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonJobId => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: AnonAccesstoken => Request_[Job]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

