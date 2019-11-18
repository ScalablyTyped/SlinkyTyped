package typingsSlinky.atMaterialDashUiCore.snackbarSnackbarMod

import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarOrigin extends js.Object {
  var horizontal: left | center | right
  var vertical: top | bottom
}

object SnackbarOrigin {
  @scala.inline
  def apply(horizontal: left | center | right, vertical: top | bottom): SnackbarOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnackbarOrigin]
  }
}

