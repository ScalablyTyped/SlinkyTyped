package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.closable
import typingsSlinky.antdMobileRn.antdMobileRnStrings.link
import typingsSlinky.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsSlinky.antdMobileRn.noticeBarIndexNativeMod.NoticeNativeProps
import typingsSlinky.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeBar {
  
  @JSImport("antd-mobile-rn", "NoticeBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.NoticeBar] {
    
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marqueeProps(value: MarqueeProps): this.type = set("marqueeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: closable | link): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: INoticeBarStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoticeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
