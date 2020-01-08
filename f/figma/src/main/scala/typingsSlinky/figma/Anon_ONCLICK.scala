package typingsSlinky.figma

import typingsSlinky.figma.figmaMod._Global_.Trigger
import typingsSlinky.figma.figmaStrings.ON_CLICK
import typingsSlinky.figma.figmaStrings.ON_DRAG
import typingsSlinky.figma.figmaStrings.ON_HOVER
import typingsSlinky.figma.figmaStrings.ON_PRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ONCLICK extends Trigger {
  val `type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG
}

object Anon_ONCLICK {
  @scala.inline
  def apply(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): Anon_ONCLICK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ONCLICK]
  }
}

