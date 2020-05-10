package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificatePrincipal extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate-principal
  /**
    * Common Name.
    */
  var commonName: String = js.native
  /**
    * Country or region.
    */
  var country: String = js.native
  /**
    * Locality.
    */
  var locality: String = js.native
  /**
    * Organization Unit names.
    */
  var organizationUnits: js.Array[String] = js.native
  /**
    * Organization names.
    */
  var organizations: js.Array[String] = js.native
  /**
    * State or province.
    */
  var state: String = js.native
}

object CertificatePrincipal {
  @scala.inline
  def apply(
    commonName: String,
    country: String,
    locality: String,
    organizationUnits: js.Array[String],
    organizations: js.Array[String],
    state: String
  ): CertificatePrincipal = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organizationUnits = organizationUnits.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatePrincipal]
  }
  @scala.inline
  implicit class CertificatePrincipalOps[Self <: CertificatePrincipal] (val x: Self) extends AnyVal {
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
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationUnits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations")(value.asInstanceOf[js.Any])
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

