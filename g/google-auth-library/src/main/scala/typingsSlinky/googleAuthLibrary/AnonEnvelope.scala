package typingsSlinky.googleAuthLibrary

import typingsSlinky.googleAuthLibrary.loginticketMod.TokenPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnvelope extends js.Object {
  var envelope: js.UndefOr[String] = js.native
  var payload: js.UndefOr[TokenPayload] = js.native
}

object AnonEnvelope {
  @scala.inline
  def apply(): AnonEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnvelope]
  }
  @scala.inline
  implicit class AnonEnvelopeOps[Self <: AnonEnvelope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvelope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvelope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: TokenPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

