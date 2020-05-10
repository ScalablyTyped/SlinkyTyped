package typingsSlinky.materialUi

import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMuiTheme extends js.Object {
  var muiTheme: js.UndefOr[MuiTheme] = js.native
}

object AnonMuiTheme {
  @scala.inline
  def apply(): AnonMuiTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMuiTheme]
  }
  @scala.inline
  implicit class AnonMuiThemeOps[Self <: AnonMuiTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuiTheme(value: MuiTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muiTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuiTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muiTheme")(js.undefined)
        ret
    }
  }
  
}

