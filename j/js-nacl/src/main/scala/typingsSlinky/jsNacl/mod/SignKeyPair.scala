package typingsSlinky.jsNacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignKeyPair extends js.Object {
  var signPk: js.typedarray.Uint8Array = js.native
  var signSk: js.typedarray.Uint8Array = js.native
}

object SignKeyPair {
  @scala.inline
  def apply(signPk: js.typedarray.Uint8Array, signSk: js.typedarray.Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(signPk = signPk.asInstanceOf[js.Any], signSk = signSk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignKeyPair]
  }
  @scala.inline
  implicit class SignKeyPairOps[Self <: SignKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignPk(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signPk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignSk(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signSk")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

