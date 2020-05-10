package typingsSlinky.materialUi.MaterialUI

import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeWrapperProps extends js.Object {
  var theme: MuiTheme = js.native
}

object ThemeWrapperProps {
  @scala.inline
  def apply(theme: MuiTheme): ThemeWrapperProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeWrapperProps]
  }
  @scala.inline
  implicit class ThemeWrapperPropsOps[Self <: ThemeWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: MuiTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

