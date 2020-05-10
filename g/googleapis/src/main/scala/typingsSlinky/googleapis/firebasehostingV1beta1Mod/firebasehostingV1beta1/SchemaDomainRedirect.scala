package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the behavior of a domain-level redirect. Domain redirects preserve
  * the path of the redirect but replace the requested domain with the one
  * specified in the redirect configuration.
  */
@js.native
trait SchemaDomainRedirect extends js.Object {
  /**
    * Required. The domain name to redirect to.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * Required. The redirect status code.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDomainRedirect {
  @scala.inline
  def apply(): SchemaDomainRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainRedirect]
  }
  @scala.inline
  implicit class SchemaDomainRedirectOps[Self <: SchemaDomainRedirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

