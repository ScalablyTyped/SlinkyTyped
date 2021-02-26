package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.md
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xl
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xs
import typingsSlinky.antDesignReactNative.whiteSpaceMod.WhiteSpaceProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WhiteSpace {
  
  @JSImport("@ant-design/react-native", "WhiteSpace")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.WhiteSpace] {
    
    @scala.inline
    def size(value: xs | sm | md | lg | xl): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: WhiteSpace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WhiteSpaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
