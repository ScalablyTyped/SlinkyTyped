package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration and status of a managed SSL certificate.
  */
@js.native
trait SchemaSslCertificateManagedSslCertificate extends js.Object {
  /**
    * [Output only] Detailed statuses of the domains specified for managed
    * certificate resource.
    */
  var domainStatus: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The domains for which a managed SSL certificate will be generated.
    * Currently only single-domain certs are supported.
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output only] Status of the managed certificate resource.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaSslCertificateManagedSslCertificate {
  @scala.inline
  def apply(): SchemaSslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificateManagedSslCertificate]
  }
  @scala.inline
  implicit class SchemaSslCertificateManagedSslCertificateOps[Self <: SchemaSslCertificateManagedSslCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainStatus(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
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
  }
  
}

