package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningConfiguration extends js.Object {
  /**
    * The encryption algorithm options that are available for a code signing job.
    */
  var encryptionAlgorithmOptions: EncryptionAlgorithmOptions = js.native
  /**
    * The hash algorithm options that are available for a code signing job.
    */
  var hashAlgorithmOptions: HashAlgorithmOptions = js.native
}

object SigningConfiguration {
  @scala.inline
  def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions, hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
    val __obj = js.Dynamic.literal(encryptionAlgorithmOptions = encryptionAlgorithmOptions.asInstanceOf[js.Any], hashAlgorithmOptions = hashAlgorithmOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningConfiguration]
  }
  @scala.inline
  implicit class SigningConfigurationOps[Self <: SigningConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionAlgorithmOptions(value: EncryptionAlgorithmOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithmOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlgorithmOptions(value: HashAlgorithmOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithmOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

