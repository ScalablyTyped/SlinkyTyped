package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsSlinky.antDesignReactNative.resultMod.ResultNativeProps
import typingsSlinky.antDesignReactNative.resultStyleMod.ResultStyle
import typingsSlinky.reactNative.mod.ImagePropertiesSourceOptions
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Result {
  
  @JSImport("@ant-design/react-native", "Result")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Result] {
    
    @scala.inline
    def buttonText(value: String): this.type = set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonType(value: primary | ghost): this.type = set("buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgReactElement(value: ReactElement): this.type = set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def img(value: ReactElement): this.type = set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imgUrlVarargs(value: ImageURISource*): this.type = set("imgUrl", js.Array(value :_*))
    
    @scala.inline
    def imgUrl(value: ImagePropertiesSourceOptions): this.type = set("imgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messageReactElement(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onButtonClick(value: /* e */ js.Any => Unit): this.type = set("onButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[ResultStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResultNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Result.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
