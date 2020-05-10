package typingsSlinky.hdkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXpriv extends js.Object {
  var xpriv: String = js.native
  var xpub: String = js.native
}

object AnonXpriv {
  @scala.inline
  def apply(xpriv: String, xpub: String): AnonXpriv = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXpriv]
  }
  @scala.inline
  implicit class AnonXprivOps[Self <: AnonXpriv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXpriv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpriv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

