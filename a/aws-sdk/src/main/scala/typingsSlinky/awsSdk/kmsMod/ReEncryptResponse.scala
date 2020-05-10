package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReEncryptResponse extends js.Object {
  /**
    * The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The encryption algorithm that was used to reencrypt the data.
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * Unique identifier of the CMK used to reencrypt the data.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The encryption algorithm that was used to decrypt the ciphertext before it was reencrypted.
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * Unique identifier of the CMK used to originally encrypt the data.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.native
}

object ReEncryptResponse {
  @scala.inline
  def apply(): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReEncryptResponse]
  }
  @scala.inline
  implicit class ReEncryptResponseOps[Self <: ReEncryptResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCiphertextBlobUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CiphertextBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCiphertextBlob(value: CiphertextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CiphertextBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCiphertextBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CiphertextBlob")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationEncryptionAlgorithm")(js.undefined)
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
    def withSourceEncryptionAlgorithm(value: EncryptionAlgorithmSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEncryptionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceKeyId")(js.undefined)
        ret
    }
  }
  
}

