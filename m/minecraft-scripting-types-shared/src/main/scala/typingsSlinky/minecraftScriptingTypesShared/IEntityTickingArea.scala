package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityTickingArea extends ITickingArea {
  
  /**
    * The type of the object
    */
  val __type__ : entity_ticking_area = js.native
  
  /**
    * The unique identifier of the ticking area
    */
  val entity_ticking_area_id: Int64 = js.native
}
object IEntityTickingArea {
  
  @scala.inline
  def apply(__type__ : entity_ticking_area, entity_ticking_area_id: Int64): IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityTickingArea]
  }
  
  @scala.inline
  implicit class IEntityTickingAreaMutableBuilder[Self <: IEntityTickingArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity_ticking_area_id(value: Int64): Self = StObject.set(x, "entity_ticking_area_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: entity_ticking_area): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
