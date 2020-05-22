package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.separator
import typingsSlinky.atom.mod.ContextMenuOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends ContextMenuOptions {
  var `type`: separator
}

object Type {
  @scala.inline
  def apply(`type`: separator): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

