package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatListsResource extends js.Object {
  /** Lists the Safe Browsing threat lists available for download. */
  def list(request: Alt): Request[ListThreatListsResponse] = js.native
}

object ThreatListsResource {
  @scala.inline
  def apply(list: Alt => Request[ListThreatListsResponse]): ThreatListsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ThreatListsResource]
  }
  @scala.inline
  implicit class ThreatListsResourceOps[Self <: ThreatListsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Alt => Request[ListThreatListsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

