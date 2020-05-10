package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsSlinky.antDesignReactNative.stepsMod.StepsProps
import typingsSlinky.antDesignReactNative.stepsMod.default
import typingsSlinky.antDesignReactNative.stepsStyleMod.StepsStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  @JSImport("@ant-design/react-native/lib/steps", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def finishIcon(value: String): this.type = set("finishIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: Partial[StepsStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

