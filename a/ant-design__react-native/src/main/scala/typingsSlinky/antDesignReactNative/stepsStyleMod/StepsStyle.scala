package typingsSlinky.antDesignReactNative.stepsStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepsStyle extends js.Object {
  
  var content_l: ViewStyle = js.native
  
  var content_s: ViewStyle = js.native
  
  var content_s_h: ViewStyle = js.native
  
  var description_l: TextStyle = js.native
  
  var description_s: TextStyle = js.native
  
  var head_blue_l: ViewStyle = js.native
  
  var head_blue_s: ViewStyle = js.native
  
  var head_default_l: ViewStyle = js.native
  
  var head_default_s: ViewStyle = js.native
  
  var head_gray_l: ViewStyle = js.native
  
  var head_gray_s: ViewStyle = js.native
  
  var head_red_l: ViewStyle = js.native
  
  var head_red_s: ViewStyle = js.native
  
  var icon_l: TextStyle = js.native
  
  var icon_s: TextStyle = js.native
  
  var tail_blue: ViewStyle = js.native
  
  var tail_default_l: ViewStyle = js.native
  
  var tail_default_s: ViewStyle = js.native
  
  var tail_default_s_h: ViewStyle = js.native
  
  var tail_error: ViewStyle = js.native
  
  var tail_gray: ViewStyle = js.native
  
  var tail_last: ViewStyle = js.native
  
  var title_l: TextStyle = js.native
  
  var title_s: TextStyle = js.native
}
object StepsStyle {
  
  @scala.inline
  def apply(
    content_l: ViewStyle,
    content_s: ViewStyle,
    content_s_h: ViewStyle,
    description_l: TextStyle,
    description_s: TextStyle,
    head_blue_l: ViewStyle,
    head_blue_s: ViewStyle,
    head_default_l: ViewStyle,
    head_default_s: ViewStyle,
    head_gray_l: ViewStyle,
    head_gray_s: ViewStyle,
    head_red_l: ViewStyle,
    head_red_s: ViewStyle,
    icon_l: TextStyle,
    icon_s: TextStyle,
    tail_blue: ViewStyle,
    tail_default_l: ViewStyle,
    tail_default_s: ViewStyle,
    tail_default_s_h: ViewStyle,
    tail_error: ViewStyle,
    tail_gray: ViewStyle,
    tail_last: ViewStyle,
    title_l: TextStyle,
    title_s: TextStyle
  ): StepsStyle = {
    val __obj = js.Dynamic.literal(content_l = content_l.asInstanceOf[js.Any], content_s = content_s.asInstanceOf[js.Any], content_s_h = content_s_h.asInstanceOf[js.Any], description_l = description_l.asInstanceOf[js.Any], description_s = description_s.asInstanceOf[js.Any], head_blue_l = head_blue_l.asInstanceOf[js.Any], head_blue_s = head_blue_s.asInstanceOf[js.Any], head_default_l = head_default_l.asInstanceOf[js.Any], head_default_s = head_default_s.asInstanceOf[js.Any], head_gray_l = head_gray_l.asInstanceOf[js.Any], head_gray_s = head_gray_s.asInstanceOf[js.Any], head_red_l = head_red_l.asInstanceOf[js.Any], head_red_s = head_red_s.asInstanceOf[js.Any], icon_l = icon_l.asInstanceOf[js.Any], icon_s = icon_s.asInstanceOf[js.Any], tail_blue = tail_blue.asInstanceOf[js.Any], tail_default_l = tail_default_l.asInstanceOf[js.Any], tail_default_s = tail_default_s.asInstanceOf[js.Any], tail_default_s_h = tail_default_s_h.asInstanceOf[js.Any], tail_error = tail_error.asInstanceOf[js.Any], tail_gray = tail_gray.asInstanceOf[js.Any], tail_last = tail_last.asInstanceOf[js.Any], title_l = title_l.asInstanceOf[js.Any], title_s = title_s.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsStyle]
  }
  
  @scala.inline
  implicit class StepsStyleOps[Self <: StepsStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent_l(value: ViewStyle): Self = this.set("content_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_s(value: ViewStyle): Self = this.set("content_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_s_h(value: ViewStyle): Self = this.set("content_s_h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_l(value: TextStyle): Self = this.set("description_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_s(value: TextStyle): Self = this.set("description_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_blue_l(value: ViewStyle): Self = this.set("head_blue_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_blue_s(value: ViewStyle): Self = this.set("head_blue_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_default_l(value: ViewStyle): Self = this.set("head_default_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_default_s(value: ViewStyle): Self = this.set("head_default_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_gray_l(value: ViewStyle): Self = this.set("head_gray_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_gray_s(value: ViewStyle): Self = this.set("head_gray_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_red_l(value: ViewStyle): Self = this.set("head_red_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead_red_s(value: ViewStyle): Self = this.set("head_red_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon_l(value: TextStyle): Self = this.set("icon_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon_s(value: TextStyle): Self = this.set("icon_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_blue(value: ViewStyle): Self = this.set("tail_blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_default_l(value: ViewStyle): Self = this.set("tail_default_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_default_s(value: ViewStyle): Self = this.set("tail_default_s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_default_s_h(value: ViewStyle): Self = this.set("tail_default_s_h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_error(value: ViewStyle): Self = this.set("tail_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_gray(value: ViewStyle): Self = this.set("tail_gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTail_last(value: ViewStyle): Self = this.set("tail_last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_l(value: TextStyle): Self = this.set("title_l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_s(value: TextStyle): Self = this.set("title_s", value.asInstanceOf[js.Any])
  }
}
