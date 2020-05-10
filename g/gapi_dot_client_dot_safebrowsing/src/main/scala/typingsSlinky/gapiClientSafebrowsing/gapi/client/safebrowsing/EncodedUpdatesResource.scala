package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSafebrowsing.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodedUpdatesResource extends js.Object {
  def get(request: AnonAccesstoken): Request_[FetchThreatListUpdatesResponse] = js.native
}

object EncodedUpdatesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[FetchThreatListUpdatesResponse]): EncodedUpdatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[EncodedUpdatesResource]
  }
  @scala.inline
  implicit class EncodedUpdatesResourceOps[Self <: EncodedUpdatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[FetchThreatListUpdatesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

