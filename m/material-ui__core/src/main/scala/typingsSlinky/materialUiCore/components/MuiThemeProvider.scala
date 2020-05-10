package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps
import typingsSlinky.materialUiCore.muiThemeProviderMod.SheetManagerTheme
import typingsSlinky.materialUiCore.muiThemeProviderMod.default
import typingsSlinky.materialUiCore.withStylesMod.StylesCreator
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider {
  @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disableStylesGeneration(value: Boolean): this.type = set("disableStylesGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def sheetsManager(value: Map[StylesCreator, Map[Theme, SheetManagerTheme]]): this.type = set("sheetsManager", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MuiThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MuiThemeProviderProps]))
  }
}

