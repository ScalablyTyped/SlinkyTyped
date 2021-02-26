package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNavigationBarOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 导航栏背景色，支持十六进制颜色值 */
  var backgroundColor: String = js.native
  
  /** 导航栏底部边框颜色，支持十六进制颜色值。若设置了 backgroundColor，则borderBottomColor 不会生效，默认会和 backgroundColor 颜色一样 */
  var borderBottomColor: String = js.native
  
  /** 图片连接地址，必须是https，请使用3x高清图片。若设置了image则title参数失效 */
  var image: String = js.native
  
  /** 是否重置导航栏为支付宝默认配色，默认 false */
  var reset: Boolean = js.native
  
  /** 页面标题 */
  var title: String = js.native
}
object SetNavigationBarOptions {
  
  @scala.inline
  def apply(backgroundColor: String, borderBottomColor: String, image: String, reset: Boolean, title: String): SetNavigationBarOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarOptions]
  }
  
  @scala.inline
  implicit class SetNavigationBarOptionsMutableBuilder[Self <: SetNavigationBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
