package typingsSlinky.materialUiStyles.anon

import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var theme: ThemeOfStyles[StylesType] = js.native
}

object Theme {
  @scala.inline
  def apply[StylesType](theme: ThemeOfStyles[StylesType]): Theme[StylesType] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[StylesType]]
  }
  @scala.inline
  implicit class ThemeOps[Self[stylestype] <: Theme[stylestype], StylesType] (val x: Self[StylesType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StylesType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StylesType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StylesType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StylesType] with Other]
    @scala.inline
    def withTheme(value: ThemeOfStyles[StylesType]): Self[StylesType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

