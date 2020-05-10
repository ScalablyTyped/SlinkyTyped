package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersForImportResponse extends js.Object {
  /**
    * The import token to send in a subsequent ImportKeyMaterial request.
    */
  var ImportToken: js.UndefOr[CiphertextType] = js.native
  /**
    * The identifier of the CMK to use in a subsequent ImportKeyMaterial request. This is the same CMK specified in the GetParametersForImport request.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an ImportKeyMaterial request and you must send another GetParametersForImport request to get new ones.
    */
  var ParametersValidTo: js.UndefOr[js.Date] = js.native
  /**
    * The public key to use to encrypt the key material before importing it with ImportKeyMaterial.
    */
  var PublicKey: js.UndefOr[PlaintextType] = js.native
}

object GetParametersForImportResponse {
  @scala.inline
  def apply(): GetParametersForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersForImportResponse]
  }
  @scala.inline
  implicit class GetParametersForImportResponseOps[Self <: GetParametersForImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportTokenUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportToken(value: CiphertextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportToken")(js.undefined)
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
    def withParametersValidTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametersValidTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParametersValidTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParametersValidTo")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: PlaintextType): Self = {
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

