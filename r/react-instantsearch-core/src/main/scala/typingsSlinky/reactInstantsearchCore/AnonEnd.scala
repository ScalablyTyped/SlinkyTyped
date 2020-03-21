package typingsSlinky.reactInstantsearchCore

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var label: String | ReactElement
  var start: js.UndefOr[Double] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(label: String | ReactElement, end: Int | Double = null, start: Int | Double = null): AnonEnd = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

