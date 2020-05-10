package typingsSlinky.pulumiAws.outputMod.acmpca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityCertificateAuthorityConfigurationSubject extends js.Object {
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var commonName: js.UndefOr[String] = js.native
  /**
    * Two digit code that specifies the country in which the certificate subject located.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Disambiguating information for the certificate subject.
    */
  var distinguishedNameQualifier: js.UndefOr[String] = js.native
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var generationQualifier: js.UndefOr[String] = js.native
  /**
    * First name.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * Concatenation that typically contains the first letter of the `givenName`, the first letter of the middle name if one exists, and the first letter of the `surname`.
    */
  var initials: js.UndefOr[String] = js.native
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Legal name of the organization with which the certificate subject is affiliated.
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var organizationalUnit: js.UndefOr[String] = js.native
  /**
    * Typically a shortened version of a longer `givenName`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var pseudonym: js.UndefOr[String] = js.native
  /**
    * State in which the subject of the certificate is located.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var surname: js.UndefOr[String] = js.native
  /**
    * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject.
    */
  var title: js.UndefOr[String] = js.native
}

object CertificateAuthorityCertificateAuthorityConfigurationSubject {
  @scala.inline
  def apply(): CertificateAuthorityCertificateAuthorityConfigurationSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityCertificateAuthorityConfigurationSubject]
  }
  @scala.inline
  implicit class CertificateAuthorityCertificateAuthorityConfigurationSubjectOps[Self <: CertificateAuthorityCertificateAuthorityConfigurationSubject] (val x: Self) extends AnyVal {
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
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinguishedNameQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinguishedNameQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinguishedNameQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinguishedNameQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerationQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerationQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generationQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationalUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudonym(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudonym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudonym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudonym")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

