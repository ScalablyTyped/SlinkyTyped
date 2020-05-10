package typingsSlinky.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDomain extends js.Object {
  var domain: String = js.native
  var host: String = js.native
  var namespace: String = js.native
  var pathString: String = js.native
  var port: Double = js.native
  var scheme: String = js.native
  var secure: Boolean = js.native
  var subdomain: String = js.native
}

object AnonDomain {
  @scala.inline
  def apply(
    domain: String,
    host: String,
    namespace: String,
    pathString: String,
    port: Double,
    scheme: String,
    secure: Boolean,
    subdomain: String
  ): AnonDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
  @scala.inline
  implicit class AnonDomainOps[Self <: AnonDomain] (val x: Self) extends AnyVal {
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
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

