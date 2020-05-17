package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dns extends GeneralNameParam {
  var dns: String = js.native
}

object Dns {
  @scala.inline
  def apply(dns: String): Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dns]
  }
  @scala.inline
  implicit class DnsOps[Self <: Dns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

