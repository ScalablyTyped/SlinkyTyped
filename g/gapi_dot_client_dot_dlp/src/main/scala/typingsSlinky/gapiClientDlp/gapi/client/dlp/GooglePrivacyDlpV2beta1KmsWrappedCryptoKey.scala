package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KmsWrappedCryptoKey extends js.Object {
  /** The resource name of the KMS CryptoKey to use for unwrapping. [required] */
  var cryptoKeyName: js.UndefOr[String] = js.native
  /** The wrapped data crypto key. [required] */
  var wrappedKey: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1KmsWrappedCryptoKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KmsWrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KmsWrappedCryptoKeyOps[Self <: GooglePrivacyDlpV2beta1KmsWrappedCryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedKey")(js.undefined)
        ret
    }
  }
  
}

