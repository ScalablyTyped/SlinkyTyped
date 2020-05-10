package typingsSlinky.elliptic.mod.ec

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairOptions extends js.Object {
  var priv: js.UndefOr[Buffer] = js.native
  var privEnc: js.UndefOr[String] = js.native
  var pub: js.UndefOr[Buffer] = js.native
  var pubEnc: js.UndefOr[String] = js.native
}

object KeyPairOptions {
  @scala.inline
  def apply(): KeyPairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairOptions]
  }
  @scala.inline
  implicit class KeyPairOptionsOps[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priv")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privEnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privEnc")(js.undefined)
        ret
    }
    @scala.inline
    def withPub(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(js.undefined)
        ret
    }
    @scala.inline
    def withPubEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubEnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubEnc")(js.undefined)
        ret
    }
  }
  
}

