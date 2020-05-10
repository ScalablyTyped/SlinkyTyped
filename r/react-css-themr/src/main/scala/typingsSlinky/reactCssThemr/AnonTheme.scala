package typingsSlinky.reactCssThemr

import typingsSlinky.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTheme extends js.Object {
  var theme: TReactCSSThemrTheme = js.native
}

object AnonTheme {
  @scala.inline
  def apply(theme: TReactCSSThemrTheme): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme]
  }
  @scala.inline
  implicit class AnonThemeOps[Self <: AnonTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: TReactCSSThemrTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

