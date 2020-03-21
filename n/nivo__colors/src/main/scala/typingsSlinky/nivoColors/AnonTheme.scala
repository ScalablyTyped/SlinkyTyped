package typingsSlinky.nivoColors

import typingsSlinky.nivoColors.mod._InheritedColorProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme
  extends _InheritedColorProp[js.Any] {
  var theme: String
}

object AnonTheme {
  @scala.inline
  def apply(theme: String): AnonTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTheme]
  }
}

