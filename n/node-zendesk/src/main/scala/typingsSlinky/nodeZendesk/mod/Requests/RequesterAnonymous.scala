package typingsSlinky.nodeZendesk.mod.Requests

import typingsSlinky.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequesterAnonymous extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var locale_id: js.UndefOr[ZendeskID] = js.native
  
  var name: String = js.native
}
object RequesterAnonymous {
  
  @scala.inline
  def apply(name: String): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAnonymous]
  }
  
  @scala.inline
  implicit class RequesterAnonymousMutableBuilder[Self <: RequesterAnonymous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setLocale_id(value: ZendeskID): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale_idUndefined: Self = StObject.set(x, "locale_id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
