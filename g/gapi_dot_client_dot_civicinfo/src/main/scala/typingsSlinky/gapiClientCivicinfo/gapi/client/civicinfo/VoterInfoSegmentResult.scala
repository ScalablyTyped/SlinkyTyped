package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[PostalAddress] = js.native
  var request: js.UndefOr[VoterInfoRequest] = js.native
  var response: js.UndefOr[VoterInfoResponse] = js.native
}

object VoterInfoSegmentResult {
  @scala.inline
  def apply(): VoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoterInfoSegmentResult]
  }
  @scala.inline
  implicit class VoterInfoSegmentResultOps[Self <: VoterInfoSegmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneratedMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalAddress(value: PostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: VoterInfoRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: VoterInfoResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
  }
  
}

