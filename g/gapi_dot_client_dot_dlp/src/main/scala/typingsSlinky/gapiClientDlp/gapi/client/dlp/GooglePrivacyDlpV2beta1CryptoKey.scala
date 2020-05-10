package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[GooglePrivacyDlpV2beta1KmsWrappedCryptoKey] = js.native
  var transient: js.UndefOr[GooglePrivacyDlpV2beta1TransientCryptoKey] = js.native
  var unwrapped: js.UndefOr[GooglePrivacyDlpV2beta1UnwrappedCryptoKey] = js.native
}

object GooglePrivacyDlpV2beta1CryptoKey {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoKey]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CryptoKeyOps[Self <: GooglePrivacyDlpV2beta1CryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsWrapped(value: GooglePrivacyDlpV2beta1KmsWrappedCryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsWrapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsWrapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsWrapped")(js.undefined)
        ret
    }
    @scala.inline
    def withTransient(value: GooglePrivacyDlpV2beta1TransientCryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(js.undefined)
        ret
    }
    @scala.inline
    def withUnwrapped(value: GooglePrivacyDlpV2beta1UnwrappedCryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnwrapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapped")(js.undefined)
        ret
    }
  }
  
}

