package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonCreativeId
import typingsSlinky.gapiClientAdexchangebuyer2.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: AnonCreativeId): Request_[js.Object] = js.native
  /** List all creative-deal associations. */
  def list(request: AnonKey): Request_[ListDealAssociationsResponse] = js.native
  /** Remove the association between a deal and a creative. */
  def remove(request: AnonCreativeId): Request_[js.Object] = js.native
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: AnonCreativeId => Request_[js.Object],
    list: AnonKey => Request_[ListDealAssociationsResponse],
    remove: AnonCreativeId => Request_[js.Object]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[DealAssociationsResource]
  }
  @scala.inline
  implicit class DealAssociationsResourceOps[Self <: DealAssociationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: AnonCreativeId => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListDealAssociationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: AnonCreativeId => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

