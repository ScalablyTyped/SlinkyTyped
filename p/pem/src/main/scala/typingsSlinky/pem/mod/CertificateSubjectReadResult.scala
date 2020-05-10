package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSubjectReadResult extends js.Object {
  var commonName: String = js.native
  var country: String = js.native
  var emailAddress: String = js.native
  var locality: String = js.native
  var organization: String = js.native
  var organizationUnit: String = js.native
  var state: String = js.native
}

object CertificateSubjectReadResult {
  @scala.inline
  def apply(
    commonName: String,
    country: String,
    emailAddress: String,
    locality: String,
    organization: String,
    organizationUnit: String,
    state: String
  ): CertificateSubjectReadResult = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], organizationUnit = organizationUnit.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSubjectReadResult]
  }
  @scala.inline
  implicit class CertificateSubjectReadResultOps[Self <: CertificateSubjectReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

