package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonApproved
import typingsSlinky.gapiClientDfareporting.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderDocumentsResource extends js.Object {
  /** Gets one order document by ID. */
  def get(request: AnonId): Request_[OrderDocument] = js.native
  /** Retrieves a list of order documents, possibly filtered. This method supports paging. */
  def list(request: AnonApproved): Request_[OrderDocumentsListResponse] = js.native
}

object OrderDocumentsResource {
  @scala.inline
  def apply(get: AnonId => Request_[OrderDocument], list: AnonApproved => Request_[OrderDocumentsListResponse]): OrderDocumentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OrderDocumentsResource]
  }
  @scala.inline
  implicit class OrderDocumentsResourceOps[Self <: OrderDocumentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonId => Request_[OrderDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonApproved => Request_[OrderDocumentsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

