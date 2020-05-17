package typingsSlinky.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csp extends js.Object {
  var csp: js.Any = js.native
  var csrf: js.Any = js.native
  var defaultMiddleware: String = js.native
  var domainWhiteList: js.Array[String] = js.native
  var hsts: js.Any = js.native
  var methodnoallow: EnableBoolean = js.native
  var noopen: EnableBoolean = js.native
  var protocolWhiteList: js.Array[String] = js.native
  var xframe: Value = js.native
  var xssProtection: js.Any = js.native
}

object Csp {
  @scala.inline
  def apply(
    csp: js.Any,
    csrf: js.Any,
    defaultMiddleware: String,
    domainWhiteList: js.Array[String],
    hsts: js.Any,
    methodnoallow: EnableBoolean,
    noopen: EnableBoolean,
    protocolWhiteList: js.Array[String],
    xframe: Value,
    xssProtection: js.Any
  ): Csp = {
    val __obj = js.Dynamic.literal(csp = csp.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], defaultMiddleware = defaultMiddleware.asInstanceOf[js.Any], domainWhiteList = domainWhiteList.asInstanceOf[js.Any], hsts = hsts.asInstanceOf[js.Any], methodnoallow = methodnoallow.asInstanceOf[js.Any], noopen = noopen.asInstanceOf[js.Any], protocolWhiteList = protocolWhiteList.asInstanceOf[js.Any], xframe = xframe.asInstanceOf[js.Any], xssProtection = xssProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csp]
  }
  @scala.inline
  implicit class CspOps[Self <: Csp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsrf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMiddleware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainWhiteList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainWhiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodnoallow(value: EnableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodnoallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoopen(value: EnableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noopen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolWhiteList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolWhiteList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXframe(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXssProtection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssProtection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

