package typingsSlinky.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends StObject {
  
  var domain: String = js.native
  
  var reason: String = js.native
}
object Domain {
  
  @scala.inline
  def apply(domain: String, reason: String): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
