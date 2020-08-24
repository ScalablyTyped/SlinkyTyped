package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeMaterialUi.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("react-native-material-ui", "ThemeContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeProviderProps): Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Provider] = new Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Provider](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Provider.type): Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Provider] = new Default[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Provider](js.Array(this.component, js.Dictionary.empty))()
}

