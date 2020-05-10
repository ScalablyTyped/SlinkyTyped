package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDomainTransferabilityResponse extends js.Object {
  /**
    * A complex type that contains information about whether the specified domain can be transferred to Amazon Route 53.
    */
  var Transferability: DomainTransferability = js.native
}

object CheckDomainTransferabilityResponse {
  @scala.inline
  def apply(Transferability: DomainTransferability): CheckDomainTransferabilityResponse = {
    val __obj = js.Dynamic.literal(Transferability = Transferability.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainTransferabilityResponse]
  }
  @scala.inline
  implicit class CheckDomainTransferabilityResponseOps[Self <: CheckDomainTransferabilityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransferability(value: DomainTransferability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transferability")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

