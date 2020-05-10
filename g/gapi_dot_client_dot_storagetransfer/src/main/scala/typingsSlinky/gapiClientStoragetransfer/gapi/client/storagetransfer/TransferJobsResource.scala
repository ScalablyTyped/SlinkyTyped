package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientStoragetransfer.AnonAlt
import typingsSlinky.gapiClientStoragetransfer.AnonBearertoken
import typingsSlinky.gapiClientStoragetransfer.AnonCallback
import typingsSlinky.gapiClientStoragetransfer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: AnonAlt): Request_[TransferJob] = js.native
  /** Gets a transfer job. */
  def get(request: AnonBearertoken): Request_[TransferJob] = js.native
  /** Lists transfer jobs. */
  def list(request: AnonCallback): Request_[ListTransferJobsResponse] = js.native
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: AnonFields): Request_[TransferJob] = js.native
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[TransferJob],
    get: AnonBearertoken => Request_[TransferJob],
    list: AnonCallback => Request_[ListTransferJobsResponse],
    patch: AnonFields => Request_[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TransferJobsResource]
  }
  @scala.inline
  implicit class TransferJobsResourceOps[Self <: TransferJobsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[TransferJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[TransferJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListTransferJobsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[TransferJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

