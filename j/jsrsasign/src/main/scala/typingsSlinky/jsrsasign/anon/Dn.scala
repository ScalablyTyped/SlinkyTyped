package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dn extends GeneralNameParam {
  var dn: String = js.native
}

object Dn {
  @scala.inline
  def apply(dn: String): Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dn]
  }
  @scala.inline
  implicit class DnOps[Self <: Dn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

