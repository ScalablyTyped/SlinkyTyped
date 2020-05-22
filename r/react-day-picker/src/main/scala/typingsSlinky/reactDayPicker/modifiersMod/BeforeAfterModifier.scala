package typingsSlinky.reactDayPicker.modifiersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAfterModifier extends _Modifier {
  var after: js.Date
  var before: js.Date
}

object BeforeAfterModifier {
  @scala.inline
  def apply(after: js.Date, before: js.Date): BeforeAfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeAfterModifier]
  }
}

