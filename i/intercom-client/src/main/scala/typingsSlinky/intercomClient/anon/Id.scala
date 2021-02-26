package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.companyMod.CompanyIdentifier
import typingsSlinky.intercomClient.leadMod.LeadIdentifier
import typingsSlinky.intercomClient.userMod.UserIdIdentifier
import typingsSlinky.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id
  extends UserIdIdentifier
     with CompanyIdentifier
     with LeadIdentifier
     with VisitorIdentifier {
  
  var id: String = js.native
}
object Id {
  
  @scala.inline
  def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
