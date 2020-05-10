package typingsSlinky.nodeRsa.mod

import typingsSlinky.nodeRsa.nodeRsaStrings.browser
import typingsSlinky.nodeRsa.nodeRsaStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Padding scheme for encrypt/decrypt. Default is 'pkcs1_oaep'.
    */
  var encryptionScheme: js.UndefOr[EncryptionScheme | AdvancedEncryptionScheme] = js.native
  /**
    * Working environment. (auto detects by default)
    */
  var environment: js.UndefOr[browser | node] = js.native
  /**
    * scheme used for signing and verifying.. Default 'pkcs1-sha256', or, if chosen pss: 'pss-sha1'.
    */
  var signingScheme: js.UndefOr[SigningScheme | SigningSchemeHash | AdvancedSigningScheme] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionScheme(value: EncryptionScheme | AdvancedEncryptionScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: browser | node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningScheme(value: SigningScheme | SigningSchemeHash | AdvancedSigningScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingScheme")(js.undefined)
        ret
    }
  }
  
}

