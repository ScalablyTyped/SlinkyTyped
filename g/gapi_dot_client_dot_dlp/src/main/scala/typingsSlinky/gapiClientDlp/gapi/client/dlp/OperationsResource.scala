package typingsSlinky.gapiClientDlp.gapi.client.dlp

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDlp.AnonAccesstoken
import typingsSlinky.gapiClientDlp.AnonAlt
import typingsSlinky.gapiClientDlp.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: AnonAlt): Request_[js.Object] = js.native
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: AnonAccesstoken): Request_[GoogleLongrunningOperation] = js.native
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAlt): Request_[GoogleLongrunningOperation] = js.native
  /** Fetches the list of long running operations. */
  def list(request: AnonBearertoken): Request_[GoogleLongrunningListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAlt => Request_[js.Object],
    create: AnonAccesstoken => Request_[GoogleLongrunningOperation],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[GoogleLongrunningOperation],
    list: AnonBearertoken => Request_[GoogleLongrunningListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[GoogleLongrunningOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[GoogleLongrunningOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[GoogleLongrunningListOperationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

