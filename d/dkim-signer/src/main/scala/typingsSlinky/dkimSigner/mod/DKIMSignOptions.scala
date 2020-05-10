package typingsSlinky.dkimSigner.mod

import typingsSlinky.node.cryptoMod.KeyLike
import typingsSlinky.node.cryptoMod.SignPrivateKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DKIMSignOptions extends js.Object {
  /** Domain name to use for signing (ie: 'domain.com') */
  var domainName: String = js.native
  /** Header fields to sign (ie: 'from:to:cc:subject') */
  var headerFieldNames: js.UndefOr[String] = js.native
  /** Selector for the DKMI public key (ie. 'dkim' if you have set up a TXT record for 'dkim._domainkey.domain.com') */
  var keySelector: String = js.native
  /** DKIM private key */
  var privateKey: SignPrivateKeyInput | KeyLike = js.native
}

object DKIMSignOptions {
  @scala.inline
  def apply(domainName: String, keySelector: String, privateKey: SignPrivateKeyInput | KeyLike): DKIMSignOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKIMSignOptions]
  }
  @scala.inline
  implicit class DKIMSignOptionsOps[Self <: DKIMSignOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKey(value: SignPrivateKeyInput | KeyLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderFieldNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFieldNames")(js.undefined)
        ret
    }
  }
  
}

