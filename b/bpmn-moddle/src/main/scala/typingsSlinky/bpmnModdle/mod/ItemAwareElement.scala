package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAwareElement extends BaseElement {
  
  var dataState: DataState = js.native
  
  var itemSubjectRef: ItemDefinition = js.native
}
object ItemAwareElement {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition
  ): ItemAwareElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAwareElement]
  }
  
  @scala.inline
  implicit class ItemAwareElementMutableBuilder[Self <: ItemAwareElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataState(value: DataState): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSubjectRef(value: ItemDefinition): Self = StObject.set(x, "itemSubjectRef", value.asInstanceOf[js.Any])
  }
}
