package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResendContactReachabilityEmailResponse extends js.Object {
  /**
    * The domain name for which you requested a confirmation email.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The email address for the registrant contact at the time that we sent the verification email.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    *  True if the email address for the registrant contact has already been verified, and false otherwise. If the email address has already been verified, we don't send another confirmation email.
    */
  var isAlreadyVerified: js.UndefOr[Boolean] = js.native
}

object ResendContactReachabilityEmailResponse {
  @scala.inline
  def apply(): ResendContactReachabilityEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendContactReachabilityEmailResponse]
  }
  @scala.inline
  implicit class ResendContactReachabilityEmailResponseOps[Self <: ResendContactReachabilityEmailResponse] (val x: Self) extends AnyVal {
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
    def withEmailAddress(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlreadyVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlreadyVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlreadyVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlreadyVerified")(js.undefined)
        ret
    }
  }
  
}

