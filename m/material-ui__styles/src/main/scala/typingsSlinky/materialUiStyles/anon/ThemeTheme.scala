package typingsSlinky.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeTheme[Theme] extends js.Object {
  var theme: Theme = js.native
}

object ThemeTheme {
  @scala.inline
  def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme[Theme]]
  }
  @scala.inline
  implicit class ThemeThemeOps[Self[theme] <: ThemeTheme[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withTheme(value: Theme): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

