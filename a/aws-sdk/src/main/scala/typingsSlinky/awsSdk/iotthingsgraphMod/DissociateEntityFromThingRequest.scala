package typingsSlinky.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DissociateEntityFromThingRequest extends StObject {
  
  /**
    * The entity type from which to disassociate the thing.
    */
  var entityType: EntityType = js.native
  
  /**
    * The name of the thing to disassociate.
    */
  var thingName: ThingName = js.native
}
object DissociateEntityFromThingRequest {
  
  @scala.inline
  def apply(entityType: EntityType, thingName: ThingName): DissociateEntityFromThingRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociateEntityFromThingRequest]
  }
  
  @scala.inline
  implicit class DissociateEntityFromThingRequestMutableBuilder[Self <: DissociateEntityFromThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
