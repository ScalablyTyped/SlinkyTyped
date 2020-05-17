package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangeseller.anon.DealId
import typingsSlinky.gapiClientAdexchangeseller.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: DealId): Request[PreferredDeal] = js.native
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: Key): Request[PreferredDeals] = js.native
}

object PreferreddealsResource {
  @scala.inline
  def apply(get: DealId => Request[PreferredDeal], list: Key => Request[PreferredDeals]): PreferreddealsResource = {
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
    def withGet(value: DealId => Request[PreferredDeal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[PreferredDeals]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

