package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.tagMod.TagNativeProps
import typingsSlinky.antDesignReactNative.tagStyleMod.TagStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  @JSImport("@ant-design/react-native", "Tag")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Tag] {
    
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* selected */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[TagStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
