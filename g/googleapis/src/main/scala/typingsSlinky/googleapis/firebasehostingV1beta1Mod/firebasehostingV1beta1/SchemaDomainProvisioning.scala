package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current certificate provisioning status information for a domain.
  */
@js.native
trait SchemaDomainProvisioning extends js.Object {
  /**
    * The TXT records (for the certificate challenge) that were found at the
    * last DNS fetch.
    */
  var certChallengeDiscoveredTxt: js.UndefOr[js.Array[String]] = js.native
  /**
    * The DNS challenge for generating a certificate.
    */
  var certChallengeDns: js.UndefOr[SchemaCertDnsChallenge] = js.native
  /**
    * The HTTP challenge for generating a certificate.
    */
  var certChallengeHttp: js.UndefOr[SchemaCertHttpChallenge] = js.native
  /**
    * The certificate provisioning status; updated when Firebase Hosting
    * provisions an SSL certificate for the domain.
    */
  var certStatus: js.UndefOr[String] = js.native
  /**
    * The IPs found at the last DNS fetch.
    */
  var discoveredIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time at which the last DNS fetch occurred.
    */
  var dnsFetchTime: js.UndefOr[String] = js.native
  /**
    * The DNS record match status as of the last DNS fetch.
    */
  var dnsStatus: js.UndefOr[String] = js.native
  /**
    * The list of IPs to which the domain is expected to resolve.
    */
  var expectedIps: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDomainProvisioning {
  @scala.inline
  def apply(): SchemaDomainProvisioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainProvisioning]
  }
  @scala.inline
  implicit class SchemaDomainProvisioningOps[Self <: SchemaDomainProvisioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertChallengeDiscoveredTxt(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeDiscoveredTxt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertChallengeDiscoveredTxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeDiscoveredTxt")(js.undefined)
        ret
    }
    @scala.inline
    def withCertChallengeDns(value: SchemaCertDnsChallenge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertChallengeDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeDns")(js.undefined)
        ret
    }
    @scala.inline
    def withCertChallengeHttp(value: SchemaCertHttpChallenge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertChallengeHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certChallengeHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withCertStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscoveredIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveredIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveredIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveredIps")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsFetchTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsFetchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsFetchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsFetchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedIps")(js.undefined)
        ret
    }
  }
  
}

