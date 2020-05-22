package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquerydatatransfer.anon.Accesstoken
import typingsSlinky.gapiClientBigquerydatatransfer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource
  /** Deletes the specified transfer run. */
  def delete(request: Accesstoken): Request[js.Object]
  /** Returns information about the particular transfer run. */
  def get(request: Accesstoken): Request[TransferRun]
  /** Returns information about running and completed jobs. */
  def list(request: Callback): Request[ListTransferRunsResponse]
}

object RunsResource {
  @scala.inline
  def apply(
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[TransferRun],
    list: Callback => Request[ListTransferRunsResponse],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferLogs = transferLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunsResource]
  }
}

