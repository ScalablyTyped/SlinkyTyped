package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.default
import typingsSlinky.html5plus.html5plusStrings.destructive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，原生选择按钮框上按钮的样式参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIActionButtonStyles extends StObject {
  
  /**
    * 按钮上显示的文字颜色
    * 可取值：
    *     "#RRGGBB"格式字符串，如"#FF0000"表示文字颜色为红色；
    *     "rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * 按钮的样式
    * 可取值：
    *     "destructive" - 表示警示按钮样式，默认文字颜色为红色；
    *     "default" - 表示默认按钮样式。
    *     默认值为"default"。
    * - destructive: 
    *     警示按钮样式。
    *                                 
    * - default: 
    *     默认按钮样式。
    *                                 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[destructive | default] = js.native
  
  /**
    * 按钮上显示的文字内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.native
}
object PlusNativeUIActionButtonStyles {
  
  @scala.inline
  def apply(): PlusNativeUIActionButtonStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIActionButtonStyles]
  }
  
  @scala.inline
  implicit class PlusNativeUIActionButtonStylesMutableBuilder[Self <: PlusNativeUIActionButtonStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: destructive | default): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
