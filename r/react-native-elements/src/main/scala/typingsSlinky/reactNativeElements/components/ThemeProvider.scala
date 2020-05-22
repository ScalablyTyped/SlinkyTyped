package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeElements.mod.Theme
import typingsSlinky.reactNativeElements.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  @JSImport("react-native-elements", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ThemeProvider[js.Any]] {
    @scala.inline
    def theme(value: Theme[T]): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  implicit def make[T](companion: ThemeProvider.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

