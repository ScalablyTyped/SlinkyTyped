package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
  /**
    * The domain name against which your SSL/TLS certificate was validated.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * A fully qualified domain name in the certificate. For example, example.com.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of validation record. For example, CNAME for domain validation.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.native
  /**
    * The validation status. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
  /**
    * The value for that type.
    */
  var value: js.UndefOr[NonEmptyString] = js.native
}

object LoadBalancerTlsCertificateDomainValidationRecord {
  @scala.inline
  def apply(): LoadBalancerTlsCertificateDomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateDomainValidationRecordOps[Self <: LoadBalancerTlsCertificateDomainValidationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
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
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NonEmptyString): Self = {
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
    @scala.inline
    def withValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

