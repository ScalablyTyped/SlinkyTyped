package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsRequestAction extends StObject {
  
  /**
    * The domain information for the API request.
    */
  var Domain: js.UndefOr[String] = js.native
}
object DnsRequestAction {
  
  @scala.inline
  def apply(): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRequestAction]
  }
  
  @scala.inline
  implicit class DnsRequestActionMutableBuilder[Self <: DnsRequestAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
