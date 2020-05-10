package typingsSlinky.parseDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedDomain extends js.Object {
  var domain: String = js.native
  var subdomain: String = js.native
  var tld: String = js.native
}

object ParsedDomain {
  @scala.inline
  def apply(domain: String, subdomain: String, tld: String): ParsedDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDomain]
  }
  @scala.inline
  implicit class ParsedDomainOps[Self <: ParsedDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTld(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tld")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

