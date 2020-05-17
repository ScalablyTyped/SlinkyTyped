package typingsSlinky.eccrypto.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EphemPrivateKey extends js.Object {
  var ephemPrivateKey: js.UndefOr[Buffer] = js.native
  var iv: js.UndefOr[Buffer] = js.native
}

object EphemPrivateKey {
  @scala.inline
  def apply(): EphemPrivateKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemPrivateKey]
  }
  @scala.inline
  implicit class EphemPrivateKeyOps[Self <: EphemPrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEphemPrivateKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemPrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemPrivateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
  }
  
}

