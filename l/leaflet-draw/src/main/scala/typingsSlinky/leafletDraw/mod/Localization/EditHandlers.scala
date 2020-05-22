package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.anon.TooltipText
import typingsSlinky.leafletDraw.anon.TooltipTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditHandlers extends js.Object {
  var edit: TooltipText
  var remove: TooltipTextString
}

object EditHandlers {
  @scala.inline
  def apply(edit: TooltipText, remove: TooltipTextString): EditHandlers = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHandlers]
  }
}

