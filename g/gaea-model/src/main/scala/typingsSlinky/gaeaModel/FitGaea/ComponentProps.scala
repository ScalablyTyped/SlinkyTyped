package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProps
  extends HTMLProps[js.Any]
     with /**
  * 渲染编辑回调
  */
// renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
/* x */ StringDictionary[js.Any] {
  
  /**
    * 是否可以拖入子元素
    */
  var canDragIn: js.UndefOr[Boolean] = js.native
  
  /**
    * 父组件传递的数据
    */
  var gaeaData: js.UndefOr[js.Any] = js.native
  
  /**
    * 编辑信息
    */
  var gaeaEdit: js.UndefOr[js.Array[ComponentPropsGaeaEdit]] = js.native
  
  /**
    * 事件定义
    */
  var gaeaEvent: js.UndefOr[GaeaEvent] = js.native
  
  /**
    * 存储事件设置
    */
  var gaeaEventData: js.UndefOr[js.Array[EventData]] = js.native
  
  /**
    * 组件图标,为 fontAwesome
    */
  var gaeaIcon: js.UndefOr[String] = js.native
  
  /**
    * 组件的中文名
    */
  var gaeaName: String = js.native
  
  /**
    * 存储native事件设置
    */
  var gaeaNativeEventData: js.UndefOr[js.Array[EventData]] = js.native
  
  /**
    * 是否在预览模式，preivew 会传入 true
    */
  var gaeaPreview: js.UndefOr[Boolean] = js.native
  
  /**
    * 唯一的 key,用来唯一标识这个组件,所有盖亚内部组件都以 gaea- 为前缀
    */
  var gaeaUniqueKey: String = js.native
  
  /**
    * 存储变量信息
    */
  var gaeaVariables: js.UndefOr[StringDictionary[VariableData]] = js.native
}
object ComponentProps {
  
  @scala.inline
  def apply(gaeaName: String, gaeaUniqueKey: String): ComponentProps = {
    val __obj = js.Dynamic.literal(gaeaName = gaeaName.asInstanceOf[js.Any], gaeaUniqueKey = gaeaUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  
  @scala.inline
  implicit class ComponentPropsMutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDragIn(value: Boolean): Self = StObject.set(x, "canDragIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDragInUndefined: Self = StObject.set(x, "canDragIn", js.undefined)
    
    @scala.inline
    def setGaeaData(value: js.Any): Self = StObject.set(x, "gaeaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaDataUndefined: Self = StObject.set(x, "gaeaData", js.undefined)
    
    @scala.inline
    def setGaeaEdit(value: js.Array[ComponentPropsGaeaEdit]): Self = StObject.set(x, "gaeaEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaEditUndefined: Self = StObject.set(x, "gaeaEdit", js.undefined)
    
    @scala.inline
    def setGaeaEditVarargs(value: ComponentPropsGaeaEdit*): Self = StObject.set(x, "gaeaEdit", js.Array(value :_*))
    
    @scala.inline
    def setGaeaEvent(value: GaeaEvent): Self = StObject.set(x, "gaeaEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaEventData(value: js.Array[EventData]): Self = StObject.set(x, "gaeaEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaEventDataUndefined: Self = StObject.set(x, "gaeaEventData", js.undefined)
    
    @scala.inline
    def setGaeaEventDataVarargs(value: EventData*): Self = StObject.set(x, "gaeaEventData", js.Array(value :_*))
    
    @scala.inline
    def setGaeaEventUndefined: Self = StObject.set(x, "gaeaEvent", js.undefined)
    
    @scala.inline
    def setGaeaIcon(value: String): Self = StObject.set(x, "gaeaIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaIconUndefined: Self = StObject.set(x, "gaeaIcon", js.undefined)
    
    @scala.inline
    def setGaeaName(value: String): Self = StObject.set(x, "gaeaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaNativeEventData(value: js.Array[EventData]): Self = StObject.set(x, "gaeaNativeEventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaNativeEventDataUndefined: Self = StObject.set(x, "gaeaNativeEventData", js.undefined)
    
    @scala.inline
    def setGaeaNativeEventDataVarargs(value: EventData*): Self = StObject.set(x, "gaeaNativeEventData", js.Array(value :_*))
    
    @scala.inline
    def setGaeaPreview(value: Boolean): Self = StObject.set(x, "gaeaPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaPreviewUndefined: Self = StObject.set(x, "gaeaPreview", js.undefined)
    
    @scala.inline
    def setGaeaUniqueKey(value: String): Self = StObject.set(x, "gaeaUniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaVariables(value: StringDictionary[VariableData]): Self = StObject.set(x, "gaeaVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaeaVariablesUndefined: Self = StObject.set(x, "gaeaVariables", js.undefined)
  }
}
