package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataIndex extends StObject {
  
  var data: js.Any = js.native
  
  var index: Double = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object DataIndex {
  
  @scala.inline
  def apply(data: js.Any, index: Double, originalEvent: org.scalajs.dom.raw.Event): DataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  @scala.inline
  implicit class DataIndexMutableBuilder[Self <: DataIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
