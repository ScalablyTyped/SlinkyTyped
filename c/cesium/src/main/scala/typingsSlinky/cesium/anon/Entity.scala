package typingsSlinky.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends StObject {
  
  var entity: typingsSlinky.cesium.mod.Entity = js.native
  
  var geometryOptions: js.Any = js.native
  
  var geometryPropertyName: String = js.native
  
  var observedPropertyNames: js.Array[String] = js.native
  
  var scene: typingsSlinky.cesium.mod.Scene = js.native
}
object Entity {
  
  @scala.inline
  def apply(
    entity: typingsSlinky.cesium.mod.Entity,
    geometryOptions: js.Any,
    geometryPropertyName: String,
    observedPropertyNames: js.Array[String],
    scene: typingsSlinky.cesium.mod.Scene
  ): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], geometryOptions = geometryOptions.asInstanceOf[js.Any], geometryPropertyName = geometryPropertyName.asInstanceOf[js.Any], observedPropertyNames = observedPropertyNames.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: typingsSlinky.cesium.mod.Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryOptions(value: js.Any): Self = StObject.set(x, "geometryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPropertyName(value: String): Self = StObject.set(x, "geometryPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedPropertyNames(value: js.Array[String]): Self = StObject.set(x, "observedPropertyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedPropertyNamesVarargs(value: String*): Self = StObject.set(x, "observedPropertyNames", js.Array(value :_*))
    
    @scala.inline
    def setScene(value: typingsSlinky.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
