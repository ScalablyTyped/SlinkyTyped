package typingsSlinky.gapiClientCloudfunctions.gapi.client.cloudfunctions

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudfunctions.anon.Accesstoken
import typingsSlinky.gapiClientCloudfunctions.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Accesstoken): Request[Operation] = js.native
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
  def list(request: Alt): Request[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Operation], list: Alt => Request[ListOperationsResponse]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ListOperationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

