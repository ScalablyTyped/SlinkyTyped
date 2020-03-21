package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterModifier extends _Modifier {
  var after: js.Date
}

object AfterModifier {
  @scala.inline
  def apply(after: js.Date): AfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AfterModifier]
  }
}

