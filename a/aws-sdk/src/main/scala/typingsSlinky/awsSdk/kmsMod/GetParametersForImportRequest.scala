package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersForImportRequest extends js.Object {
  /**
    * The identifier of the symmetric CMK into which you will import key material. The Origin of the CMK must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  /**
    * The algorithm you will use to encrypt the key material before importing it with ImportKeyMaterial. For more information, see Encrypt the Key Material in the AWS Key Management Service Developer Guide.
    */
  var WrappingAlgorithm: AlgorithmSpec = js.native
  /**
    * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
    */
  var WrappingKeySpec: typingsSlinky.awsSdk.kmsMod.WrappingKeySpec = js.native
}

object GetParametersForImportRequest {
  @scala.inline
  def apply(KeyId: KeyIdType, WrappingAlgorithm: AlgorithmSpec, WrappingKeySpec: WrappingKeySpec): GetParametersForImportRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersForImportRequest]
  }
  @scala.inline
  implicit class GetParametersForImportRequestOps[Self <: GetParametersForImportRequest] (val x: Self) extends AnyVal {
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
    def withWrappingAlgorithm(value: AlgorithmSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrappingAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappingKeySpec(value: WrappingKeySpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrappingKeySpec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

