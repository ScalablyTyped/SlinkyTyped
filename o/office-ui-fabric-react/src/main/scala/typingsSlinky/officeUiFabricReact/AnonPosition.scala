package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.block
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var display: block
  var position: js.UndefOr[IPosition] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(display: block, position: IPosition = null): AnonPosition = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

