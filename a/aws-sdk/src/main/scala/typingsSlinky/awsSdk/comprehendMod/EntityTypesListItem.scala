package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityTypesListItem extends StObject {
  
  /**
    * An entity type within a labeled training dataset that Amazon Comprehend uses to train a custom entity recognizer. Entity types must not contain the following invalid characters: \n (line break), \\n (escaped line break, \r (carriage return), \\r (escaped carriage return), \t (tab), \\t (escaped tab), space, and , (comma).
    */
  var Type: EntityTypeName = js.native
}
object EntityTypesListItem {
  
  @scala.inline
  def apply(Type: EntityTypeName): EntityTypesListItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypesListItem]
  }
  
  @scala.inline
  implicit class EntityTypesListItemMutableBuilder[Self <: EntityTypesListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EntityTypeName): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
