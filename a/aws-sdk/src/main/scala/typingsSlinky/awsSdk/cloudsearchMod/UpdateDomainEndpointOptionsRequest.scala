package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEndpointOptionsRequest extends js.Object {
  /**
    * Whether to require that all requests to the domain arrive over HTTPS. We recommend Policy-Min-TLS-1-2-2019-07 for TLSSecurityPolicy. For compatibility with older clients, the default is Policy-Min-TLS-1-0-2019-07. 
    */
  var DomainEndpointOptions: typingsSlinky.awsSdk.cloudsearchMod.DomainEndpointOptions = js.native
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}

object UpdateDomainEndpointOptionsRequest {
  @scala.inline
  def apply(DomainEndpointOptions: DomainEndpointOptions, DomainName: DomainName): UpdateDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainEndpointOptions = DomainEndpointOptions.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEndpointOptionsRequest]
  }
  @scala.inline
  implicit class UpdateDomainEndpointOptionsRequestOps[Self <: UpdateDomainEndpointOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainEndpointOptions(value: DomainEndpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainEndpointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

