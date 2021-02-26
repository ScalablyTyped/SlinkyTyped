package typingsSlinky.openfin.shapesPlatformMod

import typingsSlinky.openfin.entityTypeMod.EntityType
import typingsSlinky.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowContextPayload extends StObject {
  
  var entityType: EntityType = js.native
  
  var target: Identity = js.native
}
object GetWindowContextPayload {
  
  @scala.inline
  def apply(entityType: EntityType, target: Identity): GetWindowContextPayload = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowContextPayload]
  }
  
  @scala.inline
  implicit class GetWindowContextPayloadMutableBuilder[Self <: GetWindowContextPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
