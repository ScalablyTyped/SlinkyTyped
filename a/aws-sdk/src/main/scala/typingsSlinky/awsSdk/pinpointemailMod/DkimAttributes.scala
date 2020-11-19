package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DkimAttributes extends js.Object {
  
  /**
    * If the value is true, then the messages that Amazon Pinpoint sends from the identity are DKIM-signed. If the value is false, then the messages that Amazon Pinpoint sends from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
  
  /**
    * Describes whether or not Amazon Pinpoint has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – Amazon Pinpoint hasn't yet located the DKIM records in the DNS configuration for the domain, but will continue to attempt to locate them.    SUCCESS – Amazon Pinpoint located the DKIM records in the DNS configuration for the domain and determined that they're correct. Amazon Pinpoint can now send DKIM-signed email from the identity.    FAILED – Amazon Pinpoint was unable to locate the DKIM records in the DNS settings for the domain, and won't continue to search for them.    TEMPORARY_FAILURE – A temporary issue occurred, which prevented Amazon Pinpoint from determining the DKIM status for the domain.    NOT_STARTED – Amazon Pinpoint hasn't yet started searching for the DKIM records in the DKIM records for the domain.  
    */
  var Status: js.UndefOr[DkimStatus] = js.native
  
  /**
    * A set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon Pinpoint detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. Amazon Pinpoint usually detects these records within about 72 hours of adding them to the DNS configuration for your domain.
    */
  var Tokens: js.UndefOr[DnsTokenList] = js.native
}
object DkimAttributes {
  
  @scala.inline
  def apply(): DkimAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DkimAttributes]
  }
  
  @scala.inline
  implicit class DkimAttributesOps[Self <: DkimAttributes] (val x: Self) extends AnyVal {
    
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
    def setSigningEnabled(value: Enabled): Self = this.set("SigningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningEnabled: Self = this.set("SigningEnabled", js.undefined)
    
    @scala.inline
    def setStatus(value: DkimStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: DnsToken*): Self = this.set("Tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: DnsTokenList): Self = this.set("Tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("Tokens", js.undefined)
  }
}
