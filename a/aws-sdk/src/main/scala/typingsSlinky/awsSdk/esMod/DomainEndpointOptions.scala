package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptions extends js.Object {
  /**
    * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain.  It can be one of the following values:  Policy-Min-TLS-1-0-2019-07:  TLS security policy which supports TLSv1.0 and higher. Policy-Min-TLS-1-2-2019-07:  TLS security policy which supports only TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[typingsSlinky.awsSdk.esMod.TLSSecurityPolicy] = js.native
}

object DomainEndpointOptions {
  @scala.inline
  def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  @scala.inline
  implicit class DomainEndpointOptionsOps[Self <: DomainEndpointOptions] (val x: Self) extends AnyVal {
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
    def withTLSSecurityPolicy(value: TLSSecurityPolicy): Self = {
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

