package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyTrustRequest extends js.Object {
  /**
    * The unique Trust ID of the trust relationship to verify.
    */
  var TrustId: typingsSlinky.awsSdk.directoryserviceMod.TrustId = js.native
}

object VerifyTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): VerifyTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTrustRequest]
  }
  @scala.inline
  implicit class VerifyTrustRequestOps[Self <: VerifyTrustRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrustId(value: TrustId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

