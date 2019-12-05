package typingsSlinky.reactDashDayDashPicker.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeModifier extends _Modifier {
  var from: js.Date
  var to: js.Date
}

object RangeModifier {
  @scala.inline
  def apply(from: js.Date, to: js.Date): RangeModifier = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeModifier]
  }
}

