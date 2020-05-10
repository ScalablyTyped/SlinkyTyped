package typingsSlinky.materialUiStyles

import typingsSlinky.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[_] */] extends js.Object {
  var name: Name = js.native
  var props: Props = js.native
  var theme: js.UndefOr[Theme] = js.native
}

object AnonName {
  @scala.inline
  def apply[Props, Name, Theme](name: Name, props: Props): AnonName[Props, Name, Theme] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName[Props, Name, Theme]]
  }
  @scala.inline
  implicit class AnonNameOps[Self[props, name, theme] <: AnonName[props, name, theme], Props, Name, Theme] (val x: Self[Props, Name, Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, Name, Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, Name, Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, Name, Theme]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, Name, Theme]) with Other]
    @scala.inline
    def withName(value: Name): Self[Props, Name, Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Props): Self[Props, Name, Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self[Props, Name, Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[Props, Name, Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

