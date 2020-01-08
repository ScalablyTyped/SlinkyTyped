package typingsSlinky.figma

import typingsSlinky.figma.figmaMod._Global_.Action
import typingsSlinky.figma.figmaStrings.BACK
import typingsSlinky.figma.figmaStrings.CLOSE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BACK extends Action {
  val `type`: BACK | CLOSE
}

object Anon_BACK {
  @scala.inline
  def apply(`type`: BACK | CLOSE): Anon_BACK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BACK]
  }
}

