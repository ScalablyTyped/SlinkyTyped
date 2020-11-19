package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.link
import typingsSlinky.antDesignReactNative.marqueeMod.MarqueeProps
import typingsSlinky.antDesignReactNative.noticeBarMod.NoticeNativeProps
import typingsSlinky.antDesignReactNative.noticeBarStyleMod.NoticeBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeBar {
  
  @JSImport("@ant-design/react-native", "NoticeBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.NoticeBar] {
    
    @scala.inline
    def action(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marqueeProps(value: MarqueeProps): this.type = set("marqueeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: closable | link): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[NoticeBarStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NoticeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
