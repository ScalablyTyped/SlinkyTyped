package typingsSlinky.materialUiCore.snackbarSnackbarMod

import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.center
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarOrigin extends js.Object {
  var horizontal: left | center | right = js.native
  var vertical: top | bottom = js.native
}

object SnackbarOrigin {
  @scala.inline
  def apply(horizontal: left | center | right, vertical: top | bottom): SnackbarOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnackbarOrigin]
  }
}

