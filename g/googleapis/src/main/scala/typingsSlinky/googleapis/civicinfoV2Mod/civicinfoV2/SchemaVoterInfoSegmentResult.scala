package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.native
  var request: js.UndefOr[SchemaVoterInfoRequest] = js.native
  var response: js.UndefOr[SchemaVoterInfoResponse] = js.native
}

object SchemaVoterInfoSegmentResult {
  @scala.inline
  def apply(): SchemaVoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoSegmentResult]
  }
  @scala.inline
  implicit class SchemaVoterInfoSegmentResultOps[Self <: SchemaVoterInfoSegmentResult] (val x: Self) extends AnyVal {
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
    def withPostalAddress(value: SchemaPostalAddress): Self = {
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
    def withRequest(value: SchemaVoterInfoRequest): Self = {
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
    def withResponse(value: SchemaVoterInfoResponse): Self = {
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

