package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainEndpointOptionsRequest extends js.Object {
  /**
    * Whether to retrieve the latest configuration (which might be in a Processing state) or the current, active configuration. Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}

object DescribeDomainEndpointOptionsRequest {
  @scala.inline
  def apply(DomainName: DomainName): DescribeDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainEndpointOptionsRequest]
  }
  @scala.inline
  implicit class DescribeDomainEndpointOptionsRequestOps[Self <: DescribeDomainEndpointOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployed")(js.undefined)
        ret
    }
  }
  
}

