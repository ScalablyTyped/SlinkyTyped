package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStoragetransfer.anon.Filter
import typingsSlinky.gapiClientStoragetransfer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: Key): Request[js.Object] = js.native
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: Key): Request[js.Object] = js.native
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Key): Request[Operation] = js.native
  /**
    * Lists operations that match the specified filter in the request. If the
    * server doesn't support this method, it returns `UNIMPLEMENTED`.
    *
    * NOTE: the `name` binding allows API services to override the binding
    * to use different resource name schemes, such as `users/&#42;/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/&#42;}/operations"` to their service configuration.
    * For backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding
    * is the parent resource, without the operations collection id.
    */
  def list(request: Filter): Request[ListOperationsResponse] = js.native
  /** Pauses a transfer operation. */
  def pause(request: Key): Request[js.Object] = js.native
  /** Resumes a transfer operation that is paused. */
  def resume(request: Key): Request[js.Object] = js.native
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: Key => Request[js.Object],
    delete: Key => Request[js.Object],
    get: Key => Request[Operation],
    list: Filter => Request[ListOperationsResponse],
    pause: Key => Request[js.Object],
    resume: Key => Request[js.Object]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume))
    __obj.asInstanceOf[TransferOperationsResource]
  }
  @scala.inline
  implicit class TransferOperationsResourceOps[Self <: TransferOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Key => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Key => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[ListOperationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPause(value: Key => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResume(value: Key => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

