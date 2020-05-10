package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptions extends js.Object {
  /**
    * Whether the domain is HTTPS only enabled.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * The minimum required TLS version
    */
  var TLSSecurityPolicy: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.TLSSecurityPolicy] = js.native
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

