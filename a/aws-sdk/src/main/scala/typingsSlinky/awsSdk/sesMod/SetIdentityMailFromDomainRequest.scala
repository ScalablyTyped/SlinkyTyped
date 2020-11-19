package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityMailFromDomainRequest extends js.Object {
  
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. If you choose UseDefaultValue, Amazon SES will use amazonses.com (or a subdomain of that) as the MAIL FROM domain. If you choose RejectMessage, Amazon SES will return a MailFromDomainNotVerified error and not send the email. The action specified in BehaviorOnMXFailure is taken when the custom MAIL FROM domain setup is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMXFailure: js.UndefOr[typingsSlinky.awsSdk.sesMod.BehaviorOnMXFailure] = js.native
  
  /**
    * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
  
  /**
    * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination of email feedback forwarding (for more information, see the Amazon SES Developer Guide), and 3) not be used to receive emails. A value of null disables the custom MAIL FROM setting for the identity.
    */
  var MailFromDomain: js.UndefOr[MailFromDomainName] = js.native
}
object SetIdentityMailFromDomainRequest {
  
  @scala.inline
  def apply(Identity: Identity): SetIdentityMailFromDomainRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityMailFromDomainRequest]
  }
  
  @scala.inline
  implicit class SetIdentityMailFromDomainRequestOps[Self <: SetIdentityMailFromDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorOnMXFailure(value: BehaviorOnMXFailure): Self = this.set("BehaviorOnMXFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviorOnMXFailure: Self = this.set("BehaviorOnMXFailure", js.undefined)
    
    @scala.inline
    def setMailFromDomain(value: MailFromDomainName): Self = this.set("MailFromDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailFromDomain: Self = this.set("MailFromDomain", js.undefined)
  }
}
