package typingsSlinky.nodeJose

import typingsSlinky.nodeJose.mod.JWK.KeyUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-jose.node-jose.JWK.KeyStoreGetOptions> */
@js.native
trait PartialKeyStoreGetOptions extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var kid: js.UndefOr[String] = js.native
  var kty: js.UndefOr[String] = js.native
  var use: js.UndefOr[KeyUse] = js.native
}

object PartialKeyStoreGetOptions {
  @scala.inline
  def apply(): PartialKeyStoreGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKeyStoreGetOptions]
  }
  @scala.inline
  implicit class PartialKeyStoreGetOptionsOps[Self <: PartialKeyStoreGetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withKid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kid")(js.undefined)
        ret
    }
    @scala.inline
    def withKty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: KeyUse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

