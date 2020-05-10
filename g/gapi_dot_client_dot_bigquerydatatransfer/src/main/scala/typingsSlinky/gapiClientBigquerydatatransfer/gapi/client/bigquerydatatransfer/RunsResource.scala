package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsSlinky.gapiClientBigquerydatatransfer.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource = js.native
  /** Deletes the specified transfer run. */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Returns information about the particular transfer run. */
  def get(request: AnonAccesstoken): Request_[TransferRun] = js.native
  /** Returns information about running and completed jobs. */
  def list(request: AnonCallback): Request_[ListTransferRunsResponse] = js.native
}

object RunsResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[TransferRun],
    list: AnonCallback => Request_[ListTransferRunsResponse],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferLogs = transferLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunsResource]
  }
  @scala.inline
  implicit class RunsResourceOps[Self <: RunsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[TransferRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListTransferRunsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransferLogs(value: TransferLogsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferLogs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

