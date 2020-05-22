package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.anon.Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditToolbar extends js.Object {
  var actions: Cancel
  var buttons: typingsSlinky.leafletDraw.anon.Edit
}

object EditToolbar {
  @scala.inline
  def apply(actions: Cancel, buttons: typingsSlinky.leafletDraw.anon.Edit): EditToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditToolbar]
  }
}

