package typingsSlinky.easyXHeaders.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurePair extends js.Object {
  var cleartext: js.Any = js.native
  var encrypted: js.Any = js.native
}

object SecurePair {
  @scala.inline
  def apply(cleartext: js.Any, encrypted: js.Any): SecurePair = {
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurePair]
  }
  @scala.inline
  implicit class SecurePairOps[Self <: SecurePair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleartext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

