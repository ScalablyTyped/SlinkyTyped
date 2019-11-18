package typingsSlinky.atMaterialDashUiCore.stylesMuiThemeProviderMod

import slinky.core.TagMod
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StylesCreator
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiThemeProviderProps extends js.Object {
  var children: TagMod[Any]
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var sheetsManager: js.UndefOr[Map[StylesCreator, Map[Theme, SheetManagerTheme]]] = js.undefined
  var theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null
  ): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
}

