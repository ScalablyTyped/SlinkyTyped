package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a data encryption key (DEK) (as opposed to a key encryption key
  * (KEK) stored by KMS). When using KMS to wrap/unwrap DEKs, be sure to set an
  * appropriate IAM policy on the KMS CryptoKey (KEK) to ensure an attacker
  * cannot unwrap the data crypto key.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CryptoKey extends js.Object {
  var kmsWrapped: js.UndefOr[SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey] = js.native
  var transient: js.UndefOr[SchemaGooglePrivacyDlpV2TransientCryptoKey] = js.native
  var unwrapped: js.UndefOr[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey] = js.native
}

object SchemaGooglePrivacyDlpV2CryptoKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CryptoKeyOps[Self <: SchemaGooglePrivacyDlpV2CryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsWrapped(value: SchemaGooglePrivacyDlpV2KmsWrappedCryptoKey): Self = {
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
    def withTransient(value: SchemaGooglePrivacyDlpV2TransientCryptoKey): Self = {
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
    def withUnwrapped(value: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey): Self = {
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

