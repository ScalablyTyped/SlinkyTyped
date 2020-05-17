package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouduseraccounts.anon.Alt
import typingsSlinky.gapiClientClouduseraccounts.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Retrieves the specified operation resource. */
  def get(request: Alt): Request[Operation] = js.native
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: Fields): Request[OperationList] = js.native
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Operation],
    list: Fields => Request[OperationList]
  ): GlobalAccountsOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalAccountsOperationsResource]
  }
  @scala.inline
  implicit class GlobalAccountsOperationsResourceOps[Self <: GlobalAccountsOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

