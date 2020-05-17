package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rfc822 extends GeneralNameParam {
  var rfc822: String = js.native
}

object Rfc822 {
  @scala.inline
  def apply(rfc822: String): Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rfc822]
  }
  @scala.inline
  implicit class Rfc822Ops[Self <: Rfc822] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRfc822(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rfc822")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

