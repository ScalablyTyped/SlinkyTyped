package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainDomainEndpointOptions extends js.Object {
  /**
    * Whether to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain. Valid values:    Policy-Min-TLS-1-0-2019-07, which supports TLSv1.0 and higher    Policy-Min-TLS-1-2-2019-07, which only supports TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.native
}

object AwsElasticsearchDomainDomainEndpointOptions {
  @scala.inline
  def apply(): AwsElasticsearchDomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDomainEndpointOptions]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainDomainEndpointOptionsOps[Self <: AwsElasticsearchDomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnforceHTTPS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceHTTPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceHTTPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnforceHTTPS")(js.undefined)
        ret
    }
    @scala.inline
    def withTLSSecurityPolicy(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TLSSecurityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTLSSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TLSSecurityPolicy")(js.undefined)
        ret
    }
  }
  
}

