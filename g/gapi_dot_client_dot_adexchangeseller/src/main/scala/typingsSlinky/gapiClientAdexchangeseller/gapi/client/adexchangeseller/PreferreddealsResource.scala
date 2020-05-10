package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangeseller.AnonDealId
import typingsSlinky.gapiClientAdexchangeseller.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: AnonDealId): Request_[PreferredDeal] = js.native
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: AnonKey): Request_[PreferredDeals] = js.native
}

object PreferreddealsResource {
  @scala.inline
  def apply(get: AnonDealId => Request_[PreferredDeal], list: AnonKey => Request_[PreferredDeals]): PreferreddealsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PreferreddealsResource]
  }
  @scala.inline
  implicit class PreferreddealsResourceOps[Self <: PreferreddealsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonDealId => Request_[PreferredDeal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[PreferredDeals]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

