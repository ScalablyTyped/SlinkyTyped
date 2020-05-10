package typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAlexaOfferToMasterResponse extends js.Object {
  /**
    * The base64-encoded SDP answer content.
    */
  var Answer: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Answer] = js.native
}

object SendAlexaOfferToMasterResponse {
  @scala.inline
  def apply(): SendAlexaOfferToMasterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
  }
  @scala.inline
  implicit class SendAlexaOfferToMasterResponseOps[Self <: SendAlexaOfferToMasterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: Answer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Answer")(js.undefined)
        ret
    }
  }
  
}

