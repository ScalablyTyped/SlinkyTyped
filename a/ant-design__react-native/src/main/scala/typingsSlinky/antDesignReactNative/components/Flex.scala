package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.around
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.between
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.column
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.end
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.row
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.start
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsSlinky.antDesignReactNative.flexFlexMod.FlexProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("@ant-design/react-native", "Flex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Flex] {
    
    @scala.inline
    def align(value: start | center | end | baseline | stretch): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: row | `row-reverse` | column | `column-reverse`): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justify(value: start | end | center | between | around): this.type = set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPressIn(value: () => Unit): this.type = set("onPressIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPressOut(value: () => Unit): this.type = set("onPressOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def wrap(
      value: nowrap | typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
    ): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
