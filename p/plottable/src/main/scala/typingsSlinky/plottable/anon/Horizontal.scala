package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.horizontal
import typingsSlinky.plottable.plottableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var horizontal: typingsSlinky.plottable.plottableStrings.horizontal
  var vertical: typingsSlinky.plottable.plottableStrings.vertical
}

object Horizontal {
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

