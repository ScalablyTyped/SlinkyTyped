package typingsSlinky.openfin

import typingsSlinky.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @js.native
  trait Entity extends StObject {
    
    var `type`: String = js.native
    
    var uuid: String = js.native
  }
  object Entity {
    
    @scala.inline
    def apply(`type`: String, uuid: String): Entity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EntityInfo extends StObject {
    
    var entityType: String = js.native
    
    var name: String = js.native
    
    var parent: Identity = js.native
    
    var uuid: String = js.native
  }
  object EntityInfo {
    
    @scala.inline
    def apply(entityType: String, name: String, parent: Identity, uuid: String): EntityInfo = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityInfo]
    }
    
    @scala.inline
    implicit class EntityInfoMutableBuilder[Self <: EntityInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Identity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
