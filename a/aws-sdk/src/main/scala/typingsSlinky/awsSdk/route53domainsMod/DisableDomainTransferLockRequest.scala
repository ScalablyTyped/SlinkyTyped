package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDomainTransferLockRequest extends js.Object {
  /**
    * The name of the domain that you want to remove the transfer lock for.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
}

object DisableDomainTransferLockRequest {
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainTransferLockRequest]
  }
  @scala.inline
  implicit class DisableDomainTransferLockRequestOps[Self <: DisableDomainTransferLockRequest] (val x: Self) extends AnyVal {
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
  }
  
}

