package typingsSlinky.ntlmClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDNS extends js.Object {
  var DNS: String = js.native
  var DOMAIN: String = js.native
  var FQDN: String = js.native
  var PARENT_DNS: String = js.native
  var SERVER: String = js.native
}

object AnonDNS {
  @scala.inline
  def apply(DNS: String, DOMAIN: String, FQDN: String, PARENT_DNS: String, SERVER: String): AnonDNS = {
    val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], DOMAIN = DOMAIN.asInstanceOf[js.Any], FQDN = FQDN.asInstanceOf[js.Any], PARENT_DNS = PARENT_DNS.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDNS]
  }
  @scala.inline
  implicit class AnonDNSOps[Self <: AnonDNS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOMAIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOMAIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFQDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FQDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPARENT_DNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARENT_DNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERVER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

