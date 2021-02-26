package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovingComponent extends StObject {
  
  // 是否是新拖拽的
  var isNew: Boolean = js.native
  
  // 在编辑区域的组件信息
  var mapUniqueKey: String = js.native
  
  // 直接给 source 就直接用
  var source: String = js.native
  
  // 组件的唯一标识, 新建的时候采用
  var uniqueKey: String = js.native
}
object MovingComponent {
  
  @scala.inline
  def apply(isNew: Boolean, mapUniqueKey: String, source: String, uniqueKey: String): MovingComponent = {
    val __obj = js.Dynamic.literal(isNew = isNew.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovingComponent]
  }
  
  @scala.inline
  implicit class MovingComponentMutableBuilder[Self <: MovingComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
  }
}
