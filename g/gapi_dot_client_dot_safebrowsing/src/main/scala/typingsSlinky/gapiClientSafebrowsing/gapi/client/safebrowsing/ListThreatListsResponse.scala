package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThreatListsResponse extends js.Object {
  /** The lists available for download by the client. */
  var threatLists: js.UndefOr[js.Array[ThreatListDescriptor]] = js.native
}

object ListThreatListsResponse {
  @scala.inline
  def apply(): ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreatListsResponse]
  }
  @scala.inline
  implicit class ListThreatListsResponseOps[Self <: ListThreatListsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreatLists(value: js.Array[ThreatListDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatLists")(js.undefined)
        ret
    }
  }
  
}

