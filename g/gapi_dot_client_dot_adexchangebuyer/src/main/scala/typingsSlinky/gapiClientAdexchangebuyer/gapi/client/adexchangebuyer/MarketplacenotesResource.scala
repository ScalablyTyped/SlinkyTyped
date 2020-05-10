package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsSlinky.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderNotesResponse] = js.native
  /** Get all the notes associated with a proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderNotesResponse] = js.native
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: AnonOauthtoken => Request_[AddOrderNotesResponse],
    list: AnonPqlQuery => Request_[GetOrderNotesResponse]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MarketplacenotesResource]
  }
  @scala.inline
  implicit class MarketplacenotesResourceOps[Self <: MarketplacenotesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[AddOrderNotesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPqlQuery => Request_[GetOrderNotesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

