package typingsSlinky.reactThemeableTs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactThemeableTs.themeProviderMod.IThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: IThemeProviderProps): Default[tag.type, typingsSlinky.reactThemeableTs.mod.ThemeProvider] = new Default[tag.type, typingsSlinky.reactThemeableTs.mod.ThemeProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(reactThemeable: js.Any): Default[tag.type, typingsSlinky.reactThemeableTs.mod.ThemeProvider] = {
    val __props = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactThemeableTs.mod.ThemeProvider](js.Array(this.component, __props.asInstanceOf[IThemeProviderProps]))
  }
}

