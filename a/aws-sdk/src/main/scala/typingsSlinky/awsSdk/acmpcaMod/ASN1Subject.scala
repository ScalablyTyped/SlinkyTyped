package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASN1Subject extends js.Object {
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var CommonName: js.UndefOr[String64] = js.native
  /**
    * Two-digit code that specifies the country in which the certificate subject located.
    */
  var Country: js.UndefOr[CountryCodeString] = js.native
  /**
    * Disambiguating information for the certificate subject.
    */
  var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.native
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var GenerationQualifier: js.UndefOr[String3] = js.native
  /**
    * First name.
    */
  var GivenName: js.UndefOr[String16] = js.native
  /**
    * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the SurName.
    */
  var Initials: js.UndefOr[String5] = js.native
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var Locality: js.UndefOr[String128] = js.native
  /**
    * Legal name of the organization with which the certificate subject is affiliated. 
    */
  var Organization: js.UndefOr[String64] = js.native
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var OrganizationalUnit: js.UndefOr[String64] = js.native
  /**
    * Typically a shortened version of a longer GivenName. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var Pseudonym: js.UndefOr[String128] = js.native
  /**
    * The certificate serial number.
    */
  var SerialNumber: js.UndefOr[String64] = js.native
  /**
    * State in which the subject of the certificate is located.
    */
  var State: js.UndefOr[String128] = js.native
  /**
    * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var Surname: js.UndefOr[String40] = js.native
  /**
    * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
    */
  var Title: js.UndefOr[String64] = js.native
}

object ASN1Subject {
  @scala.inline
  def apply(): ASN1Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ASN1Subject]
  }
  @scala.inline
  implicit class ASN1SubjectOps[Self <: ASN1Subject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String64): Self = {
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
    def withCountry(value: CountryCodeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinguishedNameQualifier(value: DistinguishedNameQualifierString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistinguishedNameQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinguishedNameQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistinguishedNameQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerationQualifier(value: String3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerationQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerationQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GenerationQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String16): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(js.undefined)
        ret
    }
    @scala.inline
    def withInitials(value: String5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initials")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String128): Self = {
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
    def withOrganization(value: String64): Self = {
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
    def withOrganizationalUnit(value: String64): Self = {
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
    @scala.inline
    def withPseudonym(value: String128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pseudonym")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudonym: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pseudonym")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: String64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withSurname(value: String40): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

