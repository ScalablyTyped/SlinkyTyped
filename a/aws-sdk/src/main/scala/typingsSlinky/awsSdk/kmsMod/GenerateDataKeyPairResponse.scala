package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyPairResponse extends js.Object {
  /**
    * The identifier of the CMK that encrypted the private key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.native
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The plaintext copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyPlaintext: js.UndefOr[PlaintextType] = js.native
  /**
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}

object GenerateDataKeyPairResponse {
  @scala.inline
  def apply(): GenerateDataKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairResponse]
  }
  @scala.inline
  implicit class GenerateDataKeyPairResponseOps[Self <: GenerateDataKeyPairResponse] (val x: Self) extends AnyVal {
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
    def withKeyPairSpec(value: DataKeyPairSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyCiphertextBlobUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyCiphertextBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyCiphertextBlob(value: CiphertextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyCiphertextBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyCiphertextBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyCiphertextBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeyPlaintextUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyPlaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyPlaintext(value: PlaintextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyPlaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeyPlaintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateKeyPlaintext")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: PublicKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(js.undefined)
        ret
    }
  }
  
}

