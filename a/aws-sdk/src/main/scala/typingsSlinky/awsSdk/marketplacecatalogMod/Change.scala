package typingsSlinky.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  /**
    * Change types are single string values that describe your intention for the change. Each change type is unique for each EntityType provided in the change's scope.
    */
  var ChangeType: typingsSlinky.awsSdk.marketplacecatalogMod.ChangeType = js.native
  
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: Json = js.native
  
  /**
    * The entity to be changed.
    */
  var Entity: typingsSlinky.awsSdk.marketplacecatalogMod.Entity = js.native
}
object Change {
  
  @scala.inline
  def apply(ChangeType: ChangeType, Details: Json, Entity: Entity): Change = {
    val __obj = js.Dynamic.literal(ChangeType = ChangeType.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Entity = Entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "Entity", value.asInstanceOf[js.Any])
  }
}
