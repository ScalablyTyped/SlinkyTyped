package typingsSlinky.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptionsAccessEntityObject extends _RouteOptionsAccessObject {
  
  var entity: AccessEntity = js.native
}
object RouteOptionsAccessEntityObject {
  
  @scala.inline
  def apply(entity: AccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
  
  @scala.inline
  implicit class RouteOptionsAccessEntityObjectMutableBuilder[Self <: RouteOptionsAccessEntityObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: AccessEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
