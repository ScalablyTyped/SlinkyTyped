package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityDkimAttributes extends StObject {
  
  /**
    * Is true if DKIM signing is enabled for email sent from the identity. It's false otherwise. The default value is true.
    */
  var DkimEnabled: Enabled = js.native
  
  /**
    * A set of character strings that represent the domain's identity. Using these tokens, you need to create DNS CNAME records that point to DKIM public keys that are hosted by Amazon SES. Amazon Web Services eventually detects that you've updated your DNS records. This detection process might take up to 72 hours. After successful detection, Amazon SES is able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, see the Amazon SES Developer Guide.
    */
  var DkimTokens: js.UndefOr[VerificationTokenList] = js.native
  
  /**
    * Describes whether Amazon SES has successfully verified the DKIM DNS records (tokens) published in the domain name's DNS. (This only applies to domain identities, not email address identities.)
    */
  var DkimVerificationStatus: VerificationStatus = js.native
}
object IdentityDkimAttributes {
  
  @scala.inline
  def apply(DkimEnabled: Enabled, DkimVerificationStatus: VerificationStatus): IdentityDkimAttributes = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], DkimVerificationStatus = DkimVerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDkimAttributes]
  }
  
  @scala.inline
  implicit class IdentityDkimAttributesMutableBuilder[Self <: IdentityDkimAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimEnabled(value: Enabled): Self = StObject.set(x, "DkimEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimTokens(value: VerificationTokenList): Self = StObject.set(x, "DkimTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimTokensUndefined: Self = StObject.set(x, "DkimTokens", js.undefined)
    
    @scala.inline
    def setDkimTokensVarargs(value: VerificationToken*): Self = StObject.set(x, "DkimTokens", js.Array(value :_*))
    
    @scala.inline
    def setDkimVerificationStatus(value: VerificationStatus): Self = StObject.set(x, "DkimVerificationStatus", value.asInstanceOf[js.Any])
  }
}
