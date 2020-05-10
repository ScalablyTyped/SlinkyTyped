package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLdapdn extends GeneralNameParam {
  var ldapdn: String = js.native
}

object AnonLdapdn {
  @scala.inline
  def apply(ldapdn: String): AnonLdapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLdapdn]
  }
  @scala.inline
  implicit class AnonLdapdnOps[Self <: AnonLdapdn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLdapdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ldapdn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

