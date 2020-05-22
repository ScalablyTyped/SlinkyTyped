package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.between
import typingsSlinky.plottable.plottableStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Between extends js.Object {
  var between: typingsSlinky.plottable.plottableStrings.between
  var center: typingsSlinky.plottable.plottableStrings.center
}

object Between {
  @scala.inline
  def apply(between: between, center: center): Between = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Between]
  }
}

