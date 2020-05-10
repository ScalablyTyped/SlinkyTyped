package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactReachabilityStatusResponse extends js.Object {
  /**
    * The domain name for which you requested the reachability status.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * Whether the registrant contact has responded. Values include the following:  PENDING  We sent the confirmation email and haven't received a response yet.  DONE  We sent the email and got confirmation from the registrant contact.  EXPIRED  The time limit expired before the registrant contact responded.  
    */
  var status: js.UndefOr[ReachabilityStatus] = js.native
}

object GetContactReachabilityStatusResponse {
  @scala.inline
  def apply(): GetContactReachabilityStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactReachabilityStatusResponse]
  }
  @scala.inline
  implicit class GetContactReachabilityStatusResponseOps[Self <: GetContactReachabilityStatusResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStatus(value: ReachabilityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

