package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityMailFromDomainAttributes extends StObject {
  
  /**
    * The action that Amazon SES takes if it cannot successfully read the required MX record when you send an email. A value of UseDefaultValue indicates that if Amazon SES cannot read the required MX record, it uses amazonses.com (or a subdomain of that) as the MAIL FROM domain. A value of RejectMessage indicates that if Amazon SES cannot read the required MX record, Amazon SES returns a MailFromDomainNotVerified error and does not send the email. The custom MAIL FROM setup states that result in this behavior are Pending, Failed, and TemporaryFailure.
    */
  var BehaviorOnMXFailure: typingsSlinky.awsSdk.sesMod.BehaviorOnMXFailure = js.native
  
  /**
    * The custom MAIL FROM domain that the identity is configured to use.
    */
  var MailFromDomain: MailFromDomainName = js.native
  
  /**
    * The state that indicates whether Amazon SES has successfully read the MX record required for custom MAIL FROM domain setup. If the state is Success, Amazon SES uses the specified custom MAIL FROM domain when the verified identity sends an email. All other states indicate that Amazon SES takes the action described by BehaviorOnMXFailure.
    */
  var MailFromDomainStatus: CustomMailFromStatus = js.native
}
object IdentityMailFromDomainAttributes {
  
  @scala.inline
  def apply(
    BehaviorOnMXFailure: BehaviorOnMXFailure,
    MailFromDomain: MailFromDomainName,
    MailFromDomainStatus: CustomMailFromStatus
  ): IdentityMailFromDomainAttributes = {
    val __obj = js.Dynamic.literal(BehaviorOnMXFailure = BehaviorOnMXFailure.asInstanceOf[js.Any], MailFromDomain = MailFromDomain.asInstanceOf[js.Any], MailFromDomainStatus = MailFromDomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityMailFromDomainAttributes]
  }
  
  @scala.inline
  implicit class IdentityMailFromDomainAttributesMutableBuilder[Self <: IdentityMailFromDomainAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviorOnMXFailure(value: BehaviorOnMXFailure): Self = StObject.set(x, "BehaviorOnMXFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailFromDomain(value: MailFromDomainName): Self = StObject.set(x, "MailFromDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailFromDomainStatus(value: CustomMailFromStatus): Self = StObject.set(x, "MailFromDomainStatus", value.asInstanceOf[js.Any])
  }
}
