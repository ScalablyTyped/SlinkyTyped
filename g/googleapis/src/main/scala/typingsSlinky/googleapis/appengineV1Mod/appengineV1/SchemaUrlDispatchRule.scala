package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rules to match an HTTP request and dispatch that request to a service.
  */
@js.native
trait SchemaUrlDispatchRule extends js.Object {
  /**
    * Domain name to match against. The wildcard &quot;*&quot; is supported if
    * specified before a period: &quot;*.&quot;.Defaults to matching all
    * domains: &quot;*&quot;.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Pathname within the host. Must start with a &quot;/&quot;. A single
    * &quot;*&quot; can be included at the end of the path.The sum of the
    * lengths of the domain and path may not exceed 100 characters.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Resource ID of a service in this application that should serve the
    * matched request. The service must already exist. Example: default.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaUrlDispatchRule {
  @scala.inline
  def apply(): SchemaUrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlDispatchRule]
  }
  @scala.inline
  implicit class SchemaUrlDispatchRuleOps[Self <: SchemaUrlDispatchRule] (val x: Self) extends AnyVal {
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
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

