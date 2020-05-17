package typingsSlinky.gapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContainer.anon.Bearertoken
import typingsSlinky.gapiClientContainer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: Callback): Request[js.Object] = js.native
  /** Gets the specified operation. */
  def get(request: Callback): Request[Operation] = js.native
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: Bearertoken): Request[ListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Callback => Request[js.Object],
    get: Callback => Request[Operation],
    list: Bearertoken => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Callback => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Callback => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListOperationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

