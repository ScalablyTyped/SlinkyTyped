package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactReachabilityStatusRequest extends js.Object {
  /**
    * The name of the domain for which you want to know whether the registrant contact has confirmed that the email address is valid.
    */
  var domainName: js.UndefOr[DomainName] = js.native
}

object GetContactReachabilityStatusRequest {
  @scala.inline
  def apply(): GetContactReachabilityStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactReachabilityStatusRequest]
  }
  @scala.inline
  implicit class GetContactReachabilityStatusRequestOps[Self <: GetContactReachabilityStatusRequest] (val x: Self) extends AnyVal {
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
  }
  
}

