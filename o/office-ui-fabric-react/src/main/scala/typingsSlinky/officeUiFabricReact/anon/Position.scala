package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.block
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var display: block
  var position: js.UndefOr[IPosition] = js.undefined
}

object Position {
  @scala.inline
  def apply(display: block, position: IPosition = null): Position = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

