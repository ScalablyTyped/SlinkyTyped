package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindThreatMatchesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.native
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.native
}

object FindThreatMatchesRequest {
  @scala.inline
  def apply(): FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesRequest]
  }
  @scala.inline
  implicit class FindThreatMatchesRequestOps[Self <: FindThreatMatchesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: ClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatInfo(value: ThreatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatInfo")(js.undefined)
        ret
    }
  }
  
}

