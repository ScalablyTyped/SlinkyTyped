package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.EASE_IN
import typingsSlinky.figma.figmaStrings.EASE_IN_AND_OUT
import typingsSlinky.figma.figmaStrings.EASE_OUT
import typingsSlinky.figma.figmaStrings.LINEAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  val `type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR
}

object Easing {
  @scala.inline
  def apply(`type`: EASE_IN | EASE_OUT | EASE_IN_AND_OUT | LINEAR): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
}

