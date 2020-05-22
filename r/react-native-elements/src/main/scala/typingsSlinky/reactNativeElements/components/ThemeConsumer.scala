package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeElements.mod.ThemeConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer {
  @JSImport("react-native-elements", "ThemeConsumer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ThemeConsumer[js.Any]]
  
  def withProps[T](p: ThemeConsumerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeConsumerProps[T]]))
  }
  implicit def make[T](companion: ThemeConsumer.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

