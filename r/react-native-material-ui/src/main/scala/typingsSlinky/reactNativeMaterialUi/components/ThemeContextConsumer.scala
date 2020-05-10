package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeMaterialUi.mod.ThemeConsumerProps
import typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeContextConsumer {
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeConsumerProps): Default[tag.type, Consumer] = new Default[tag.type, Consumer](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ThemeContextConsumer.type): Default[tag.type, Consumer] = new Default[tag.type, Consumer](js.Array(this.component, js.Dictionary.empty))()
}

