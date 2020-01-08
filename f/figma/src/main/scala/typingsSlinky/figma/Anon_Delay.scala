package typingsSlinky.figma

import typingsSlinky.figma.figmaMod._Global_.Trigger
import typingsSlinky.figma.figmaStrings.MOUSE_DOWN
import typingsSlinky.figma.figmaStrings.MOUSE_ENTER
import typingsSlinky.figma.figmaStrings.MOUSE_LEAVE
import typingsSlinky.figma.figmaStrings.MOUSE_UP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends Trigger {
  val delay: Double
  val `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

