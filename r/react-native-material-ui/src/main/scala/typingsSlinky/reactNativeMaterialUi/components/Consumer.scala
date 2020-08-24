package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeMaterialUi.mod.ThemeConsumerProps
import typingsSlinky.reactNativeMaterialUi.mod.ThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeConsumerProps): Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer] = new Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: ThemeProps => ReactElement): Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Consumer](js.Array(this.component, __props.asInstanceOf[ThemeConsumerProps]))
  }
}

