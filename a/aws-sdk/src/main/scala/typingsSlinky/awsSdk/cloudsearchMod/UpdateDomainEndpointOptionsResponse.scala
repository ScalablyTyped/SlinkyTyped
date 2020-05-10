package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEndpointOptionsResponse extends js.Object {
  /**
    * The newly-configured domain endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
}

object UpdateDomainEndpointOptionsResponse {
  @scala.inline
  def apply(): UpdateDomainEndpointOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainEndpointOptionsResponse]
  }
  @scala.inline
  implicit class UpdateDomainEndpointOptionsResponseOps[Self <: UpdateDomainEndpointOptionsResponse] (val x: Self) extends AnyVal {
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

