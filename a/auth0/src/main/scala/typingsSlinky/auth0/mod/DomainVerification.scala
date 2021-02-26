package typingsSlinky.auth0.mod

import typingsSlinky.auth0.anon.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainVerification extends Domain {
  
  var cname_api_key: js.UndefOr[String] = js.native
}
object DomainVerification {
  
  @scala.inline
  def apply(
    custom_domain_id: String,
    domain: String,
    primary: Boolean,
    status: CustomDomainStatus,
    `type`: CustomDomainType,
    verification: Methods
  ): DomainVerification = {
    val __obj = js.Dynamic.literal(custom_domain_id = custom_domain_id.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainVerification]
  }
  
  @scala.inline
  implicit class DomainVerificationMutableBuilder[Self <: DomainVerification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCname_api_key(value: String): Self = StObject.set(x, "cname_api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname_api_keyUndefined: Self = StObject.set(x, "cname_api_key", js.undefined)
  }
}
