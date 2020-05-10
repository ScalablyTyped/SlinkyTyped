package typingsSlinky.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsSlinky.googleCloudKms.PartialOmitCryptoKeypurpo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCryptoKeyRequest extends js.Object {
  var cryptoKey: PartialOmitCryptoKeypurpo = js.native
  var cryptoKeyId: String = js.native
  var parent: String = js.native
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.native
}

object CreateCryptoKeyRequest {
  @scala.inline
  def apply(cryptoKey: PartialOmitCryptoKeypurpo, cryptoKeyId: String, parent: String): CreateCryptoKeyRequest = {
    val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCryptoKeyRequest]
  }
  @scala.inline
  implicit class CreateCryptoKeyRequestOps[Self <: CreateCryptoKeyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoKey(value: PartialOmitCryptoKeypurpo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCryptoKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipInitialVersionCreation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInitialVersionCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInitialVersionCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInitialVersionCreation")(js.undefined)
        ret
    }
  }
  
}

