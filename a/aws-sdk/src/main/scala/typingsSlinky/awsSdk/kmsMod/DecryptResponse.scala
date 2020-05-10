package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResponse extends js.Object {
  /**
    * The encryption algorithm that was used to decrypt the ciphertext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * The ARN of the customer master key that was used to perform the decryption.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}

object DecryptResponse {
  @scala.inline
  def apply(): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptResponse]
  }
  @scala.inline
  implicit class DecryptResponseOps[Self <: DecryptResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAlgorithm")(js.undefined)
        ret
    }
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
    def withPlaintextUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaintext(value: PlaintextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Plaintext")(js.undefined)
        ret
    }
  }
  
}

