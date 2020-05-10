package typingsSlinky.gapiClientRuntimeconfig.gapi.client.runtimeconfig

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientRuntimeconfig.AnonAccesstoken
import typingsSlinky.gapiClientRuntimeconfig.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation.  The server
    * makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
    * Operations.GetOperation or
    * other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with
    * an Operation.error value with a google.rpc.Status.code of 1,
    * corresponding to `Code.CANCELLED`.
    */
  def cancel(request: AnonAccesstoken): Request_[js.Object] = js.native
  /**
    * Deletes a long-running operation. This method indicates that the client is
    * no longer interested in the operation result. It does not cancel the
    * operation. If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(request: AnonAccesstoken): Request_[js.Object] = js.native
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
  def list(request: AnonAlt): Request_[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstoken => Request_[js.Object],
    delete: AnonAccesstoken => Request_[js.Object],
    list: AnonAlt => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListOperationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

