package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonId
import typingsSlinky.gapiClientDfareporting.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersResource extends js.Object {
  /** Gets one order by ID. */
  def get(request: AnonId): Request_[Order] = js.native
  /** Retrieves a list of orders, possibly filtered. This method supports paging. */
  def list(request: AnonProjectId): Request_[OrdersListResponse] = js.native
}

object OrdersResource {
  @scala.inline
  def apply(get: AnonId => Request_[Order], list: AnonProjectId => Request_[OrdersListResponse]): OrdersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrdersResource]
  }
  @scala.inline
  implicit class OrdersResourceOps[Self <: OrdersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonId => Request_[Order]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonProjectId => Request_[OrdersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

