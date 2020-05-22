package typingsSlinky.nivoLine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var x: String | Double
  var xFormatted: String | Double
  var y: Double
  var yFormatted: String | Double
  var yStacked: Double
}

object Color {
  @scala.inline
  def apply(
    color: String,
    x: String | Double,
    xFormatted: String | Double,
    y: Double,
    yFormatted: String | Double,
    yStacked: Double
  ): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any], yStacked = yStacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

