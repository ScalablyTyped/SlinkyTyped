package typingsSlinky.figma

import typingsSlinky.figma.figmaStrings.MOUSE_DOWN
import typingsSlinky.figma.figmaStrings.MOUSE_ENTER
import typingsSlinky.figma.figmaStrings.MOUSE_LEAVE
import typingsSlinky.figma.figmaStrings.MOUSE_UP
import typingsSlinky.figma.mod._Global_.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends Trigger {
  val delay: Double
  val `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN
}

object AnonDelay {
  @scala.inline
  def apply(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): AnonDelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

