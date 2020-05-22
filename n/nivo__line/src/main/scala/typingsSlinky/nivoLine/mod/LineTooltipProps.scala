package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.anon.BorderColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineTooltipProps extends js.Object {
  var point: BorderColor
}

object LineTooltipProps {
  @scala.inline
  def apply(point: BorderColor): LineTooltipProps = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTooltipProps]
  }
}

