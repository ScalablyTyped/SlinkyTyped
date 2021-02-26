package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportComponentFullInfo extends StObject {
  
  // 子元素列表 （包括非直接子集）
  var childs: StringDictionary[ViewportComponentInfo] = js.native
  
  // 组件信息
  var componentInfo: ViewportComponentInfo = js.native
  
  // 组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
}
object ViewportComponentFullInfo {
  
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String
  ): ViewportComponentFullInfo = {
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentFullInfo]
  }
  
  @scala.inline
  implicit class ViewportComponentFullInfoMutableBuilder[Self <: ViewportComponentFullInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChilds(value: StringDictionary[ViewportComponentInfo]): Self = StObject.set(x, "childs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentInfo(value: ViewportComponentInfo): Self = StObject.set(x, "componentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
  }
}
