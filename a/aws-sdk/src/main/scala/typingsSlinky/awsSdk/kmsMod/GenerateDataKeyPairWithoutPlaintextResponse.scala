package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyPairWithoutPlaintextResponse extends js.Object {
  /**
    * Specifies the CMK that encrypted the private key in the data key pair. You must specify a symmetric CMK. You cannot use an asymmetric CMK. To get the type of your CMK, use the DescribeKey operation. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
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
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}

object GenerateDataKeyPairWithoutPlaintextResponse {
  @scala.inline
  def apply(): GenerateDataKeyPairWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextResponse]
  }
  @scala.inline
  implicit class GenerateDataKeyPairWithoutPlaintextResponseOps[Self <: GenerateDataKeyPairWithoutPlaintextResponse] (val x: Self) extends AnyVal {
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

