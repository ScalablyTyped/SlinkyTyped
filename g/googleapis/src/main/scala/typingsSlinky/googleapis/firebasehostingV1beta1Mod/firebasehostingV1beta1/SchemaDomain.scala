package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The intended behavior and status information of a domain.
  */
@js.native
trait SchemaDomain extends js.Object {
  /**
    * Required. The domain name of the association.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * If set, the domain should redirect with the provided parameters.
    */
  var domainRedirect: js.UndefOr[SchemaDomainRedirect] = js.native
  /**
    * Output only. Information about the provisioning of certificates and the
    * health of the DNS resolution for the domain.
    */
  var provisioning: js.UndefOr[SchemaDomainProvisioning] = js.native
  /**
    * Required. The site name of the association.
    */
  var site: js.UndefOr[String] = js.native
  /**
    * Output only. Additional status of the domain association.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the domain was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaDomain {
  @scala.inline
  def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  @scala.inline
  implicit class SchemaDomainOps[Self <: SchemaDomain] (val x: Self) extends AnyVal {
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
    def withDomainRedirect(value: SchemaDomainRedirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioning(value: SchemaDomainProvisioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioning")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

