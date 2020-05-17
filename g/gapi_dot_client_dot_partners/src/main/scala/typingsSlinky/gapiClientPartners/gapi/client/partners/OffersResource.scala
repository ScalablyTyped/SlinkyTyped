package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPartners.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffersResource extends js.Object {
  var history: HistoryResource = js.native
  /** Lists the Offers available for the current user */
  def list(request: Fields): Request[ListOffersResponse] = js.native
}

object OffersResource {
  @scala.inline
  def apply(history: HistoryResource, list: Fields => Request[ListOffersResponse]): OffersResource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OffersResource]
  }
  @scala.inline
  implicit class OffersResourceOps[Self <: OffersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHistory(value: HistoryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ListOffersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

