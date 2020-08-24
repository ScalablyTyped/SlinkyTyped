package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.activityIndicatorMod.ActivityIndicatorNativeProps
import typingsSlinky.antDesignReactNative.activityIndicatorStyleMod.ActivityIndicatorStyle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.large
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator {
  @JSImport("@ant-design/react-native", "ActivityIndicator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.ActivityIndicator] {
    @scala.inline
    def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: ActivityIndicatorStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def toast(value: Boolean): this.type = set("toast", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActivityIndicatorNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ActivityIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

