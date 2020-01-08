package typingsSlinky.reactDashJss.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.std.NonNullable
import typingsSlinky.theming.themingMod.DefaultTheme
import typingsSlinky.theming.themingMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashJss.reactDashJssMod.ThemeProvider] {
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    theme: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashJss.reactDashJssMod.ThemeProvider] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashJss.reactDashJssMod.ThemeProvider] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashJss.reactDashJssMod.ThemeProvider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ThemeProviderProps[DefaultTheme]
}

