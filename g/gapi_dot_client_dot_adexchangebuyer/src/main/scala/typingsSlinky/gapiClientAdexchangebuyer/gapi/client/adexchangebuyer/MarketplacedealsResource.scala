package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.Oauthtoken
import typingsSlinky.gapiClientAdexchangebuyer.anon.PqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: Oauthtoken): Request[DeleteOrderDealsResponse] = js.native
  /** Add new deals for the specified proposal */
  def insert(request: Oauthtoken): Request[AddOrderDealsResponse] = js.native
  /** List all the deals for a given proposal */
  def list(request: PqlQuery): Request[GetOrderDealsResponse] = js.native
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: Oauthtoken): Request[EditAllOrderDealsResponse] = js.native
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[DeleteOrderDealsResponse],
    insert: Oauthtoken => Request[AddOrderDealsResponse],
    list: PqlQuery => Request[GetOrderDealsResponse],
    update: Oauthtoken => Request[EditAllOrderDealsResponse]
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
    def withDelete(value: Oauthtoken => Request[DeleteOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Oauthtoken => Request[AddOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PqlQuery => Request[GetOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Oauthtoken => Request[EditAllOrderDealsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

