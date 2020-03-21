package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.separator
import typingsSlinky.atom.mod.ContextMenuOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends ContextMenuOptions {
  var `type`: separator
}

object AnonType {
  @scala.inline
  def apply(`type`: separator): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

