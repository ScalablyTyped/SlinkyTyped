package typingsSlinky.materialUiCore.muiThemeProviderMod

import slinky.core.TagMod
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.withStylesMod.StylesCreator
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiThemeProviderProps extends js.Object {
  var children: TagMod[Any] = js.native
  var disableStylesGeneration: js.UndefOr[Boolean] = js.native
  var sheetsManager: js.UndefOr[Map[StylesCreator, Map[Theme, SheetManagerTheme]]] = js.native
  var theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]) = js.native
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    children: TagMod[Any] = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null
  ): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.get.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
}

