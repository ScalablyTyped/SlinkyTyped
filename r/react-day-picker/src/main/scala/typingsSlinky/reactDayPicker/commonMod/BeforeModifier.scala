package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeModifier extends _Modifier {
  var before: js.Date
}

object BeforeModifier {
  @scala.inline
  def apply(before: js.Date): BeforeModifier = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeforeModifier]
  }
}

