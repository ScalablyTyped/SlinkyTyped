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
  def apply(theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
  @scala.inline
  implicit class MuiThemeProviderPropsOps[Self <: MuiThemeProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThemeFunction1(value: /* outer */ Theme | Null => Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTheme(value: Theme | (js.Function1[/* outer */ Theme | Null, Theme])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStylesGeneration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStylesGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStylesGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStylesGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsManager(value: Map[StylesCreator, Map[Theme, SheetManagerTheme]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsManager")(js.undefined)
        ret
    }
  }
  
}

