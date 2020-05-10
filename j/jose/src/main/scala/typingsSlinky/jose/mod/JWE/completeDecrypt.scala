package typingsSlinky.jose.mod.JWE

import typingsSlinky.jose.mod.JWK.Key
import typingsSlinky.jose.mod.JWK.OctKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait completeDecrypt extends js.Object {
  var aad: js.UndefOr[String] = js.native
  var cek: OctKey = js.native
  var cleartext: Buffer = js.native
  var header: js.UndefOr[js.Object] = js.native
  var key: Key = js.native
  var `protected`: js.UndefOr[js.Object] = js.native
  var unprotected: js.UndefOr[js.Object] = js.native
}

object completeDecrypt {
  @scala.inline
  def apply(cek: OctKey, cleartext: Buffer, key: Key): completeDecrypt = {
    val __obj = js.Dynamic.literal(cek = cek.asInstanceOf[js.Any], cleartext = cleartext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeDecrypt]
  }
  @scala.inline
  implicit class completeDecryptOps[Self <: completeDecrypt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCek(value: OctKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCleartext(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aad")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withProtected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprotected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprotected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprotected")(js.undefined)
        ret
    }
  }
  
}

