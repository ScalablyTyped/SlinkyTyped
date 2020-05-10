package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsSlinky.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: AnonOauthtoken): Request_[DeleteOrderDealsResponse] = js.native
  /** Add new deals for the specified proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderDealsResponse] = js.native
  /** List all the deals for a given proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderDealsResponse] = js.native
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: AnonOauthtoken): Request_[EditAllOrderDealsResponse] = js.native
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[DeleteOrderDealsResponse],
    insert: AnonOauthtoken => Request_[AddOrderDealsResponse],
    list: AnonPqlQuery => Request_[GetOrderDealsResponse],
    update: AnonOauthtoken => Request_[EditAllOrderDealsResponse]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MarketplacedealsResource]
  }
  @scala.inline
  implicit class MarketplacedealsResourceOps[Self <: MarketplacedealsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[DeleteOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonOauthtoken => Request_[AddOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPqlQuery => Request_[GetOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[EditAllOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

