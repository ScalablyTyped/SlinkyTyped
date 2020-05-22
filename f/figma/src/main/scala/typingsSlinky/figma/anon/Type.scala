package typingsSlinky.figma.anon

import typingsSlinky.figma.figmaStrings.BACK
import typingsSlinky.figma.figmaStrings.CLOSE
import typingsSlinky.figma.mod.global.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends Action {
  val `type`: BACK | CLOSE
}

object Type {
  @scala.inline
  def apply(`type`: BACK | CLOSE): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

