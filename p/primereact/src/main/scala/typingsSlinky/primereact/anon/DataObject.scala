package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends StObject {
  
  var data: js.Object = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object DataObject {
  
  @scala.inline
  def apply(data: js.Object, originalEvent: org.scalajs.dom.raw.Event): DataObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  
  @scala.inline
  implicit class DataObjectMutableBuilder[Self <: DataObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
