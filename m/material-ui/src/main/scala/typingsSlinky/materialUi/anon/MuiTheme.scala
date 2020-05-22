package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiTheme extends js.Object {
  var muiTheme: js.UndefOr[typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme] = js.undefined
}

object MuiTheme {
  @scala.inline
  def apply(muiTheme: typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme = null): MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiTheme]
  }
}

