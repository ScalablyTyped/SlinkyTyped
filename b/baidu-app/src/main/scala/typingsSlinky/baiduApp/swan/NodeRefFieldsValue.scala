package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Bottom
import typingsSlinky.baiduApp.anon.Dataset
import typingsSlinky.baiduApp.anon.Id
import typingsSlinky.baiduApp.anon.PropertiesAny
import typingsSlinky.baiduApp.anon.ScrollLeft
import typingsSlinky.baiduApp.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRefFieldsValue extends StObject {
  
  var dataset: Dataset = js.native
  
  var id: Id = js.native
  
  var properties: PropertiesAny = js.native
  
  var rect: Bottom = js.native
  
  var scrollOffset: ScrollLeft = js.native
  
  var size: Width = js.native
}
object NodeRefFieldsValue {
  
  @scala.inline
  def apply(
    dataset: Dataset,
    id: Id,
    properties: PropertiesAny,
    rect: Bottom,
    scrollOffset: ScrollLeft,
    size: Width
  ): NodeRefFieldsValue = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefFieldsValue]
  }
  
  @scala.inline
  implicit class NodeRefFieldsValueMutableBuilder[Self <: NodeRefFieldsValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertiesAny): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Bottom): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffset(value: ScrollLeft): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Width): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
