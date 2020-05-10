package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * A unique name for the key pair.
    */
  var KeyName: String = js.native
  /**
    * The public key. For API calls, the text must be base64-encoded. For command line tools, base64 encoding is performed for you.
    */
  var PublicKeyMaterial: _Blob = js.native
}

object ImportKeyPairRequest {
  @scala.inline
  def apply(KeyName: String, PublicKeyMaterial: _Blob): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], PublicKeyMaterial = PublicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
  @scala.inline
  implicit class ImportKeyPairRequestOps[Self <: ImportKeyPairRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyMaterialUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyMaterial(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

