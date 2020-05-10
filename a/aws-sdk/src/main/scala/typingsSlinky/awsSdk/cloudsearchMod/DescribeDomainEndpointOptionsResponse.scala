package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainEndpointOptionsResponse extends js.Object {
  /**
    * The status and configuration of a search domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}

object DescribeDomainEndpointOptionsResponse {
  @scala.inline
  def apply(): DescribeDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainEndpointOptionsResponse]
  }
  @scala.inline
  implicit class DescribeDomainEndpointOptionsResponseOps[Self <: DescribeDomainEndpointOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainEndpointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainEndpointOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainEndpointOptions")(js.undefined)
        ret
    }
  }
  
}

