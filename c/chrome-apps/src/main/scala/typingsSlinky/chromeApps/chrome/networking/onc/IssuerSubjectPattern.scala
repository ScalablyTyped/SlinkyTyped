package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuerSubjectPattern extends js.Object {
  /** If set, the value against which to match the certificate subject's common name. */
  var CommonName: js.UndefOr[String] = js.native
  /** If set, the value against which to match the certificate subject's common location. */
  var Locality: js.UndefOr[String] = js.native
  /**
    * If set, the value against which to match the certificate subject's organizations.
    * At least one organization should match the value.
    */
  var Organization: js.UndefOr[String] = js.native
  /**
    * If set, the value against which to match the certificate subject's organizational units.
    * At least one organizational unit should match the value.
    */
  var OrganizationalUnit: js.UndefOr[String] = js.native
}

object IssuerSubjectPattern {
  @scala.inline
  def apply(): IssuerSubjectPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerSubjectPattern]
  }
  @scala.inline
  implicit class IssuerSubjectPatternOps[Self <: IssuerSubjectPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locality")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Organization")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnit")(js.undefined)
        ret
    }
  }
  
}

