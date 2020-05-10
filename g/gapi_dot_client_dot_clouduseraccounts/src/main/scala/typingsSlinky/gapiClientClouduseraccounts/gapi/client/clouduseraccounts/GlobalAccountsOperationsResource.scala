package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouduseraccounts.AnonAlt
import typingsSlinky.gapiClientClouduseraccounts.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalAccountsOperationsResource extends js.Object {
  /** Deletes the specified operation resource. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Retrieves the specified operation resource. */
  def get(request: AnonAlt): Request_[Operation] = js.native
  /** Retrieves the list of operation resources contained within the specified project. */
  def list(request: AnonFields): Request_[OperationList] = js.native
}

object GlobalAccountsOperationsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[Operation],
    list: AnonFields => Request_[OperationList]
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
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

