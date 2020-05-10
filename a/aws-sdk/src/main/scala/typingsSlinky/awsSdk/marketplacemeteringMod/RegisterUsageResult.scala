package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUsageResult extends js.Object {
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.native
}

object RegisterUsageResult {
  @scala.inline
  def apply(): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUsageResult]
  }
  @scala.inline
  implicit class RegisterUsageResultOps[Self <: RegisterUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeyRotationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyRotationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyRotationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyRotationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(js.undefined)
        ret
    }
  }
  
}

