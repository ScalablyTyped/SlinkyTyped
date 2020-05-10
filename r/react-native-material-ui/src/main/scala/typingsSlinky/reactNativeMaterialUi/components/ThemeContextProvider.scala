package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeMaterialUi.mod.ThemeContext.Provider
import typingsSlinky.reactNativeMaterialUi.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeContextProvider {
  @JSImport("react-native-material-ui", "ThemeContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeProviderProps): Default[tag.type, Provider] = new Default[tag.type, Provider](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ThemeContextProvider.type): Default[tag.type, Provider] = new Default[tag.type, Provider](js.Array(this.component, js.Dictionary.empty))()
}

