package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiTheme extends js.Object {
  var muiTheme: js.UndefOr[typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme] = js.native
}

object MuiTheme {
  @scala.inline
  def apply(): MuiTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiTheme]
  }
  @scala.inline
  implicit class MuiThemeOps[Self <: MuiTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuiTheme(value: typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme): Self = {
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

