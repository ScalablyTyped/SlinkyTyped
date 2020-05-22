package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.canvas
import typingsSlinky.plottable.plottableStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  var canvas: typingsSlinky.plottable.plottableStrings.canvas
  var svg: typingsSlinky.plottable.plottableStrings.svg
}

object Canvas {
  @scala.inline
  def apply(canvas: canvas, svg: svg): Canvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
}

