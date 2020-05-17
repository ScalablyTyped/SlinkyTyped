package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ldapdn extends GeneralNameParam {
  var ldapdn: String = js.native
}

object Ldapdn {
  @scala.inline
  def apply(ldapdn: String): Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ldapdn]
  }
  @scala.inline
  implicit class LdapdnOps[Self <: Ldapdn] (val x: Self) extends AnyVal {
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

