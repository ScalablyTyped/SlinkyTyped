package typingsSlinky.elliptic.mod.eddsa

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairOptions extends js.Object {
  var pub: Buffer | Point = js.native
  var secret: Buffer = js.native
}

object KeyPairOptions {
  @scala.inline
  def apply(pub: Buffer | Point, secret: Buffer): KeyPairOptions = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairOptions]
  }
  @scala.inline
  implicit class KeyPairOptionsOps[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPub(value: Buffer | Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

