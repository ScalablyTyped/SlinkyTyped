package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeDSecureVerifyPayload extends js.Object {
  var description: String = js.native
  var details: ThreeDSecureAccountDetails = js.native
  var liabilityShiftPossible: Boolean = js.native
  var liabilityShifted: Boolean = js.native
  var nonce: String = js.native
}

object ThreeDSecureVerifyPayload {
  @scala.inline
  def apply(
    description: String,
    details: ThreeDSecureAccountDetails,
    liabilityShiftPossible: Boolean,
    liabilityShifted: Boolean,
    nonce: String
  ): ThreeDSecureVerifyPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeDSecureVerifyPayload]
  }
  @scala.inline
  implicit class ThreeDSecureVerifyPayloadOps[Self <: ThreeDSecureVerifyPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: ThreeDSecureAccountDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiabilityShiftPossible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liabilityShiftPossible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiabilityShifted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liabilityShifted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

