package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResponse extends js.Object {
  /**
    * The unique identifier for the asymmetric CMK that was used to verify the signature.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * A Boolean value that indicates whether the signature was verified. A value of True indicates that the Signature was produced by signing the Message with the specified KeyID and SigningAlgorithm. If the signature is not verified, the Verify operation fails with a KMSInvalidSignatureException exception. 
    */
  var SignatureValid: js.UndefOr[BooleanType] = js.native
  /**
    * The signing algorithm that was used to verify the signature.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.native
}

object VerifyResponse {
  @scala.inline
  def apply(): VerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyResponse]
  }
  @scala.inline
  implicit class VerifyResponseOps[Self <: VerifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureValid(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureValid")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningAlgorithm(value: SigningAlgorithmSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithm")(js.undefined)
        ret
    }
  }
  
}

