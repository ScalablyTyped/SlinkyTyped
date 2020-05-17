package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: Alt): Request[AccountActiveAdSummary] = js.native
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(get: Alt => Request[AccountActiveAdSummary]): AccountActiveAdSummariesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AccountActiveAdSummariesResource]
  }
  @scala.inline
  implicit class AccountActiveAdSummariesResourceOps[Self <: AccountActiveAdSummariesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[AccountActiveAdSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

