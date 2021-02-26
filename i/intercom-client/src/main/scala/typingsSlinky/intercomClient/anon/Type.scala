package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.user
import typingsSlinky.intercomClient.userMod.UserIdentifier
import typingsSlinky.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var identifier: VisitorIdentifier = js.native
  
  var `type`: user = js.native
  
  var user: UserIdentifier = js.native
}
object Type {
  
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: user, user: UserIdentifier): Type = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: VisitorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserIdentifier): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
