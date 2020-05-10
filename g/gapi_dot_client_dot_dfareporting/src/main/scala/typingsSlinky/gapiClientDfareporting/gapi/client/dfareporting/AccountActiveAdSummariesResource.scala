package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: AnonAlt): Request_[AccountActiveAdSummary] = js.native
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[AccountActiveAdSummary]): AccountActiveAdSummariesResource = {
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
    def withGet(value: AnonAlt => Request_[AccountActiveAdSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

