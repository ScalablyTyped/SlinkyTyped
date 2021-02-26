package typingsSlinky.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text[ExtraData] extends Marker[ExtraData] {
  
  /**
    * 标记显示的文本内容
    */
  def getText(): String = js.native
  
  /**
    * 设置文本样式
    * @param style 文本样式
    */
  def setStyle(style: js.Object): Unit = js.native
  
  /**
    * 修改文本内容
    * @param text 文本内容
    */
  def setText(text: String): Unit = js.native
}
object Text {
  
  type EventMap[I] = typingsSlinky.amapJsApi.AMap.Marker.EventMap[I]
  
  @js.native
  trait Options
    extends typingsSlinky.amapJsApi.AMap.Marker.Options[js.Any] {
    
    /**
      * 文本内容
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * 对齐方式
      */
    var textAlign: js.UndefOr[TextAlign] = js.native
    
    var verticalAlign: js.UndefOr[VerticalAlign] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.left
    - typingsSlinky.amapJsApi.amapJsApiStrings.right
    - typingsSlinky.amapJsApi.amapJsApiStrings.center
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    @scala.inline
    def center: typingsSlinky.amapJsApi.amapJsApiStrings.center = "center".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.center]
    
    @scala.inline
    def left: typingsSlinky.amapJsApi.amapJsApiStrings.left = "left".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.left]
    
    @scala.inline
    def right: typingsSlinky.amapJsApi.amapJsApiStrings.right = "right".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amapJsApi.amapJsApiStrings.top
    - typingsSlinky.amapJsApi.amapJsApiStrings.middle
    - typingsSlinky.amapJsApi.amapJsApiStrings.bottom
  */
  trait VerticalAlign extends StObject
  object VerticalAlign {
    
    @scala.inline
    def bottom: typingsSlinky.amapJsApi.amapJsApiStrings.bottom = "bottom".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.bottom]
    
    @scala.inline
    def middle: typingsSlinky.amapJsApi.amapJsApiStrings.middle = "middle".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.middle]
    
    @scala.inline
    def top: typingsSlinky.amapJsApi.amapJsApiStrings.top = "top".asInstanceOf[typingsSlinky.amapJsApi.amapJsApiStrings.top]
  }
}
