package typingsSlinky.gun.mod.Gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'pub' | 'priv' | 'epub' | 'epriv', string> */
@js.native
trait CryptoKeyPair extends js.Object {
  var epriv: String = js.native
  var epub: String = js.native
  var priv: String = js.native
  var pub: String = js.native
}

object CryptoKeyPair {
  @scala.inline
  def apply(epriv: String, epub: String, priv: String, pub: String): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(epriv = epriv.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], priv = priv.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
  @scala.inline
  implicit class CryptoKeyPairOps[Self <: CryptoKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpriv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epriv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

