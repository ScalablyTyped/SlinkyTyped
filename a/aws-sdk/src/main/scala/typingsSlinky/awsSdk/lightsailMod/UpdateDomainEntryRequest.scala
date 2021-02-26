package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainEntryRequest extends StObject {
  
  /**
    * An array of key-value pairs containing information about the domain entry.
    */
  var domainEntry: DomainEntry = js.native
  
  /**
    * The name of the domain recordset to update.
    */
  var domainName: DomainName = js.native
}
object UpdateDomainEntryRequest {
  
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): UpdateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEntryRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainEntryRequestMutableBuilder[Self <: UpdateDomainEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainEntry(value: DomainEntry): Self = StObject.set(x, "domainEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
