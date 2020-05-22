package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomCenter extends js.Object {
  var bottom: typingsSlinky.plottable.plottableStrings.bottom
  var center: typingsSlinky.plottable.plottableStrings.center
  var top: typingsSlinky.plottable.plottableStrings.top
}

object BottomCenter {
  @scala.inline
  def apply(bottom: bottom, center: center, top: top): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomCenter]
  }
}

