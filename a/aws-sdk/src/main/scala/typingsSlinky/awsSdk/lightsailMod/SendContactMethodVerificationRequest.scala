package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendContactMethodVerificationRequest extends js.Object {
  /**
    * The protocol to verify, such as Email or SMS (text messaging).
    */
  var protocol: ContactMethodVerificationProtocol = js.native
}

object SendContactMethodVerificationRequest {
  @scala.inline
  def apply(protocol: ContactMethodVerificationProtocol): SendContactMethodVerificationRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactMethodVerificationRequest]
  }
  @scala.inline
  implicit class SendContactMethodVerificationRequestOps[Self <: SendContactMethodVerificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocol(value: ContactMethodVerificationProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

